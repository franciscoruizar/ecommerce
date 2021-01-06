package ar.franciscoruiz.inventories.products.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public final class Product {
    private final ProductId          id;
    private final ProductName        name;
    private final ProductDescription description;
    private final ProductPrice       price;
    private final ProductBarcode     barcode;
    private final LocalDateTime      updatedAt;
    private final LocalDateTime      createdAt;
    private final ProductStatus      status;

    public Product(ProductId id, ProductName name, ProductDescription description, ProductPrice price, ProductBarcode barcode, LocalDateTime updatedAt, LocalDateTime createdAt, ProductStatus status) {
        this.id          = id;
        this.name        = name;
        this.description = description;
        this.price       = price;
        this.barcode     = barcode;
        this.updatedAt   = updatedAt;
        this.createdAt   = createdAt;
        this.status      = status;
    }

    public Product() {
        this.id          = null;
        this.name        = null;
        this.description = null;
        this.price       = null;
        this.barcode     = null;
        this.updatedAt   = null;
        this.createdAt   = null;
        this.status      = null;
    }

    public ProductId id() {
        return id;
    }

    public ProductName name() {
        return name;
    }

    public ProductDescription description() {
        return description;
    }

    public ProductPrice price() {
        return price;
    }

    public ProductBarcode barcode() {
        return barcode;
    }

    public LocalDateTime updatedAt() {
        return updatedAt;
    }

    public LocalDateTime createdAt() {
        return createdAt;
    }

    public ProductStatus status() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(description, product.description) && Objects.equals(price, product.price) && Objects.equals(barcode, product.barcode) && Objects.equals(updatedAt, product.updatedAt) && Objects.equals(createdAt, product.createdAt) && Objects.equals(status, product.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, price, barcode, updatedAt, createdAt, status);
    }
}
