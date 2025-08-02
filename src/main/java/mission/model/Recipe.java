package mission.model;

import java.util.List;

public class Recipe {
    private Cuisine cuisine;
    private List<IngredientWithWeight> ingredientWithWeights;

    public Recipe(Cuisine cuisine, List<IngredientWithWeight> ingredientWithWeights) {
        this.cuisine = cuisine;
        this.ingredientWithWeights = ingredientWithWeights;
    }

    public Cuisine getCuisine() {
        return cuisine;
    }

    public List<IngredientWithWeight> getIngredientWithWeights() {
        return ingredientWithWeights;
    }

    public boolean contain(List<Integer> ingredientIdList){
        return ingredientWithWeights.stream()
                .map(i -> i.getIngredient().getIngredientId())
                .allMatch(ingredientIdList::contains);
    }
}
