package ingredient.testo;

import ingredient.Ingredient;

public class Testo implements Ingredient {
    private final int thicknessSize;
    private final int radius;
    private final FlourType flourType;
    private final String label;
    private final double price;

    public Testo(int thicknessSize, int radius, FlourType flourType, String label, double price) {
        this.thicknessSize = thicknessSize;
        this.radius = radius;
        this.flourType = flourType;
        this.label = label;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getLabel() {
        return label;
    }
}
