package ar.franciscoruiz.inventories.categories.application.finder;

import ar.franciscoruiz.inventories.categories.application.CategoryResponse;
import ar.franciscoruiz.inventories.categories.domain.CategoryId;
import ar.franciscoruiz.shared.domain.Service;
import ar.franciscoruiz.shared.domain.bus.query.QueryHandler;

@Service
public final class CategoryFinderQueryHandler implements QueryHandler<CategoryFinderQuery, CategoryResponse> {
    private final CategoryFinder finder;

    public CategoryFinderQueryHandler(CategoryFinder finder) {
        this.finder = finder;
    }

    @Override
    public CategoryResponse handle(CategoryFinderQuery query) {
        CategoryId id = new CategoryId(query.id());
        return finder.search(id);
    }
}
