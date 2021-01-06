package ar.franciscoruiz.inventories.medias;

import ar.franciscoruiz.inventories.medias.domain.Media;
import ar.franciscoruiz.inventories.medias.domain.MediaRepository;
import ar.franciscoruiz.shared.infrastructure.UnitTestCase;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public abstract class MediasModuleUnitTestCase extends UnitTestCase {
    protected MediaRepository repository;

    @BeforeEach
    protected void setUp() {
        super.setUp();

        repository = Mockito.mock(MediaRepository.class);
    }

    public void shouldHaveSaved(Media media) {
        Mockito.verify(repository, Mockito.atLeastOnce()).save(media);
    }
}
