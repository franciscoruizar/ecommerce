package ar.franciscoruiz.inventories.categories.application.creator;

import ar.franciscoruiz.inventories.categories.CategoriesModuleUnitTestCase;
import ar.franciscoruiz.inventories.categories.domain.Category;
import ar.franciscoruiz.inventories.categories.domain.CategoryMother;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


final class CreateCategoryCommandHandlerShould extends CategoriesModuleUnitTestCase {
    private CreateCategoryCommandHandler handler;

    @BeforeEach
    protected void setUp() {
        super.setUp();

        handler = new CreateCategoryCommandHandler(new CategoryCreator(repository));
    }

    @Test
    void create_a_valid_category() {
        CreateCategoryCommand command = CreateCategoryCommandMother.random();

        Category category = CategoryMother.fromRequest(command);

        handler.handle(command);

        shouldHaveSaved(category);
    }
}
