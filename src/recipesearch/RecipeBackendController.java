package recipesearch;

import javafx.event.ActionEvent;
import se.chalmers.ait.dat215.lab2.*;

import java.util.List;

public class RecipeBackendController {
    private String difficulty;
    private int maxTime;
    private String cuisine;
    private int maxPrice;
    private String mainIngredient;

    RecipeDatabase db = RecipeDatabase.getSharedInstance();

    public List<Recipe> getRecipes() {
        return db.search(new SearchFilter(difficulty, maxTime, cuisine, maxPrice, mainIngredient));
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }
    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }

}