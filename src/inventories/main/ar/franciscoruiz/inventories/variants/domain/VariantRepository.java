package ar.franciscoruiz.inventories.variants.domain;

import java.util.Optional;

public interface VariantRepository {
    void save(Variant variant);

    Optional<Variant> search(VariantId id);
}
