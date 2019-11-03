package com.company;
import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class DuplicateRemover{
    private static Object HashSet;
    private String uniqueWords;

    public static void remove (String dataFile){
        FileInputStream fileByteStream = null;
        Scanner inFS = new Scanner(System.in);
        String fileName = "dataFile.txt";
        try {
            fileByteStream = new FileInputStream(fileName);
            inFS = new Scanner(fileByteStream);
            Set<String> uniqueWords = new HashSet<>();
        } catch (FileNotFoundException e) {
            System.out.println("FILE does not exist.");
        }
        finally{
            fileName.close;
        }



    }
    public static void write (String dataFile){
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
        }
        finally {
        try {
            if (fileName != null) fileName.close();
        } catch (Exception e) {
            System.out.println("File could not be closed");
        }
        finally {
            fileName.close(fileByteStream);
            // Cleanup finallys
        }
}
