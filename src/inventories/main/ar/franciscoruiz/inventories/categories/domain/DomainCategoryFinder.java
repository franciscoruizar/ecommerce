package ar.franciscoruiz.inventories.categories.domain;

import ar.franciscoruiz.shared.domain.Service;

@Service
public class DomainCategoryFinder {
    private final CategoryRepository repository;

    public DomainCategoryFinder(CategoryRepository repository) {
        this.repository = repository;
    }

    public Category search(CategoryId id){
        return this.repository.search(id).orElseThrow(() -> new CategoryNotExist(id));
    }
}
