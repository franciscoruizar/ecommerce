package ar.franciscoruiz.inventories.stocks.domain;

import ar.franciscoruiz.inventories.stocks.domain.StockId;
import ar.franciscoruiz.shared.domain.DomainError;

public final class StockNotExist extends DomainError {
    public StockNotExist(StockId id) {
        super("stock_not_exist", String.format("The stock <%s> doesn't exist", id.value()));
    }
}
