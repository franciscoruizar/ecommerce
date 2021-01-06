package ar.franciscoruiz.inventories.products.domain;

import ar.franciscoruiz.shared.domain.BooleanMother;

public final class ProductStatusMother {
    public static ProductStatus create(Boolean value) {
        return new ProductStatus(value);
    }

    public static ProductStatus random() {
        return create(BooleanMother.random());
    }
}
