package ar.franciscoruiz.inventories.categories.domain;

import ar.franciscoruiz.shared.domain.vo.StringValueObject;

public final class CategoryDescription extends StringValueObject {
    public CategoryDescription(String value) {
        super(value);
    }

    private CategoryDescription() {
        super(null);
    }
}
