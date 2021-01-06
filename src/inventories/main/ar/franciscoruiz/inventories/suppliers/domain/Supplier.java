package ar.franciscoruiz.inventories.suppliers.domain;

import java.util.Objects;

public final class Supplier {
    private final SupplierId           id;
    private final SupplierName         name;
    private final SupplierPhoneNumber   phoneNumber;
    private final SupplierStreetAddress       street;
    private final SupplierStreetAddressNumber streetNumber;
    private final SupplierZipCode             zipCode;

    public Supplier(
        SupplierId id,
        SupplierName name,
        SupplierPhoneNumber phoneNumber,
        SupplierStreetAddress street,
        SupplierStreetAddressNumber streetNumber,
        SupplierZipCode zipCode
    ) {
        this.id           = id;
        this.name         = name;
        this.phoneNumber  = phoneNumber;
        this.street       = street;
        this.streetNumber = streetNumber;
        this.zipCode      = zipCode;
    }

    public Supplier() {
        this.id           = null;
        this.name         = null;
        this.phoneNumber  = null;
        this.street       = null;
        this.streetNumber = null;
        this.zipCode      = null;
    }

    public SupplierId id() {
        return id;
    }

    public SupplierName name() {
        return name;
    }

    public SupplierPhoneNumber phoneNumber() {
        return phoneNumber;
    }

    public SupplierStreetAddress street() {
        return street;
    }

    public SupplierStreetAddressNumber streetNumber() {
        return streetNumber;
    }

    public SupplierZipCode zipCode() {
        return zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Supplier supplier = (Supplier) o;
        return Objects.equals(id, supplier.id) && Objects.equals(name, supplier.name) && Objects.equals(phoneNumber, supplier.phoneNumber) && Objects.equals(street, supplier.street) && Objects.equals(streetNumber, supplier.streetNumber) && Objects.equals(zipCode, supplier.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phoneNumber, street, streetNumber, zipCode);
    }
}
