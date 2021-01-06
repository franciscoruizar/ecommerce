package ar.franciscoruiz.inventories.categories.domain;

import java.util.Optional;

public interface CategoryRepository {
    void save(Category category);

    Optional<Category> search(CategoryId id);
}
