import java.util.LinkedList;
import java.util.List;

public class FactoryAF {
    private LinkedList<Car> carList;
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
            Car car = carList.pollFirst();
            if (car == null) {
                System.out.println("There is no car to sale");
                break;
            }
            System.out.println("Car number=" + car.getNumber() + " sold to " + customer.getFullName());
            customer.setCar(car);
        }

        if (!carList.isEmpty()) {
            System.out.println(carList.size() + " car/cars removed");
            carList.clear();
        }
    }

    public LinkedList<Car> getCarList() {
        return carList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
