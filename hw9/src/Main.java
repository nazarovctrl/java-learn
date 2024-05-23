import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Lion("lion"));
        animalList.add(new Mouse("mouse"));

        AnimalSound animalSound = new AnimalSound();

        animalSound.animalSound(animalList);
    }
}
