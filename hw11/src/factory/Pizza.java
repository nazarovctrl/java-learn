package factory;

import ingredient.Ingredient;

public class Pizza {
    private String recipe;
    private Ingredient ingredient;

    public Pizza(PizzaFactory factory) {
        recipe = factory.getRecipe();
        ingredient = factory.getIngredients();
        System.out.println("Ingredients: " + ingredient.getLabel());
        System.out.println("Price: " + ingredient.getPrice());
    }

    public void make() {
        System.out.println("Ingredients for make:" + ingredient.getLabel());
        System.out.println("Recipe:" + recipe);
    }

}
