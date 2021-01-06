package ar.franciscoruiz.inventories.suppliers.domain;

import ar.franciscoruiz.shared.domain.WordMother;

public final class SupplierZipCodeMother {
    public static SupplierZipCode create(String value) {
        return new SupplierZipCode(value);
    }

    public static SupplierZipCode random() {
        return create(WordMother.random());
    }
}
