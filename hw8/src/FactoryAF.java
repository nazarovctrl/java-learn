import java.util.LinkedList;

public class FactoryAF {
    private LinkedList<Car> carList;
    private LinkedList<Customer> customerList;

    public FactoryAF() {
        this.carList = new LinkedList<>();
        this.customerList = new LinkedList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void saleCar() {
        for (Customer customer : customerList) {
            Car car = carList.pollFirst();
            if (car == null) {
                break;
            }
            customer.setCar(car);
        }

        if (!carList.isEmpty()) {
            carList = new LinkedList<>();
        }
    }
}
