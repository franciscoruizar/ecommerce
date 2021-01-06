package ar.franciscoruiz.inventories.stocks.domain;

import ar.franciscoruiz.shared.domain.UuidMother;

public final class StockIdMother {
    public static StockId create(String value) {
        return new StockId(value);
    }

    public static StockId random() {
        return create(UuidMother.random());
    }
}
