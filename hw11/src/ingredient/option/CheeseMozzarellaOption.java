package ingredient.option;

import ingredient.Ingredient;

public class CheeseMozzarellaOption extends OptionDecorator {
    public CheeseMozzarellaOption(Ingredient ingredient) {
        super(ingredient, "Cheese mozzarella", 1000);
    }
}
