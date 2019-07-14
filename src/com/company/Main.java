package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Reparation first = new Reparation("12.07.2019", "układ chłodniczy", "czyszczenie i wymiana plynu", 105);
        System.out.println(first.show());
        Reparation second = new Reparation("14.07.2019", "reflektory", "regeneracja", 75);
        System.out.println(second.show());

        WriteToFile writeToFile = new WriteToFile();

//        Scanner scanner = new Scanner();

        WriteToFile.write(writeToFile, first.show());
        WriteToFile.write(writeToFile, second.show());


    }
}
