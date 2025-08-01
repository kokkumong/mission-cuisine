package mission.controller.loader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import mission.model.Ingredient;
import mission.model.Ingredient.Unit;

public class IngredientLoader {
    public static ArrayList<Ingredient> loadFromCSV(String filePath){
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            br.readLine();
            while((line = br.readLine()) != null){
                String[] parts = line.split(",");
                int ingredientId = Integer.parseInt(parts[0].trim());
                String ingredientName = parts[1].trim();
                Unit ingredientUnit = Unit.valueOf(parts[2].trim());
                Ingredient ingredient = new Ingredient(ingredientId,ingredientName,ingredientUnit);
                ingredients.add(ingredient);
            }
        }
        catch (IllegalArgumentException e) {
            System.err.println("잘못된 단위 값입니다: " + e.getMessage());
        }
        catch(FileNotFoundException e){
            System.err.println("파일을 찾을 수 없음!");
        }
        catch(IOException e) {
            System.err.println("입출력 오류!");
        }

        return ingredients;
    }
}
