package org.example;

import java.io.File;

public class FileScannerUtil {
    private final static int MINIMUM_SIZE_MB = 10;

    public static void checkFileSize(File file) {
        int minimumSize = 1024 * 1024 * MINIMUM_SIZE_MB;
        if (file.length() > minimumSize) {
            System.out.println(file.getName());
        }
    }
}
