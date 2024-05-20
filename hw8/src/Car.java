public class Car {
    private Integer number;
    private Engine engine;

    public Car(Integer number, Integer engineSize) {
        this.number = number;
        this.engine = new Engine(engineSize);
    }

    public Integer getNumber() {
        return number;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", engine=" + engine +
                '}';
    }
}
