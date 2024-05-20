import java.util.LinkedList;
import java.util.List;

public class FactoryAF {
    private List<Car> carList;
    private List<Customer> customerList;
    private Integer number = 0;

    public FactoryAF() {
        this.carList = new LinkedList<>();
        this.customerList = new LinkedList<>();
    }

    public void addCar(Integer engineSize) {
        Car car = new Car(number++, engineSize);
        carList.add(car);
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void saleCar() {
        for (Customer customer : customerList) {
            Car car = carList.get(0);
            if (car == null) {
                break;
            }
            System.out.println("Car number=" + car.getNumber() + " sold to " + customer.getFullName());
            customer.setCar(car);
            carList.remove(0);
        }

        if (!carList.isEmpty()) {
            carList = new LinkedList<>();
        }
    }
}
