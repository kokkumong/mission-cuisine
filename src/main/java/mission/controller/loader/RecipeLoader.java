package mission.controller.loader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import mission.model.Recipe;
import mission.model.dto.RecipeDto;

public class RecipeLoader {
    public static ArrayList<RecipeDto> loadFromCSV(String filePath){
        ArrayList<RecipeDto> recipes = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            br.readLine();
            while((line = br.readLine()) != null){
                String[] parts = line.split(",");
                int cuisine_Id = Integer.parseInt(parts[0].trim());
                int ingredient_id = Integer.parseInt(parts[1].trim());
                int recipeWeight = Integer.parseInt(parts[2].trim());
                RecipeDto recipe = new RecipeDto(cuisine_Id,ingredient_id,recipeWeight);
                recipes.add(recipe);
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

        return recipes;
    }
}
