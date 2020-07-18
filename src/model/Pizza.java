package model;

import java.util.ArrayList;

public class Pizza {
    private Dough baseDough;

    public Pizza(Dough baseDough) {
        this.baseDough = baseDough;
    }

    public double findPrice() {
        return this.baseDough.getPrice();
    }
}
