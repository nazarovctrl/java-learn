import factory.Cooker;
import factory.FourCheesePizzaFactory;
import factory.PepperoniPizzaFactory;
import factory.Pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        List<Pizza> orderList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int input = 1;
        while (input == 1) {
            input = 0;
            System.out.println("*********Choose pizza**********");
            System.out.println("Menu: ");
            System.out.println("1. Four cheese pizza");
            System.out.println("2. Pepperoni pizza");
            System.out.print("Enter menu item number:");
            int orderNum = scanner.nextInt();
            Pizza pizza = null;
            switch (orderNum) {
                case 1:
                    pizza = new Pizza(new FourCheesePizzaFactory());
                    break;
                case 2:
                    pizza = new Pizza(new PepperoniPizzaFactory());
                    break;
                default:
                    input = 1;
                    System.out.println("Please enter value menu item number");
            }
            if (input == 1) {
                continue;
            }
            orderList.add(pizza);
            System.out.println("Continue order? (1=YES, 0=NO)");
            input = scanner.nextInt();
        }

        cooker.cook(orderList);
    }
}