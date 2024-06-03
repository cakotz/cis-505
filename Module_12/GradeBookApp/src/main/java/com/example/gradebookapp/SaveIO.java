package com.example.gradebookapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveIO {
    /*
    String FILE_NAME - Holds the name of the file being accessed
    File file - Creates a File object from the FILE_NAME String.
     */
    private static final String FILE_NAME = "savedGrades.csv";
    private static File file = new File(FILE_NAME);

    public static void dataInsert(String firstName, String lastName, String course, String grade) throws IOException {
        PrintWriter output = null;

        //If the file exists starts a FileOutputStream to the file, else it creates a new file.
        if (file.exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } else {
            output = new PrintWriter(FILE_NAME);
        }

        //Formats the data to the file;
        output.println(firstName + " " + lastName + " " + course + " " + grade);

        output.close();
    }

    //Creates a String ArrayList and adds each line of the file to it.
    public static ArrayList<String> dataRetrieval() throws IOException {
        ArrayList<String> allData = new ArrayList<>();
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String line = input.nextLine();
            allData.add(line);
        }

        return allData;
    }
}


