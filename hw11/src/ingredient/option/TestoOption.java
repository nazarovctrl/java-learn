package ingredient.option;

import ingredient.Ingredient;
import ingredient.testo.Testo;

public class TestoOption extends OptionDecorator {
    public TestoOption(Ingredient ingredient, Testo testo) {
        super(ingredient, testo.getLabel(), testo.getPrice());
    }
}
