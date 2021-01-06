package ar.franciscoruiz.inventories.categories.application.creator;

import ar.franciscoruiz.shared.domain.bus.command.Command;

public final class CreateCategoryCommand implements Command {
    private final String id;
    private final String description;

    public CreateCategoryCommand(String id, String description) {
        this.id          = id;
        this.description = description;
    }

    public String id() {
        return id;
    }

    public String description() {
        return description;
    }
}
