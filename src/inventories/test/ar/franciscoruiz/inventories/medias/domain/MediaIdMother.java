package ar.franciscoruiz.inventories.medias.domain;

import ar.franciscoruiz.shared.domain.UuidMother;

public final class MediaIdMother {
    public static MediaId create(String value) {
        return new MediaId(value);
    }

    public static MediaId random() {
        return create(UuidMother.random());
    }
}
