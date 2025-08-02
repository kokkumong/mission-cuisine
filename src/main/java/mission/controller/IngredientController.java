package mission.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import mission.controller.loader.IngredientLoader;
import mission.model.Ingredient;
import mission.view.InputInterface;
import mission.view.InputView;

public class IngredientController {
    private List<String> inputIngredients;
    private List<Ingredient> matchedIngredients;
    private List<Ingredient> allIngredients;

    public IngredientController(InputInterface inputInterface) {
        String input = inputInterface.inputIngredient();
        inputIngredients =new ArrayList<>(Arrays.asList(input.split(", ")));

        allIngredients = IngredientLoader.loadFromCSV("src/main/resources/Ingredient.csv");

        matchedIngredients = allIngredients.stream().filter(i -> inputIngredients.contains(i.getIngredientName()))
                .collect(Collectors.toList());
    }
    public List<Ingredient> getMatchedIngredients() {
        return matchedIngredients;
    }

    public Ingredient find(int id) {
        return allIngredients.stream()
                .filter(ingredient -> ingredient.getIngredientId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
