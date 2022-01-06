package cz.zemko.tutorial.account.common.event;

import cz.zemko.tutorial.account.common.dto.AccountType;
import cz.zemko.tutorial.cqrs.core.event.AbstractEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AccountOpenedEvent extends AbstractEvent {
    private String accountHolder;
    private AccountType accountType;
    private Date creationDate;
    private double balance;

}
