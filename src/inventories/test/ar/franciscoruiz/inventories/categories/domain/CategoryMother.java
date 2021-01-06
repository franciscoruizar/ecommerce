package ar.franciscoruiz.inventories.categories.domain;

import ar.franciscoruiz.inventories.categories.application.creator.CreateCategoryCommand;

public final class CategoryMother {
    public static Category create(CategoryId id, CategoryDescription description) {
        return new Category(id, description);
    }

    public static Category random() {
        return create(
            CategoryIdMother.random(),
            CategoryDescriptionMother.random()
        );
    }

    public static Category fromRequest(CreateCategoryCommand command){
        return create(new CategoryId(command.id()), new CategoryDescription(command.description()));
    }
}
