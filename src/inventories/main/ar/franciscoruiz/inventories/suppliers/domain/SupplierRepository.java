package ar.franciscoruiz.inventories.suppliers.domain;

import java.util.Optional;

public interface SupplierRepository {
    void save(Supplier supplier);

    Optional<Supplier> search(SupplierId id);
}
