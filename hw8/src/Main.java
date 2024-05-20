public class Main {
    public static void main(String[] args) {
        FactoryAF factoryAF = new FactoryAF();
        factoryAF.addCar(2);
        factoryAF.addCar(1);


        Customer customer = new Customer("Azimjon Nazarov");
        factoryAF.addCustomer(customer);

        factoryAF.saleCar();
    }
}
