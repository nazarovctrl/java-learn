public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Email email = new Email("alex@gmail.com");

        Person alex = new Person();
        alex.setEmail(email);

        Person clone = alex.clone();

        //should be false
        System.out.println(alex.equals(clone));
        System.out.println(alex.getEmail().equals(clone.getEmail()));
    }
}