package org.example;

import java.io.File;

public class FileScanner {
    public static void scanDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                FileScannerUtil.checkFileSize(file);
            } else if (file.isDirectory()) {
                scanDirectory(file);
            }
        }
    }
}
