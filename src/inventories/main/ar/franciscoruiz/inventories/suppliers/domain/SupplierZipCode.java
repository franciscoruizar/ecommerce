package ar.franciscoruiz.inventories.suppliers.domain;

import ar.franciscoruiz.shared.domain.vo.StringValueObject;

public final class SupplierZipCode extends StringValueObject {
    public SupplierZipCode(String value) {
        super(value);
    }

    public SupplierZipCode() {
        super("");
    }
}
