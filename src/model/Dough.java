package model;

import java.util.ArrayList;

public class Dough extends Ingredient{
    private ArrayList<Ingredient> ingredients;
    private int freeSize = this.getSize();
    private enum DoughType {
        NEW_YORK,
        NEAPOLITAN,
        SICILIAN
    }

    public Dough(int price, String name, int size, ArrayList<Ingredient> ingredients) {
        super(price, name, size);
        this.ingredients = ingredients;
        this.setPrice(price+this.findSumPrice());

    }

    public boolean addIngredient(Ingredient ingredient) {
        if (ingredient==null || ingredient.getSize() > this.getFreeSize()) {
            return false;
        }

        ingredients.add(ingredient);
        this.setFreeSize(this.getFreeSize() - ingredient.getSize());
        this.setPrice(this.getPrice()+ingredient.getPrice());
        return true;
    }

    public boolean removeIngredient(Ingredient ingredient) {
        if (ingredient == null || !this.ingredients.contains(ingredient)) {
            return false;
        }

        ingredients.remove(ingredient);
        this.setFreeSize(this.getFreeSize() + ingredient.getSize());
        this.setPrice(this.getPrice()-ingredient.getPrice());
        return true;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public int getFreeSize() {
        return freeSize;
    }

    private void setFreeSize(int freeSize) {
        this.freeSize = freeSize;
    }

    public double findSumPrice(){
        double tempPrice=0;
        if(ingredients!=null)
        for (Ingredient ingredient : ingredients) {
            tempPrice += ingredient.getPrice();
        }
        return tempPrice;
    }
}
