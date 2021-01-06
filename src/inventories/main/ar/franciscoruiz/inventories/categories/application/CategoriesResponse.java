package ar.franciscoruiz.inventories.categories.application;

import ar.franciscoruiz.shared.domain.bus.query.Query;

import java.util.List;

public final class CategoriesResponse implements Query {
    private final List<CategoryResponse> values;

    public CategoriesResponse(List<CategoryResponse> values) {
        this.values = values;
    }

    public List<CategoryResponse> values() {
        return values;
    }
}
