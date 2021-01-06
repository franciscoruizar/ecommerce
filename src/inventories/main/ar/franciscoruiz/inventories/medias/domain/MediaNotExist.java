package ar.franciscoruiz.inventories.medias.domain;

import ar.franciscoruiz.inventories.products.domain.ProductId;
import ar.franciscoruiz.shared.domain.DomainError;

public final class MediaNotExist extends DomainError {
    public MediaNotExist(ProductId id) {
        super("media_not_exist", String.format("The media <%s> doesn't exist", id.value()));
    }
}
