package ar.franciscoruiz.inventories.medias.domain;

import ar.franciscoruiz.shared.domain.Identifier;

public final class MediaId extends Identifier {
    public MediaId(String value) {
        super(value);
    }

    private MediaId() {
        super(null);
    }
}
