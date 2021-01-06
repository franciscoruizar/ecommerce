package ar.franciscoruiz.inventories.products.domain;

import ar.franciscoruiz.shared.domain.BarcodeMother;

public final class ProductBarcodeMother {
    public static ProductBarcode create(String value) {
        return new ProductBarcode(value);
    }

    public static ProductBarcode random() {
        return create(BarcodeMother.random());
    }
}
