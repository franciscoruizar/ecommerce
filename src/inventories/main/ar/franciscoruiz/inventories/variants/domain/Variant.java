package ar.franciscoruiz.inventories.variants.domain;

import java.util.Objects;

public final class Variant {
    private final VariantId          id;
    private final VariantDescription description;

    public Variant(VariantId id, VariantDescription description) {
        this.id          = id;
        this.description = description;
    }

    public Variant() {
        this.id          = null;
        this.description = null;
    }

    public VariantId id() {
        return id;
    }

    public VariantDescription description() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Variant variant = (Variant) o;
        return Objects.equals(id, variant.id) && Objects.equals(description, variant.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }
}
