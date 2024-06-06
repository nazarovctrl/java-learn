package ingredient.option;

import ingredient.Ingredient;
import ingredient.option.OptionDecorator;

public class PepperoniOption extends OptionDecorator {
    public PepperoniOption(Ingredient ingredient) {
        super(ingredient, "Pepperoni 18 slices", 500);
    }
}
