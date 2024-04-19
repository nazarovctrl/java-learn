package org.example;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File directory;
        do {
            System.out.println("Input directory path:");
            String path = scanner.nextLine().trim();
            directory = new File(path);
        } while (!directory.isDirectory());

        FileScanner.scanDirectory(directory);
    }
}
