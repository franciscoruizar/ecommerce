package ar.franciscoruiz.inventories.categories.domain;

import ar.franciscoruiz.shared.domain.WordMother;

public final class CategoryDescriptionMother {
    public static CategoryDescription create(String value) {
        return new CategoryDescription(value);
    }

    public static CategoryDescription random() {
        return create(WordMother.random());
    }
}
