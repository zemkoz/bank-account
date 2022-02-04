package cz.zemko.tutorial.account.cmd.infrastructure;

import cz.zemko.tutorial.cqrs.core.command.AbstractCommand;
import cz.zemko.tutorial.cqrs.core.command.CommandHandlerMethod;
import cz.zemko.tutorial.cqrs.core.infrastructure.CommandDispatcher;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AccountCommandDispatcher implements CommandDispatcher {
    private final Map<Class<? extends AbstractCommand>, CommandHandlerMethod<? extends AbstractCommand>> routes = new HashMap<>();

    @Override
    public <T extends AbstractCommand> void registerCommand(Class<T> commandClass, CommandHandlerMethod<T> handler) {

        if (routes.containsKey(commandClass)) {
            throw new IllegalStateException("Command handler for command '" + commandClass + " was already registered before.");
        }

        routes.put(commandClass, handler);
    }

    @Override
    public <T extends AbstractCommand> void send(T command) {
        var handler = (CommandHandlerMethod<T>) routes.get(command.getClass());
        if (handler == null) {
            throw new IllegalStateException("No command handler was found.");
        }
        handler.handle(command);
    }
}
