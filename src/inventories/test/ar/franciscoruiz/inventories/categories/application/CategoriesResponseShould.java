package ar.franciscoruiz.inventories.categories.application;

import ar.franciscoruiz.shared.domain.ListMother;

import java.util.Collections;
import java.util.List;

public final class CategoriesResponseShould {
    public static CategoriesResponse create(List<CategoryResponse> categories) {
        return new CategoriesResponse(categories);
    }

    public static CategoriesResponse random() {
        return create(ListMother.random(CategoryResponseMother::random));
    }

    public static CategoriesResponse times(int times) {
        return create(ListMother.create(times, CategoryResponseMother::random));
    }

    public static CategoriesResponse empty() {
        return create(Collections.emptyList());
    }
}
