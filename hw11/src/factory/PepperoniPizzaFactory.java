package factory;

import ingredient.Ingredient;
import ingredient.option.*;
import ingredient.testo.Testo;
import util.TestoUtil;

public class PepperoniPizzaFactory implements PizzaFactory {
    @Override
    public String getRecipe() {
        String recipe = """
                Pepperoni pizza recipe for cooking
                Prepare testo Put all ingredients;
                Cook 20 minutes at temperature 280°C
                """;
        return recipe;
    }

    @Override
    public Ingredient getIngredients() {
        Ingredient cheeseMozzarella = new CheeseMozzarellaOption(null);
        Ingredient sauce = new SauceOption(cheeseMozzarella);
        Ingredient pepperoni = new PepperoniOption(sauce);

        Testo testo = TestoUtil.chooseTesto();

        return new TestoOption(pepperoni, testo);
    }
}
