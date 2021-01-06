package ar.franciscoruiz.inventories.categories.domain;

import ar.franciscoruiz.shared.domain.Identifier;

public final class CategoryId extends Identifier {
    public CategoryId(String value) {
        super(value);
    }

    private CategoryId() {
        super(null);
    }
}
