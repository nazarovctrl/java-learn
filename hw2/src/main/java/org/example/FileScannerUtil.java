package org.example;

import java.io.File;

public class FileScannerUtil {
    private final static long MINIMUM_SIZE_BYTES = 1024 * 1024 * 10;

    public static void checkFileSize(File file) {
        if (file.length() > MINIMUM_SIZE_BYTES) {
            System.out.println(file.getName());
        }
    }
}
