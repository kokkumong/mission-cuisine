package mission.controller;

import java.util.List;
import mission.controller.loader.CuisineLoader;
import mission.model.Cuisine;

public class CuisineController {
    private List<Cuisine> allCuisines;
    public CuisineController() {
        allCuisines = CuisineLoader.loadFromCSV("src/main/resources/Cuisine.csv");
    }

    public List<Cuisine> getAllCuisines() {
        return allCuisines;
    }
}
