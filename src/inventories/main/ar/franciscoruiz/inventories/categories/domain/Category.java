package ar.franciscoruiz.inventories.categories.domain;

import java.util.Objects;

public final class Category {
    private final CategoryId id;
    private final CategoryDescription description;

    public Category(CategoryId id, CategoryDescription description) {
        this.id          = id;
        this.description = description;
    }

    public Category() {
        this.id          = null;
        this.description = null;
    }

    public CategoryId id() {
        return id;
    }

    public CategoryDescription description() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Category category = (Category) o;
        return Objects.equals(id, category.id) && Objects.equals(description, category.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }
}
