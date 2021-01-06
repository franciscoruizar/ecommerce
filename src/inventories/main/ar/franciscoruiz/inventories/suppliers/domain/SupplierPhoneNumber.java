package ar.franciscoruiz.inventories.suppliers.domain;

import ar.franciscoruiz.shared.domain.vo.StringValueObject;

public final class SupplierPhoneNumber extends StringValueObject {
    public SupplierPhoneNumber(String value) {
        super(value);
    }

    private SupplierPhoneNumber() {
        super("");
    }
}
