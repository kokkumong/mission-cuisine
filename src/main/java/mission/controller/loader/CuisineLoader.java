package mission.controller.loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import mission.model.Cuisine;

public class CuisineLoader {
    public static ArrayList<Cuisine> loadFromCSV(String filePath){
        ArrayList<Cuisine> cuisines = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            br.readLine();
            while((line = br.readLine()) != null){
                String[] parts = line.split(",");
                int cuisineId = Integer.parseInt(parts[0].trim());
                String chefName = parts[1].trim();
                String cuisineName = parts[2].trim();

                Cuisine cuisine = new Cuisine(cuisineId, chefName, cuisineName);
                cuisines.add(cuisine);
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
        return cuisines;
    }
}
