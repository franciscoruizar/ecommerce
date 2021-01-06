package ar.franciscoruiz.inventories.categories.application.finder;

import ar.franciscoruiz.shared.domain.bus.query.Query;

public final class CategoryFinderQuery implements Query {
    private final String id;

    public CategoryFinderQuery(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }
}
