package cz.zemko.tutorial.account.common.event;

import cz.zemko.tutorial.cqrs.core.event.AbstractEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FundsWithdrawnEvent extends AbstractEvent {
    private double amount;
}
