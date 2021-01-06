package ar.franciscoruiz.inventories.categories.domain;

public final class CategoryMother {
    public static Category create(CategoryId id, CategoryDescription description) {
        return new Category(id, description);
    }

    public static Category random() {
        return create(
            CategoryIdMother.random(),
            CategoryDescriptionMother.random()
        );
    }
}
