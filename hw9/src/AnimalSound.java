import java.util.List;

public class AnimalSound {
    public void animalSound(List<Animal> animalList) {
        for (Animal animal : animalList) {
            animal.makeSound();
        }
    }
}
