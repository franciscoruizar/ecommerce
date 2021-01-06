package ar.franciscoruiz.inventories.suppliers.domain;

import ar.franciscoruiz.shared.domain.vo.StringValueObject;

public final class SupplierStreetAddressNumber extends StringValueObject {
    public SupplierStreetAddressNumber(String value) {
        super(value);
    }

    public SupplierStreetAddressNumber() {
        super("");
    }
}
