import model.*;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        Tomato tomato1 = new Tomato(1, "tomato1", 3, 5);
        Meat meat1 = new Meat(10, "meat1", 5, 3);
        Dough dough1 = new Dough(100, "dough1", 10, Dough.DoughType.NEAPOLITAN);
        Dough dough2 = new Dough(1000, "dough2", 15, Dough.DoughType.NEW_YORK);

        dough1.addIngredient(tomato1);
        dough2.addIngredient(meat1);
        dough2.addIngredient(dough1);

        Pizza PizzaDliaYarika = new Pizza(dough2);
        System.out.println(PizzaDliaYarika.findPizzaPrice());
    }
}
