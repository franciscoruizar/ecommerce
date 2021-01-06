package ar.franciscoruiz.inventories.stocks.domain;

import ar.franciscoruiz.shared.domain.Identifier;

public final class StockId extends Identifier {
    public StockId(String value) {
        super(value);
    }

    public StockId() {
        super(null);
    }
}
