package ar.franciscoruiz.inventories.variants.domain;

public final class VariantMother {
    public static Variant create(VariantId id, VariantDescription description) {
        return new Variant(id, description);
    }

    public static Variant random() {
        return create(
            VariantIdMother.random(),
            VariantDescriptionMother.random()
        );
    }
}
