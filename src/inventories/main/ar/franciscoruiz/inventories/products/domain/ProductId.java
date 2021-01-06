package ar.franciscoruiz.inventories.products.domain;

import ar.franciscoruiz.shared.domain.Identifier;

public final class ProductId extends Identifier {
    public ProductId(String value) {
        super(value);
    }

    private ProductId() {
        super(null);
    }
}
