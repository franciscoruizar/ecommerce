package ar.franciscoruiz.inventories.suppliers.domain;

import ar.franciscoruiz.shared.domain.vo.StringValueObject;

public final class SupplierStreetAddress extends StringValueObject {
    public SupplierStreetAddress(String value) {
        super(value);
    }

    private SupplierStreetAddress() {
        super("");
    }
}
