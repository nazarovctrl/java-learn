package ingredient.option;

import ingredient.Ingredient;

public class CheeseFontinaOption extends OptionDecorator {
    public CheeseFontinaOption(Ingredient ingredient) {
        super(ingredient, "Cheese fontina",800);
    }
}
