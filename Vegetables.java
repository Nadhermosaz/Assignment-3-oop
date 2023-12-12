
//package SinarBaru;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Vegetables extends SinarBaruShop {

    public void enterVegetables()
    {
    Scanner Scanner = new Scanner(System.in);
    String[] Vegetables = new String[5];

    for(int i =0; i < 5; i++)
    {
       System.out.println("Please enter Vegetable name:");
       Vegetables[i] = Scanner.nextLine();
       System.out.println("Please enter Vegetables ID:");
       int VegID = Scanner.nextInt();
       System.out.println("Please enter Price per Kg:");
       int pricePerKg = Scanner.nextInt();
       Scanner.nextLine(); // Consume the newline character

       saveProductToFile(Vegetables[i],VegID,pricePerKg);
    }
    
}
public static void saveProductToFile( String VegetableName, int VegId, int pricePerKg) {
    String filename =  "Vegetable_products.txt";

    try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
        writer.println("VegetableName: " +   VegetableName);
        writer.println("VegetableID: " + VegId);
        writer.println("Price per kg: " + pricePerKg);
        writer.println(); // Add an empty line for separation
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}