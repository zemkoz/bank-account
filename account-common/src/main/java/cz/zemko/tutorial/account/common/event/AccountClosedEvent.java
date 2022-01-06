package cz.zemko.tutorial.account.common.event;

import cz.zemko.tutorial.cqrs.core.event.AbstractEvent;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class AccountClosedEvent extends AbstractEvent {
}
