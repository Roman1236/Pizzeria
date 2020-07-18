package model;

import java.util.ArrayList;

public class Pizza {
    private int price;
    private ArrayList<Ingredient> ingredients;

    public void evaluatePrice() {
        int tmpPrice = 0;

        for (Ingredient ingredient: ingredients) {
            tmpPrice += ingredient.getPrice();
        }

        setPrice(tmpPrice);
    }

    void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    void removeIngredient(Ingredient ingredient){
        ingredients.remove(ingredient);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
