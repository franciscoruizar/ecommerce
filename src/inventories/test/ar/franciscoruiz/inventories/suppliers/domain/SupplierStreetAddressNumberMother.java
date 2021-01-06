package ar.franciscoruiz.inventories.suppliers.domain;

import ar.franciscoruiz.shared.domain.StreetAddressMother;

public final class SupplierStreetAddressNumberMother {
    public static SupplierStreetAddressNumber create(String value) {
        return new SupplierStreetAddressNumber(value);
    }

    public static SupplierStreetAddressNumber random() {
        return create(StreetAddressMother.random());
    }
}
