package ar.franciscoruiz.inventories.categories.application.creator;

import ar.franciscoruiz.inventories.categories.domain.CategoryDescription;
import ar.franciscoruiz.inventories.categories.domain.CategoryId;
import ar.franciscoruiz.shared.domain.Service;
import ar.franciscoruiz.shared.domain.bus.command.CommandHandler;

@Service
public final class CreateCategoryCommandHandler implements CommandHandler<CreateCategoryCommand> {
    private final CategoryCreator creator;

    public CreateCategoryCommandHandler(CategoryCreator creator) {
        this.creator = creator;
    }

    @Override
    public void handle(CreateCategoryCommand command) {
        CategoryId          id          = new CategoryId(command.id());
        CategoryDescription description = new CategoryDescription(command.description());

        this.creator.create(id, description);
    }
}
