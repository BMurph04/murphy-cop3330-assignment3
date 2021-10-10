/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex44;
import com.google.gson.Gson;

import java.util.ArrayList;

import java.util.Scanner;
import java.io.*;

public class ProductSearch{

    final private static Scanner input = new Scanner(System.in);



    public static Product findProduct() throws IOException{

        Gson gson = new Gson();
        Reader readJSON = new FileReader("src/main/java/ex44/exercise44_input.json");

        //Convert JSON file to Java ArrayList to compare
        ProductList productList = gson.fromJson(readJSON, ProductList.class);
        ArrayList<Product> products = productList.getProductList();

        //While user input does not match any name in input file, (do/while)
        do{
            //Ask user for the product name
            System.out.println("What is the product name?");
            String inputName = input.nextLine();
            for (Product product : products) {
                if (inputName.equals(product.getName())) {
                    return product; //If a product name matches user input, return matching object to function name
                }
            }
            System.out.println("Sorry, that product was not found in our inventory."); //Else, tell user that the product name was not found in our inventory.
        }while(true);

    }
    public static void printResult(Product foundProduct){
        System.out.println("Name: "+foundProduct.getName());
        System.out.println("Price "+foundProduct.getPrice());
        System.out.println("Quantity "+foundProduct.getQuantity());

    }

    public static void main(String[] args) throws IOException{
        Product foundProduct = findProduct();
        printResult(foundProduct);
    }
}
