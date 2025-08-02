package mission.model;

public class Recipe {
    private int recipeId;
    private String recipeName;
    private int recipeWeight;

    public Recipe(int recipeId, String recipeName, int recipeWeight) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.recipeWeight = recipeWeight;
    }

    public int getRecipeId() {
        return recipeId;
    }
}
