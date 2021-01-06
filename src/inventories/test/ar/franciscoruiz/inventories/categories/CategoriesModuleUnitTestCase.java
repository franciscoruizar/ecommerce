package ar.franciscoruiz.inventories.categories;

import ar.franciscoruiz.inventories.InventoryContextUnitTestCase;
import ar.franciscoruiz.inventories.categories.domain.Category;
import ar.franciscoruiz.inventories.categories.domain.CategoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public final class CategoriesModuleUnitTestCase extends InventoryContextUnitTestCase {
    protected CategoryRepository repository;

    @BeforeEach
    protected void setUp() {
        super.setUp();

        repository = Mockito.mock(CategoryRepository.class);
    }

    public void shouldHaveSaved(Category category) {
        Mockito.verify(repository, Mockito.atLeastOnce()).save(category);
    }
}
