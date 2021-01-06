package ar.franciscoruiz.inventories.categories.application;

import ar.franciscoruiz.inventories.categories.domain.Category;
import ar.franciscoruiz.shared.domain.bus.query.Response;

public final class CategoryResponse implements Response {
    private final String id;
    private final String description;

    public CategoryResponse(String id, String description) {
        this.id          = id;
        this.description = description;
    }

    public static CategoryResponse fromAggregate(Category entity) {
        return new CategoryResponse(entity.id().value(), entity.description().value());
    }

    public String id() {
        return id;
    }

    public String description() {
        return description;
    }
}
