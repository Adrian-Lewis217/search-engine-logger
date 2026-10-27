package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SearchEngineLogger {
    public static void main(String[] args) {
        Scanner search = new Scanner(System.in);

        try {
            // file to write
            String file = "logs.txt";
            BufferedWriter logs = new BufferedWriter(new FileWriter(file));
        } catch (Exception e) {
            System.out.println("Error");
        }


    }
    public static String getSearch(Scanner input){
        System.out.println("Enter Search: ");
        return input.nextLine();
    }
}
