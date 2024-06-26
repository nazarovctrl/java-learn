package taxiapp.visitor;

import taxiapp.Taxi;

public interface IVisitor {
    void visit(Taxi taxi);
}
