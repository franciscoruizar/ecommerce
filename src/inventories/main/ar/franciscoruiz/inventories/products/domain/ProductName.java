package ar.franciscoruiz.inventories.products.domain;

import ar.franciscoruiz.shared.domain.vo.StringValueObject;

public final class ProductName extends StringValueObject {
    public ProductName(String value) {
        super(value);
    }

    private ProductName() {
        super("");
    }
}
