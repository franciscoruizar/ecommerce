package ar.franciscoruiz.inventories.products.domain;

import ar.franciscoruiz.shared.domain.vo.BooleanValueObject;

public final class ProductStatus extends BooleanValueObject {
    public ProductStatus(Boolean value) {
        super(value);
    }

    private ProductStatus() {
        super(false);
    }
}
