package taxiapp;

import taxiapp.memento.CareTaker;
import taxiapp.tariff.ProTariff;
import taxiapp.tariff.StandardTariff;
import taxiapp.visitor.JsonVisitor;
import taxiapp.visitor.XmlVisitor;

public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi("Azimjon", new StandardTariff());
        taxi.calculate();
        taxi.setTariff(new ProTariff());
        taxi.calculate();

        System.out.println(taxi.getStatenName());

        CareTaker careTaker = new CareTaker();

        careTaker.saveState(taxi);

        taxi.start();
        taxi.accept(new JsonVisitor());

        careTaker.restoreState(taxi);
        taxi.accept(new XmlVisitor());

    }
}