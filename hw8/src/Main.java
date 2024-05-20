public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, 2);
        Car car2 = new Car(2, 2);

        Customer customer = new Customer("Azimjon Nazarov");

        FactoryAF factoryAF = new FactoryAF();
        factoryAF.addCar(car);
        factoryAF.addCar(car2);

        factoryAF.addCustomer(customer);

        factoryAF.saleCar();
    }
}
