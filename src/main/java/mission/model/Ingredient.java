package mission.model;

import java.util.InputMismatchException;

public class Ingredient {
    private int ingredientId;
    private String ingredientName;
    private Unit unit;

    public Ingredient(int ingredientId, String ingredientName, Unit unit) {
        this.ingredientId = ingredientId;
        this.ingredientName = ingredientName;
        this.unit = unit;
    }

    public static int getIngredientId(Ingredient ingredient) {
        return ingredient.ingredientId;
    }

    public enum Unit {
        g, ml
    }
}



