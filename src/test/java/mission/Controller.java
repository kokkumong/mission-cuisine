package mission;

import api.TestEnvironment;
import java.util.List;
import mission.controller.CuisineController;
import mission.controller.IngredientController;
import mission.controller.RecipeController;
import mission.model.Cuisine;
import mission.model.Ingredient;
import mission.model.Ingredient.Unit;
import mission.model.IngredientWithWeight;
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
        List<IngredientWithWeight> ingredient = List.of(
                new IngredientWithWeight(new Ingredient(1, "A", Unit.g), 100),
                new IngredientWithWeight(new Ingredient(2, "B", Unit.g), 100)
                );
        Cuisine cuisine = new Cuisine(1, "박호건", "밥");
        Recipe recipe = new Recipe(cuisine, ingredient);

        assert recipe.contain(List.of(1, 2, 3));
    }

    class MockInput implements InputInterface {
        @Override
        public String inputIngredient(){
            return "스파게티면, 마늘, 올리브오일, 소금, 칠리 플레이크";
        }
    }
}
