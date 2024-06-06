package factory;

import ingredient.Ingredient;

public interface PizzaFactory {
    String getRecipe();

    Ingredient getIngredients();
}
