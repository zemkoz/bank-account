package cz.zemko.tutorial.account.cmd.command;

import cz.zemko.tutorial.cqrs.core.command.AbstractCommand;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class DepositFundsCommand extends AbstractCommand {
    private double amount;
}
