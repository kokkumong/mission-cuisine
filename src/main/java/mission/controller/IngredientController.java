package mission.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import mission.controller.loader.IngredientLoader;
import mission.model.Ingredient;
import mission.view.InputView;

public class IngredientController {
    private List<String> inputIngredients;
    private List<Ingredient> matchedIngredients;

    public IngredientController() {
        String input = InputView.inputIngredient();
        inputIngredients =new ArrayList<>(Arrays.asList(input.split(",")));

        List<Ingredient> allIngredients = IngredientLoader.loadFromCSV("src/main/resources/Ingredient.csv");

        matchedIngredients = allIngredients.stream().filter(i -> inputIngredients.contains(i.getIngredientName()))
                .collect(Collectors.toList());
    }
    public List<Ingredient> getMatchedIngredients() {
        return matchedIngredients;
    }
}
