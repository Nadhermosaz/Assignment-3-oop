
//package SinarBaru;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Meat extends SinarBaruShop {

    public void enterMeat()
    {
    Scanner Scanner = new Scanner(System.in);
    String[] Meat = new String[5];

    for(int i =0; i < 5; i++)
    {
        System.out.println("Please enter Meat name:");
        Meat[i] = Scanner.nextLine();
        System.out.println("Please enter Meat ID:");
        int meatID = Scanner.nextInt();
        System.out.println("Please enter Price per Kg:");
        int pricePerKg = Scanner.nextInt();
        Scanner.nextLine(); // Consume the newline character

        saveProductToFile(Meat[i],meatID,pricePerKg);
    }
}

public static void saveProductToFile( String MeatName, int meatId, int pricePerKg) {
    String filename =  "Meats_products.txt";

    try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
        writer.println("MeatName: " +   MeatName);
        writer.println("meatID: " + meatId);
        writer.println("Price per kg: " + pricePerKg);
        writer.println(); // Add an empty line for separation
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}