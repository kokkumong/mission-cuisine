package mission;

import api.Console;
import java.util.List;
import mission.controller.CuisineController;
import mission.controller.IngredientController;
import mission.controller.RecipeController;
import mission.model.Recipe;
import mission.view.InputView;
import mission.view.OutputView;

public class Application {
    public static void main(String[] args) {
        //TODO: 미션 구현
        System.out.println("재료를 입력해주세요.");
        IngredientController ingredientController = new IngredientController(new InputView());
        CuisineController cuisineController = new CuisineController();
        RecipeController recipeController = new RecipeController(cuisineController, ingredientController);
        List<Recipe> r = recipeController.getMatchedRecipes();
        System.out.println("\n[만들 수 있는 요리]");
        r.forEach(item -> System.out.println(" - " + item.getCuisine().getCuisineName()));
    }
}