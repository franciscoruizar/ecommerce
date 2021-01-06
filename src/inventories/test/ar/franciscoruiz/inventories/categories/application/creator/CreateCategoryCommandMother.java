package ar.franciscoruiz.inventories.categories.application.creator;

import ar.franciscoruiz.inventories.categories.domain.CategoryDescription;
import ar.franciscoruiz.inventories.categories.domain.CategoryDescriptionMother;
import ar.franciscoruiz.inventories.categories.domain.CategoryId;
import ar.franciscoruiz.inventories.categories.domain.CategoryIdMother;

public final class CreateCategoryCommandMother {
    public static CreateCategoryCommand create(CategoryId id, CategoryDescription name) {
        return new CreateCategoryCommand(id.value(), name.value());
    }

    public static CreateCategoryCommand random() {
        return create(CategoryIdMother.random(), CategoryDescriptionMother.random());
    }
}
