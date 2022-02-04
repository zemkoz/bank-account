package cz.zemko.tutorial.cqrs.core.infrastructure;

import cz.zemko.tutorial.cqrs.core.command.AbstractCommand;
import cz.zemko.tutorial.cqrs.core.command.CommandHandlerMethod;

public interface CommandDispatcher {
    <T extends AbstractCommand> void registerCommand(Class<T> commandClass, CommandHandlerMethod<T> handler);

    <T extends AbstractCommand> void send(T command);
}
