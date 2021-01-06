package ar.franciscoruiz.inventories.products.domain;

import ar.franciscoruiz.shared.domain.vo.DoubleValueObject;

public final class ProductPrice extends DoubleValueObject {
    public ProductPrice(Double value) {
        super(value);
    }

    private ProductPrice() {
        super(0.0);
    }
}
