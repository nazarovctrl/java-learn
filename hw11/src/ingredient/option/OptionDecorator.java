package ingredient.option;

import ingredient.Ingredient;

public class OptionDecorator implements Ingredient {
    private Ingredient ingredient;
    private String label;
    private double price;

    public OptionDecorator(Ingredient ingredient, String label, double price) {
        this.ingredient = ingredient;
        this.label = label;
        this.price = price;
    }

    @Override
    public double getPrice() {
        if (ingredient != null) {
            return price + ingredient.getPrice();
        }
        return price;
    }

    @Override
    public String getLabel() {
        if (ingredient != null) {
            return label + "," + ingredient.getLabel();
        }
        return label;
    }
}
