package ingredient.option;

import ingredient.Ingredient;

public class CheeseCheddarOption extends OptionDecorator {
    public CheeseCheddarOption(Ingredient ingredient) {
        super(ingredient, "Cheese cheddar", 750);
    }
}
