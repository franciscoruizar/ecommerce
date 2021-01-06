package ar.franciscoruiz.inventories.products.domain;

import ar.franciscoruiz.shared.domain.criteria.Criteria;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    void save(Product product);

    Optional<Product> search(ProductId id);

    List<Product> matching(Criteria criteria);
}
