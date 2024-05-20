public class Car {
    private Integer number;
    private Engine engine;

    public Car(Integer number, Integer engineSize) {
        this.number = number;
        this.engine = new Engine(engineSize);
    }
}
