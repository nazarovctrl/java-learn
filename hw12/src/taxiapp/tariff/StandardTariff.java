package taxiapp.tariff;

public class StandardTariff implements ITariff {

    @Override
    public void calculate(int mileage) {
        System.out.println("Standard tariff");
    }
}
