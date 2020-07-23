package model;

import java.util.ArrayList;

enum DoughType {
    NEW_YORK,
    NEAPOLITAN,
    SICILIAN;

    private DoughType() {
    }
}

public class Dough extends Ingredient {
    private ArrayList<Ingredient> ingredients;
    private int freeSize;


    public Dough(int price, String name, int size, ArrayList<Ingredient> ingredients) {
        super(price, name, size);
        this.ingredients = ingredients;
        this.setPrice(price + this.findSumPrice());
        freeSize = this.getSize();
    }

    public boolean addIngredient(Ingredient ingredient) {
        if (ingredient == null || ingredient.getSize() > this.getFreeSize()) {
            return false;
        }

        ingredients.add(ingredient);
        this.setFreeSize(this.getFreeSize() - ingredient.getSize());
        return true;
    }

    public boolean removeIngredient(Ingredient ingredient) {
        if (ingredient == null || !this.ingredients.contains(ingredient)) {
            return false;
        }

        ingredients.remove(ingredient);
        this.setFreeSize(this.getFreeSize() + ingredient.getSize());
        return true;
    }

    public int getFreeSize() {
        return freeSize;
    }

    private void setFreeSize(int freeSize) {
        this.freeSize = freeSize;
    }

    public double findSumPrice() {
        double tempPrice = this.getPrice();

        if (ingredients == null || ingredients.isEmpty())  {
            return tempPrice;
        }

        for (Ingredient ingredient : ingredients) {
            tempPrice += ingredient.findSumPrice();
        }

        return tempPrice;
    }
}
