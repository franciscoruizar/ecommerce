package ar.franciscoruiz.inventories.categories.application.creator;

import ar.franciscoruiz.inventories.categories.domain.Category;
import ar.franciscoruiz.inventories.categories.domain.CategoryDescription;
import ar.franciscoruiz.inventories.categories.domain.CategoryId;
import ar.franciscoruiz.inventories.categories.domain.CategoryRepository;
import ar.franciscoruiz.shared.domain.Service;

@Service
public final class CategoryCreator {
    private final CategoryRepository repository;

    public CategoryCreator(CategoryRepository repository) {
        this.repository = repository;
    }

    public void create(CategoryId id, CategoryDescription description){
        Category category = new Category(id, description);

        this.repository.save(category);
    }
}
