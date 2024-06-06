package ingredient;

public class Sauce implements Ingredient {
    private String label;
    private double price;

    public Sauce(String label, double price) {
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

