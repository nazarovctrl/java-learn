public class Mouse extends Animal {
    public Mouse(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("squeak");
    }
}
