public class Email implements Cloneable {
    private String value;

    public Email(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Email clone() throws CloneNotSupportedException {
        return (Email) super.clone();
    }
}
