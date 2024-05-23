public class Main {
    public static void main(String[] args) {
        FactoryAF factoryAF = new FactoryAF();
        factoryAF.addCar(2);
        factoryAF.addCar(1);
        factoryAF.addCar(1);


        Customer customer = new Customer("Azimjon Nazarov");
        Customer customer2 = new Customer("Azimjon Nazarov");
        factoryAF.addCustomer(customer);
        factoryAF.addCustomer(customer2);

        for (Car car : factoryAF.getCarList()) {
            System.out.println(car);
        }

        for (Customer customer1 : factoryAF.getCustomerList()) {
            System.out.println(customer1);
        }

        System.out.println("=================== Sale car started");
        factoryAF.saleCar();
        System.out.println("=================== Sale car finished");

        for (Car car : factoryAF.getCarList()) {
            System.out.println(car);
        }

        for (Customer customer1 : factoryAF.getCustomerList()) {
            System.out.println(customer1);
        }
    }
}
