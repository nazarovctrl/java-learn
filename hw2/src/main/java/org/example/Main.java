package org.example;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DirectoryNotFound {
        File directory;
        try {
            directory = getDirectory();
        } catch (DirectoryNotFound e) {
            System.out.println(e.getMessage());
            directory = getDirectory();
        }

        FileScanner.startScan(directory);
    }

    public static File getDirectory() throws DirectoryNotFound {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input directory path:");
        String path = scanner.nextLine().trim();

        File directory = new File(path);
        if (!directory.isDirectory()) {
            throw new DirectoryNotFound(path);
        }
        return directory;
    }
}
