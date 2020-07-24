package model;

public class Pizza {
    private Dough baseDough;

    public Pizza(Dough baseDough) {
        this.baseDough = baseDough;
    }

    public double findPizzaPrice() {
        return this.baseDough.findSumPrice();
    }
}
