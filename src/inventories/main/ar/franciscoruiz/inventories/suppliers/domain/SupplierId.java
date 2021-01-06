package ar.franciscoruiz.inventories.suppliers.domain;

import ar.franciscoruiz.shared.domain.Identifier;

public final class SupplierId extends Identifier {
    public SupplierId(String value) {
        super(value);
    }

    private SupplierId() {
        super(null);
    }
}
