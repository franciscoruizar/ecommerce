package ar.franciscoruiz.inventories.stocks.domain;

import ar.franciscoruiz.shared.domain.vo.IntValueObject;

public final class StockQuantity extends IntValueObject {
    public StockQuantity(Integer value) {
        super(value);
    }

    private StockQuantity() {
        super(0);
    }
}
