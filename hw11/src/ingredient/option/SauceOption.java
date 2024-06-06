package ingredient.option;

import ingredient.Ingredient;

public class SauceOption extends OptionDecorator {
    public SauceOption(Ingredient ingredient) {
        super(ingredient, "Souce", 400);
    }
}
