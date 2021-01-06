package ar.franciscoruiz.inventories.categories.domain;

import ar.franciscoruiz.inventories.products.domain.ProductId;
import ar.franciscoruiz.shared.domain.DomainError;

public final class CategoryNotExist extends DomainError {
    public CategoryNotExist(ProductId id) {
        super("category_not_exist", String.format("The category <%s> doesn't exist", id.value()));
    }
}
