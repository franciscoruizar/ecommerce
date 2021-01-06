package ar.franciscoruiz.inventories.suppliers.domain;

import ar.franciscoruiz.shared.domain.PhoneNumberMother;

public final class SupplierPhoneNumberMother {
    public static SupplierPhoneNumber create(String value) {
        return new SupplierPhoneNumber(value);
    }

    public static SupplierPhoneNumber random() {
        return create(PhoneNumberMother.random());
    }
}
