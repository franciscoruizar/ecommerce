package ar.franciscoruiz.inventories.categories;

import ar.franciscoruiz.inventories.categories.domain.Category;
import ar.franciscoruiz.inventories.categories.domain.CategoryRepository;
import ar.franciscoruiz.shared.infrastructure.UnitTestCase;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public abstract class CategoriesModuleUnitTestCase extends UnitTestCase {
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
