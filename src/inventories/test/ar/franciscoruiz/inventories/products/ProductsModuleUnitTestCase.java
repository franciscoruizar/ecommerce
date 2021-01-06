package ar.franciscoruiz.inventories.products;

import ar.franciscoruiz.inventories.InventoryContextUnitTestCase;
import ar.franciscoruiz.inventories.products.domain.Product;
import ar.franciscoruiz.inventories.products.domain.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public abstract class ProductsModuleUnitTestCase extends InventoryContextUnitTestCase {
    protected ProductRepository repository;

    @BeforeEach
    protected void setUp() {
        super.setUp();

        repository = Mockito.mock(ProductRepository.class);
    }

    public void shouldHaveSaved(Product product) {
        Mockito.verify(repository, Mockito.atLeastOnce()).save(product);
    }
}
