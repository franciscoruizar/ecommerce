package ar.franciscoruiz.inventories.suppliers.domain;

import ar.franciscoruiz.shared.domain.vo.StringValueObject;

public final class SupplierName extends StringValueObject {
    public SupplierName(String value) {
        super(value);
    }

    private SupplierName() {
        super("");
    }
}
