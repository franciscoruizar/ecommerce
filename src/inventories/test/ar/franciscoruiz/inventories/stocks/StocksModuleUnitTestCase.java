package ar.franciscoruiz.inventories.stocks;

import ar.franciscoruiz.inventories.stocks.domain.Stock;
import ar.franciscoruiz.inventories.stocks.domain.StockRepository;
import ar.franciscoruiz.shared.infrastructure.UnitTestCase;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public abstract class StocksModuleUnitTestCase extends UnitTestCase {
    protected StockRepository repository;

    @BeforeEach
    protected void setUp() {
        super.setUp();

        repository = Mockito.mock(StockRepository.class);
    }

    public void shouldHaveSaved(Stock stock) {
        Mockito.verify(repository, Mockito.atLeastOnce()).save(stock);
    }
}
