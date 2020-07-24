package model;

public class Tomato extends Ingredient {
    private int freshness;

    public Tomato(int price, String name, int size, int freshness) {
        super(price, name, size);
        this.freshness = freshness;
    }

    public double findSumPrice() {
        return this.getPrice();
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }
}
