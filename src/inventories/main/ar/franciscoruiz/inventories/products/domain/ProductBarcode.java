package ar.franciscoruiz.inventories.products.domain;

import ar.franciscoruiz.shared.domain.vo.StringValueObject;

public final class ProductBarcode extends StringValueObject {
    public ProductBarcode(String value) {
        super(value);
    }

    private ProductBarcode() {
        super(null);
    }
}
