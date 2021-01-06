package ar.franciscoruiz.inventories.categories.domain;

import ar.franciscoruiz.shared.domain.UuidMother;

public final class CategoryIdMother {
    public static CategoryId create(String value) {
        return new CategoryId(value);
    }

    public static CategoryId random() {
        return create(UuidMother.random());
    }
}
