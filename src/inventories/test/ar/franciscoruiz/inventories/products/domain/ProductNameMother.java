package ar.franciscoruiz.inventories.products.domain;

import ar.franciscoruiz.shared.domain.WordMother;

public final class ProductNameMother {
    public static ProductName create(String value) {
        return new ProductName(value);
    }

    public static ProductName random() {
        return create(WordMother.random());
    }
}
