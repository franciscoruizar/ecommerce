package ar.franciscoruiz.inventories.products.domain;

import ar.franciscoruiz.inventories.categories.domain.CategoryId;
import ar.franciscoruiz.inventories.categories.domain.CategoryIdMother;
import ar.franciscoruiz.shared.domain.DateTimeMother;

import java.time.LocalDateTime;

public final class ProductMother {
    public static Product create(
        ProductId id,
        ProductName name,
        ProductDescription description,
        ProductPrice price,
        ProductBarcode barcode,
        LocalDateTime updatedAt,
        LocalDateTime createdAt,
        ProductStatus status,
        CategoryId categoryId
    ) {
        return new Product(id, name, description, price, barcode, updatedAt, createdAt, status, categoryId);
    }

    public static Product random() {
        return create(
            ProductIdMother.random(),
            ProductNameMother.random(),
            ProductDescriptionMother.random(),
            ProductPriceMother.random(),
            ProductBarcodeMother.random(),
            DateTimeMother.random(),
            DateTimeMother.random(),
            ProductStatusMother.random(),
            CategoryIdMother.random()
        );
    }
}
