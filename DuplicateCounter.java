package com.company;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class DuplicateCounter {
    public static int count() {
        int count;
        try {
            fileByteStream = new FileWriter(fileName);
            fileByteStream.write((char[]) HashSet);

        }
        // Done with file, so try to close it
        catch (FileNotFoundException e) {
            System.out.println("FILE not found");
        } finally {
            try {
                if (fileName != null) fileName.close();
            } catch (Exception e) {
                System.out.println("File could not be closed");
            } finally {
                fileName.close(fileByteStream);
                // Cleanup finallys
            }
        return count;
    }

    public static void write(String dataFile) {
        PrintWriter outFS = null;
        FileWriter fileByteStream = null;
        String fileName = "unique_words.txt";
        try {
            fileByteStream = new FileWriter(fileName);
            fileByteStream.write((char[]) HashSet);

        }
        // Done with file, so try to close it
        catch (FileNotFoundException e) {
            System.out.println("FILE not found");
        } finally {
            try {
                if (fileName != null) fileName.close();
            } catch (Exception e) {
                System.out.println("File could not be closed");
            } finally {
                fileName.close(fileByteStream);
                // Cleanup finallys
            }
        }
    }
}
