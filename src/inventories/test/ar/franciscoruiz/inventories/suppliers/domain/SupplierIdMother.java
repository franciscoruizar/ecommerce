package ar.franciscoruiz.inventories.suppliers.domain;

import ar.franciscoruiz.shared.domain.UuidMother;

public final class SupplierIdMother {
    public static SupplierId create(String value) {
        return new SupplierId(value);
    }

    public static SupplierId random() {
        return create(UuidMother.random());
    }
}
