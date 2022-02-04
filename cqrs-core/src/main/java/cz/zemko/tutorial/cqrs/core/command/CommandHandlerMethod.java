package cz.zemko.tutorial.cqrs.core.command;

@FunctionalInterface
public interface CommandHandlerMethod<T extends AbstractCommand> {
    void handle(T command);
}
