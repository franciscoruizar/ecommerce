package ar.franciscoruiz.inventories.stocks.domain;

import ar.franciscoruiz.inventories.products.domain.ProductId;
import ar.franciscoruiz.inventories.products.domain.ProductIdMother;
import ar.franciscoruiz.inventories.suppliers.domain.SupplierId;
import ar.franciscoruiz.inventories.suppliers.domain.SupplierIdMother;
import ar.franciscoruiz.inventories.variants.domain.VariantId;
import ar.franciscoruiz.inventories.variants.domain.VariantIdMother;

public final class StockMother {
    public static Stock create(
        StockId id,
        StockQuantity quantity,
        ProductId productId,
        SupplierId supplierId,
        VariantId variantId
    ) {
        return new Stock(id, quantity, productId, supplierId, variantId);
    }

    public static Stock random() {
        return create(
            StockIdMother.random(),
            StockQuantityMother.random(),
            ProductIdMother.random(),
            SupplierIdMother.random(),
            VariantIdMother.random()
        );
    }
}
