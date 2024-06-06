package util;

import ingredient.testo.TestoDirector;
import ingredient.testo.Testo;
import ingredient.testo.TestoBuilder;

import java.util.Scanner;

public class TestoUtil {

    public static Testo chooseTesto() {
        TestoBuilder testoBuilder = new TestoBuilder();
        Scanner scanner = new Scanner(System.in);
        int testoType;
        do {
            System.out.print("\nPlease choose testo. Enter value 1 or 0 (1=Thick, 0=Thin):");
            testoType = scanner.nextInt();
        } while (testoType != 1 && testoType != 0);

        TestoDirector testoDirector = TestoDirector.getInstance();
        if (testoType == 1) {
            testoDirector.constructThickTesto(testoBuilder);
        } else {
            testoDirector.constructThinTesto(testoBuilder);
        }
        return testoBuilder.getResult();
    }
}
