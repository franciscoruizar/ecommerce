package ar.franciscoruiz.inventories.variants.domain;

import ar.franciscoruiz.inventories.variants.domain.VariantDescription;
import ar.franciscoruiz.shared.domain.WordMother;

public final class VariantDescriptionMother {
    public static VariantDescription create(String value) {
        return new VariantDescription(value);
    }

    public static VariantDescription random() {
        return create(WordMother.random());
    }
}
