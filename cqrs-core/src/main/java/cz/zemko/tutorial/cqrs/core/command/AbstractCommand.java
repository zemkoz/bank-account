package cz.zemko.tutorial.cqrs.core.command;

import cz.zemko.tutorial.cqrs.core.message.AbstractMessage;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class AbstractCommand extends AbstractMessage {
    public AbstractCommand(String id) {
        super(id);
    }
}
