package ar.franciscoruiz.inventories.variants;

import ar.franciscoruiz.inventories.variants.domain.Variant;
import ar.franciscoruiz.inventories.variants.domain.VariantRepository;
import ar.franciscoruiz.shared.infrastructure.UnitTestCase;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public abstract class VariantsModuleUnitTestCase extends UnitTestCase {
    protected VariantRepository repository;

    @BeforeEach
    protected void setUp() {
        super.setUp();

        repository = Mockito.mock(VariantRepository.class);
    }

    public void shouldHaveSaved(Variant variant) {
        Mockito.verify(repository, Mockito.atLeastOnce()).save(variant);
    }
}
