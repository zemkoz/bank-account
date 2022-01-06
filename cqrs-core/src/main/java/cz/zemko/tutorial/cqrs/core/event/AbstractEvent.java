package cz.zemko.tutorial.cqrs.core.event;

import cz.zemko.tutorial.cqrs.core.message.AbstractMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AbstractEvent extends AbstractMessage {
    private int version;
}
