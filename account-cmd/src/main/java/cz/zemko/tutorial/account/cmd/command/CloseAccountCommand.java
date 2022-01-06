package cz.zemko.tutorial.account.cmd.command;

import cz.zemko.tutorial.cqrs.core.command.AbstractCommand;

public class CloseAccountCommand extends AbstractCommand {
    public CloseAccountCommand(String id) {
        super(id);
    }
}
