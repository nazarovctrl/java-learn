public class Customer {
    private String fullName;
    private Car car;

    public Customer(String fullName) {
        this.fullName = fullName;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", car=" + car +
                '}';
    }
}
