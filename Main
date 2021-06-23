package pharmacysystem;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Pharmacysystem implements Serializable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Welcome to this pharmacy system");
            System.out.println("Choose an option");
            System.out.println("1- Admin side");
            System.out.println("2- user side");;
            int user = scan.nextInt();
            if (user == 1) {
                System.out.println("Choose an option");
                System.out.println("1- Add a product");
                System.out.println("2- Delete a product");
                System.out.println("3- Show all products");
                System.out.println("4- Show most purchased product");
                System.out.println("5- Exit");


                int input = scan.nextInt();
                if (input == 1) {
                    System.out.println("Product name, Product type, Scientific name, quantity.");
                    scan.nextLine();
                    String name = scan.nextLine();
                    String type = scan.nextLine();
                    String scName = scan.nextLine();
                    int quantity = scan.nextInt();
                    Admin.addProduct(new Product(name, type, scName, quantity, 2, 2207, 2507, 0));
                } else if (input == 2) {
                    System.out.println("Please insert ID");
                    int id = scan.nextInt();
                    ArrayList<Product> productList = Admin.readAllProducts();
                    productList.remove(id-1);
                    fileSave.saveFile("drugs", productList);
                } else if (input == 3) {
                    ArrayList<Product> productList = Admin.readAllProducts();
                    System.out.println(productList.size());
                    System.out.println("ID\tName\tType\tScName\tQuantity\tPurchases");
                    for (int i = 0; i < productList.size(); i++) {
                        System.out.println((i+1)+" "+productList.get(i).prodName+" "+productList.get(i).prodType+" "+productList.get(i).scName+" "+productList.get(i).quantity+" "+productList.get(i).purchasedTimes);
                    }
                } else if (input == 4) {
                    Product prod = Report.getMostPurchased();
                    System.out.println(prod.prodName+" "+prod.purchasedTimes);
                } else if (input == 5) {
                    break;
                }
            } else {
                System.out.println("Choose an option.");
                System.out.println("1- Buy a product.");
                System.out.println("2- Show all products.");
                System.out.println("3- Exit.");
                int choice = scan.nextInt();
                if (choice == 1) {
                    System.out.println("Please insert ID");
                    int id = scan.nextInt();
                    ArrayList<Product> productList = Admin.readAllProducts();
                    if (productList.get((id-1)).quantity == 0) {
                        System.out.println("The product has ran out");
                    } else {
                        productList.get((id-1)).purchasedTimes++;
                        productList.get((id-1)).quantity--;
                        fileSave.saveFile("drugs", productList);
                    }
                } else if (choice == 2) {
                    ArrayList<Product> productList = Admin.readAllProducts();
                    System.out.println(productList.size());
                    System.out.println("ID\tName\tType\tScName\tQuantity");
                    for (int i = 0; i < productList.size(); i++) {
                        System.out.println((i+1)+" "+productList.get(i).prodName+" "+productList.get(i).prodType+" "+productList.get(i).scName+" "+productList.get(i).quantity);
                    }                    
                } else if (choice == 3) {
                    break;
                }
            }
        }
    }
    
}
