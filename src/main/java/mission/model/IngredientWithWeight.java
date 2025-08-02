package mission.model;

public class IngredientWithWeight {
    private Ingredient ingredient;
    private int weight;

    public IngredientWithWeight(Ingredient ingredient, int weight) {
        this.ingredient = ingredient;
        this.weight = weight;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public int getWeight() {
        return weight;
    }
}
