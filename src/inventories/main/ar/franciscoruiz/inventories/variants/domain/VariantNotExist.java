package ar.franciscoruiz.inventories.variants.domain;

import ar.franciscoruiz.inventories.variants.domain.VariantId;
import ar.franciscoruiz.shared.domain.DomainError;

public final class VariantNotExist extends DomainError {
    public VariantNotExist(VariantId id) {
        super("variant_not_exist", String.format("The variant <%s> doesn't exist", id.value()));
    }
}
