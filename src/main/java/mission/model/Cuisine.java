package mission.model;

public class Cuisine {
    private int cuisineId;
    private String chefName;
    private String cuisineName;

    public Cuisine(int cuisineId, String chefName, String cuisineName) {
        this.cuisineId = cuisineId;
        this.chefName = chefName;
        this.cuisineName = cuisineName;
    }

    public int getCuisineId() {
        return cuisineId;
    }

    public String getCuisineName() {
        return cuisineName;
    }
}
