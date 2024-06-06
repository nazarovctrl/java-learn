package factory;


import ingredient.Ingredient;
import ingredient.option.*;
import ingredient.testo.Testo;
import util.TestoUtil;

public class FourCheesePizzaFactory implements PizzaFactory {
    @Override
    public String getRecipe() {
        String recipe = """
                Four cheese pizza recipe for cooking
                Prepare testo Put all ingredients;
                Cook 15 minutes at temperature 320°C
                """;
        return recipe;
    }

    @Override
    public Ingredient getIngredients() {
        Ingredient cheeseMozzarella = new CheeseMozzarellaOption(null);
        Ingredient cheeseGouda = new CheeseGoudaOption(cheeseMozzarella);
        Ingredient cheeseCheddar = new CheeseCheddarOption(cheeseGouda);
        Ingredient cheeseFontina = new CheeseFontinaOption(cheeseCheddar);

        Testo testo = TestoUtil.chooseTesto();

        return new TestoOption(cheeseFontina, testo);
    }
}
