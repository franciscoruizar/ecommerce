package ar.franciscoruiz.inventories.variants.domain;

import ar.franciscoruiz.shared.domain.vo.StringValueObject;

public final class VariantDescription extends StringValueObject {
    public VariantDescription(String value) {
        super(value);
    }

    public VariantDescription() {
        super("");
    }
}
