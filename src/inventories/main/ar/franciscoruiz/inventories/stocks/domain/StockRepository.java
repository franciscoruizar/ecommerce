package ar.franciscoruiz.inventories.stocks.domain;

import ar.franciscoruiz.shared.domain.criteria.Criteria;

import java.util.List;
import java.util.Optional;

public interface StockRepository {
    void save(Stock stock);

    Optional<Stock> search(StockId id);

    List<Stock> matching(Criteria criteria);
}
