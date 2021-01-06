package ar.franciscoruiz.inventories.suppliers.domain;

public final class SupplierMother {
    public static Supplier create(
        SupplierId id,
        SupplierName name,
        SupplierPhoneNumber phoneNumber,
        SupplierStreetAddress street,
        SupplierStreetAddressNumber streetNumber,
        SupplierZipCode zipCode
    ) {
        return new Supplier(id, name, phoneNumber, street, streetNumber, zipCode);
    }

    public static Supplier random() {
        return create(
            SupplierIdMother.random(),
            SupplierNameMother.random(),
            SupplierPhoneNumberMother.random(),
            SupplierStreetAddressMother.random(),
            SupplierStreetAddressNumberMother.random(),
            SupplierZipCodeMother.random()
        );
    }
}
