package ar.franciscoruiz.inventories.suppliers;

import ar.franciscoruiz.inventories.suppliers.domain.Supplier;
import ar.franciscoruiz.inventories.suppliers.domain.SupplierRepository;
import ar.franciscoruiz.shared.infrastructure.UnitTestCase;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public abstract class SuppliersModuleUnitTestCase extends UnitTestCase {
    protected SupplierRepository repository;

    @BeforeEach
    protected void setUp() {
        super.setUp();

        repository = Mockito.mock(SupplierRepository.class);
    }

    public void shouldHaveSaved(Supplier supplier) {
        Mockito.verify(repository, Mockito.atLeastOnce()).save(supplier);
    }
}
