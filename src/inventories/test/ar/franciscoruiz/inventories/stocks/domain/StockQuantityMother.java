package ar.franciscoruiz.inventories.stocks.domain;

import ar.franciscoruiz.shared.domain.IntegerMother;

public final class StockQuantityMother {
    public static StockQuantity create(Integer value) {
        return new StockQuantity(value);
    }

    public static StockQuantity random() {
        return create(IntegerMother.random());
    }
}
