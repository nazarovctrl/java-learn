package taxiapp.visitor;

import taxiapp.Taxi;

public class JsonVisitor implements IVisitor {
    @Override
    public void visit(Taxi taxi) {
        String json = "{\n" +
                "  \"mileage\": " + taxi.getMileage() + ",\n" +
                "  \"driver\": \"" + taxi.getDriver() + "\",\n" +
                "  \"state\": \"" + taxi.getStatenName() + "\"\n" +
                "}";
        System.out.println(json);
    }
}
