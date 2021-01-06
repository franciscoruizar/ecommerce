package ar.franciscoruiz.inventories.categories.application.finder;

import ar.franciscoruiz.inventories.categories.application.CategoryResponse;
import ar.franciscoruiz.inventories.categories.domain.Category;
import ar.franciscoruiz.inventories.categories.domain.CategoryId;
import ar.franciscoruiz.inventories.categories.domain.DomainCategoryFinder;
import ar.franciscoruiz.shared.domain.Service;

@Service
public final class CategoryFinder {
    private final DomainCategoryFinder finder;

    public CategoryFinder(DomainCategoryFinder finder) {
        this.finder = finder;
    }

    public CategoryResponse search(CategoryId id){
        Category category = this.finder.search(id);
        return CategoryResponse.fromAggregate(category);
    }
}
