package ar.franciscoruiz.inventories.medias.domain;

import ar.franciscoruiz.inventories.products.domain.ProductId;
import ar.franciscoruiz.inventories.products.domain.ProductIdMother;
import ar.franciscoruiz.inventories.medias.domain.*;
import ar.franciscoruiz.shared.domain.MediaUrl;
import ar.franciscoruiz.shared.domain.MediaUrlMother;

import static org.junit.jupiter.api.Assertions.*;

public final class MediaMother {
    public static Media create(MediaId id, MediaUrl url, ProductId productId) {
        return new Media(id, url, productId);
    }

    public static Media random() {
        return create(
            MediaIdMother.random(),
            MediaUrlMother.random(),
            ProductIdMother.random()
        );
    }
}
