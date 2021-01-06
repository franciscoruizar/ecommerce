package ar.franciscoruiz.inventories.medias.domain;

import ar.franciscoruiz.inventories.products.domain.ProductId;
import ar.franciscoruiz.shared.domain.MediaUrl;

import java.util.Objects;

public final class Media {
    private final MediaId   id;
    private final MediaUrl  url;
    private final ProductId productId;

    public Media(MediaId id, MediaUrl url, ProductId productId) {
        this.id        = id;
        this.url       = url;
        this.productId = productId;
    }

    public Media() {
        this.id        = null;
        this.url       = null;
        this.productId = null;
    }

    public MediaId id() {
        return id;
    }

    public MediaUrl url() {
        return url;
    }

    public ProductId productId() {
        return productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Media media = (Media) o;
        return Objects.equals(id, media.id) && Objects.equals(url, media.url) && Objects.equals(productId, media.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, productId);
    }
}
