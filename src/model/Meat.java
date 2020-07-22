package model;

public class Meat extends Ingredient{
    private int roasting;

    public Meat(double price, String name, int size, int roasting) {
        super(price, name, size);
        this.roasting = roasting;
        this.setIngredients(null);
        this.setDough(false);
    }

    public int getRoasting() {
        return roasting;
    }

    public void setRoasting(int roasting) {
        this.roasting = roasting;
    }
}
