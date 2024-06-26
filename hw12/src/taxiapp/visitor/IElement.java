package taxiapp.visitor;

public interface IElement {
    void accept(IVisitor visitor);
}