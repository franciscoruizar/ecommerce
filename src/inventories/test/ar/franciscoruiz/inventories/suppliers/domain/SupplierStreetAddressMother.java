package ar.franciscoruiz.inventories.suppliers.domain;

import ar.franciscoruiz.shared.domain.StreetAddressMother;

public final class SupplierStreetAddressMother {
    public static SupplierStreetAddress create(String value) {
        return new SupplierStreetAddress(value);
    }

    public static SupplierStreetAddress random() {
        return create(StreetAddressMother.random());
    }
}
