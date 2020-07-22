package model;

import java.util.ArrayList;

public abstract class Ingredient {
    private double price;
    private String name;
    private int size;
    private ArrayList<Ingredient> ingredients;
    private boolean isDough;
    public Ingredient(double price, String name, int size) {
        this.price = price;
        this.name = name;
        this.size = size;
    }

    public boolean getIsDough() {
        return isDough;
    }

    public void setDough(boolean dough) {
        isDough = dough;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
