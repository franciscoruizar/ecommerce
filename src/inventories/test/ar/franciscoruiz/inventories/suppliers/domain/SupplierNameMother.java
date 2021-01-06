package ar.franciscoruiz.inventories.suppliers.domain;

import ar.franciscoruiz.inventories.products.domain.ProductName;
import ar.franciscoruiz.shared.domain.WordMother;

public final class SupplierNameMother {
    public static SupplierName create(String value) {
        return new SupplierName(value);
    }

    public static SupplierName random() {
        return create(WordMother.random());
    }
}
