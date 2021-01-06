package ar.franciscoruiz.inventories.medias.domain;

import ar.franciscoruiz.shared.domain.criteria.Criteria;

import java.util.List;
import java.util.Optional;

public interface MediaRepository {
    void save(Media media);

    Optional<Media> search(MediaId id);

    List<Media> matching(Criteria criteria);
}
