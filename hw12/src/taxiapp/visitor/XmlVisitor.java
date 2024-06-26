package taxiapp.visitor;

import taxiapp.Taxi;

public class XmlVisitor implements IVisitor {
    @Override
    public void visit(Taxi taxi) {
        String xml = "<taxi>\n" +
                "  <mileage>" + taxi.getMileage() + "</mileage>\n" +
                "  <driver>" + taxi.getDriver() + "</driver>\n" +
                "  <state>" + taxi.getStatenName() + "</state>\n" +
                "</taxi>";
        System.out.println(xml);
    }
}
