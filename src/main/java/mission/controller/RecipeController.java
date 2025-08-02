package mission.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import mission.model.Recipe;
import mission.model.Ingredient;
import mission.controller.loader.RecipeLoader;

public class RecipeController {
    private ArrayList<Recipe> matchedRecipes;
    private List<Ingredient> matchedingredients;

    public RecipeController(IngredientController ingredientController){
        ArrayList<Recipe> allRecipes = RecipeLoader.loadFromCSV("src/main/resources/Recipe.csv");
        //레시피 파일에 있는 ingredient_id랑 매치된 재료의 id랑 같은 레시피를 찾기
        this.matchedingredients = ingredientController.getMatchedIngredients();

    }
    public Recipe getMatchedRecipes() {
        ArrayList<Recipe> matchedRecipes = new ArrayList<>();

    }
    //찾은 레시피의 cuisine id를 리턴하는 함수를 구현 -> CuisineController로 보내기
}
