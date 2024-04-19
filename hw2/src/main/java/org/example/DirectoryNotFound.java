package org.example;

public class DirectoryNotFound extends Exception {
    public DirectoryNotFound(String path) {
        super("Directory not found for path: " + path);
    }
}
