package pharmacysystem;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Admin {
    private String name;
    
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public Admin(){
        this.name = "";
    }
    public Admin(String name){
        this.name = name;
    }
    public static ArrayList<Product> readAllProducts() {
        ArrayList<Product> productList = fileSave.readFile("drugs.dat");
        return productList;
    }
    
    public static void addProduct(Product prod) {
        ArrayList<Product> productList = readAllProducts();
        productList.add(prod);
        fileSave.saveFile("drugs", productList);
    }

}
