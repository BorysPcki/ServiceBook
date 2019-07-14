package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {



    public static void usingFileWriter(String fileContent) throws IOException {

        FileWriter fileWriter = new FileWriter("X:/GitHub/ServiceBook/service_book.txt", true);
        fileWriter.write(fileContent +"\n");
        fileWriter.close();
    }

    public static void write(WriteToFile writeToFile, String newLine) {
        try {
            writeToFile.usingFileWriter(newLine);
        } catch (IOException e) {
            System.out.println("error");
        }

    }
}
