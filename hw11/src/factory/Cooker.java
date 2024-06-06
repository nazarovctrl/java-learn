package factory;

import java.util.List;

public class Cooker {
    public void cook(List<Pizza> pizzas) {
        System.out.println("*******Cooking started********");
        for (Pizza pizza : pizzas) {
            pizza.make();
        }
    }
}
