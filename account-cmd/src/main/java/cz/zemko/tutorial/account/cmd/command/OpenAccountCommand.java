package cz.zemko.tutorial.account.cmd.command;

import cz.zemko.tutorial.account.common.dto.AccountType;
import cz.zemko.tutorial.cqrs.core.command.AbstractCommand;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class OpenAccountCommand extends AbstractCommand {
    private String accountHolder;
    private AccountType accountType;
    private double balance;
}
