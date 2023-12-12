
//package SinarBaru;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Fruits extends SinarBaruShop {

    public void enterFruits()
    {
    Scanner Scanner = new Scanner(System.in);
    String[] fruits = new String[5];

    for(int i =0; i < 5; i++)
    {
        System.out.println("Please enter fruit name:");
        fruits[i] = Scanner.nextLine();
        System.out.println("Please enter fruit ID:");
        int fruitID = Scanner.nextInt();
        System.out.println("Please enter Price per Kg:");
        int pricePerKg = Scanner.nextInt();
        Scanner.nextLine(); // Consume the newline character

        saveProductToFile(fruits[i],fruitID,pricePerKg);
    }
}

public static void saveProductToFile( String FruitName, int fruitId, int pricePerKg) {
    String filename =  "Fruits_products.txt";

    try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
        writer.println("fruitName: " +   FruitName);
        writer.println("fruitID: " + fruitId);
        writer.println("Price per kg: " + pricePerKg);
        writer.println(); // Add an empty line for separation
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}