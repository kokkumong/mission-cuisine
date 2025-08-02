package mission.model.dto;

public class RecipeDto {
    private final int cuisine_id;
    private final int ingredient_id;
    private final int weight;

    public RecipeDto(int cuisine_id, int ingredient_id, int weight) {
        this.cuisine_id = cuisine_id;
        this.ingredient_id = ingredient_id;
        this.weight = weight;
    }

    public int getCuisine_id() {
        return cuisine_id;
    }

    public int getIngredient_id() {
        return ingredient_id;
    }

    public int getWeight() {
        return weight;
    }
}
