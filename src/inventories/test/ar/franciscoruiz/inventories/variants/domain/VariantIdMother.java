package ar.franciscoruiz.inventories.variants.domain;

import ar.franciscoruiz.inventories.variants.domain.VariantId;
import ar.franciscoruiz.shared.domain.UuidMother;

public final class VariantIdMother {
    public static VariantId create(String value) {
        return new VariantId(value);
    }

    public static VariantId random() {
        return create(UuidMother.random());
    }
}
