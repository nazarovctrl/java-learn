package ingredient.testo;

public class TestoBuilder implements Builder {
    private int thicknessSize;
    private int radius;
    private FlourType flourType;
    private String label;
    private double price;

    @Override
    public void setThicknessSize(int size) {
        this.thicknessSize = size;
    }

    @Override
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void setFlourType(FlourType type) {
        this.flourType = type;
    }

    @Override
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public Testo getResult() {
        return new Testo(thicknessSize, radius, flourType, label, price);
    }
}
