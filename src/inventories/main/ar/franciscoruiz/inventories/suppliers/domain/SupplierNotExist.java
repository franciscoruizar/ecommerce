package ar.franciscoruiz.inventories.suppliers.domain;

import ar.franciscoruiz.shared.domain.DomainError;

public final class SupplierNotExist extends DomainError {
    public SupplierNotExist(SupplierId id) {
        super("supplier_not_exist", String.format("The supplier <%s> doesn't exist", id.value()));
    }
}
