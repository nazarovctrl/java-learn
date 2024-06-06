package ingredient.option;

import ingredient.Ingredient;

public class CheeseGoudaOption extends OptionDecorator {
    public CheeseGoudaOption(Ingredient ingredient) {
        super(ingredient, "Cheese gouda", 700);
    }
}
