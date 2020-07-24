package model;

public class Onion extends Ingredient {
    private int pungency;

    public Onion(double price, String name, int size, int pungency) {
        super(price, name, size);
        this.pungency = pungency;
    }

    public double findSumPrice() {
        return this.getPrice();
    }

    public int getPungency() {
        return pungency;
    }

    public void setPungency(int pungency) {
        this.pungency = pungency;
    }
}
