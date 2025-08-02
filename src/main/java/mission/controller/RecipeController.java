package mission.controller;

import java.util.ArrayList;
import java.util.List;
import mission.model.Cuisine;
import mission.model.IngredientWithWeight;
import mission.model.Recipe;
import mission.model.Ingredient;
import mission.controller.loader.RecipeLoader;
import mission.model.dto.RecipeDto;

public class RecipeController {
    private List<Recipe> matchedRecipes;
    private List<Ingredient> matchedingredients;

    public RecipeController(CuisineController cuisineController, IngredientController ingredientController){
        List<RecipeDto> allRecipeDto = RecipeLoader.loadFromCSV("src/main/resources/Recipe.csv");
        //연결
        List<Recipe> allRecipes = cuisineController.getAllCuisines().stream()
                .map(cuisine -> new Recipe(cuisine, getIngredientWithWeight(ingredientController, allRecipeDto, cuisine)))
                .toList();

        //레시피 파일에 있는 ingredient_id랑 매치된 재료의 id랑 같은 레시피를 찾기
        this.matchedingredients = ingredientController.getMatchedIngredients();

    }

    private List<IngredientWithWeight> getIngredientWithWeight(IngredientController ingredientController, List<RecipeDto> allRecipesDto, Cuisine cuisine) {
        return allRecipesDto.stream()
                .filter(recipeDto -> recipeDto.getCuisine_id() == cuisine.getCuisineId())//cuisine id가 1이면 그 recipe 만 남겠죠?
                .map(dto -> new IngredientWithWeight(ingredientController.find(dto.getIngredient_id()), dto.getWeight()))
                .toList();
    }

    public List<Recipe> getMatchedRecipes() {
        return matchedRecipes;
    }
}
