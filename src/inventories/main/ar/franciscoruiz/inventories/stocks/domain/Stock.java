package ar.franciscoruiz.inventories.stocks.domain;

import ar.franciscoruiz.inventories.products.domain.ProductId;
import ar.franciscoruiz.inventories.suppliers.domain.SupplierId;
import ar.franciscoruiz.inventories.variants.domain.VariantId;

import java.util.Objects;

public final class Stock {
    private final StockId       id;
    private final StockQuantity quantity;
    private final ProductId     productId;
    private final SupplierId supplierId;
    private final VariantId  variantId;

    public Stock(
        StockId id,
        StockQuantity quantity,
        ProductId productId,
        SupplierId supplierId,
        VariantId variantId
    ) {
        this.id         = id;
        this.quantity   = quantity;
        this.productId  = productId;
        this.supplierId = supplierId;
        this.variantId = variantId;
    }

    public Stock() {
        this.id         = null;
        this.quantity   = null;
        this.productId  = null;
        this.supplierId = null;
        this.variantId = null;
    }

    public StockId id() {
        return id;
    }

    public StockQuantity quantity() {
        return quantity;
    }

    public ProductId productId() {
        return productId;
    }

    public SupplierId supplierId() {
        return supplierId;
    }

    public VariantId variantId() {
        return variantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stock stock = (Stock) o;
        return Objects.equals(id, stock.id) && Objects.equals(quantity, stock.quantity) && Objects.equals(productId, stock.productId) && Objects.equals(supplierId, stock.supplierId) && Objects.equals(variantId, stock.variantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, productId, supplierId, variantId);
    }
}
