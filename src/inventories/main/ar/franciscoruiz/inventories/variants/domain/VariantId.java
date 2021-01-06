package ar.franciscoruiz.inventories.variants.domain;

import ar.franciscoruiz.shared.domain.Identifier;

public final class VariantId extends Identifier {
    public VariantId(String value) {
        super(value);
    }

    private VariantId() {
        super(null);
    }
}
