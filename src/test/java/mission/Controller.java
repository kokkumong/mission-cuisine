package mission;

import api.TestEnvironment;
import java.util.List;
import mission.controller.CuisineController;
import mission.controller.IngredientController;
import mission.controller.RecipeController;
import mission.model.Ingredient;
import mission.model.Recipe;
import mission.view.InputInterface;
import org.junit.jupiter.api.Test;

public class Controller{
    @Test
    public void test() {
        MockInput mockInput = new MockInput();
        IngredientController ingredientController = new IngredientController(mockInput);
        CuisineController cuisineController = new CuisineController();
        RecipeController recipeController = new RecipeController(cuisineController, ingredientController);
        List<Recipe> r = recipeController.getMatchedRecipes();
        assert r.size() == 1;
    }
    @Test
    public void test2(){
        List<Ingredient> ingredient = List.of(new Ingredeint, new Ingredeint);

        Recipe recipe = new Recipe();
        recipe.contain();
    }
    class MockInput implements InputInterface {
        @Override
        public String inputIngredient(){
            return "스파게티면, 마늘, 올리브오일, 소금, 칠리 플레이크";
        }
    }
}
