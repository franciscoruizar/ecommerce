package ar.franciscoruiz.inventories.categories.application;

import ar.franciscoruiz.inventories.categories.domain.CategoryDescription;
import ar.franciscoruiz.inventories.categories.domain.CategoryDescriptionMother;
import ar.franciscoruiz.inventories.categories.domain.CategoryId;
import ar.franciscoruiz.inventories.categories.domain.CategoryIdMother;

public final class CategoryResponseMother {
    public static CategoryResponse create(CategoryId id, CategoryDescription description) {
        return new CategoryResponse(id.value(), description.value());
    }

    public static CategoryResponse random() {
        return create(CategoryIdMother.random(), CategoryDescriptionMother.random());
    }
}
