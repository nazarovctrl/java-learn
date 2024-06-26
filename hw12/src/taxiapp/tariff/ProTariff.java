package taxiapp.tariff;

public class ProTariff implements ITariff {

    @Override
    public void calculate(int mileage) {
        System.out.println("Pro tariff");
    }
}
