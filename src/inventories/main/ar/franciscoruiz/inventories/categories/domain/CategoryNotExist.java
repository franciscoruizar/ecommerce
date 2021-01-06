package ar.franciscoruiz.inventories.categories.domain;

import ar.franciscoruiz.shared.domain.DomainError;

public final class CategoryNotExist extends DomainError {
    public CategoryNotExist(CategoryId id) {
        super("category_not_exist", String.format("The category <%s> doesn't exist", id.value()));
    }
}
