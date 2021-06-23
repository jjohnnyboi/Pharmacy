package pharmacysystem;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Admin {
    private String name;
    private int ID;
    
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public Admin(){
        this.name = "";
        this.ID = 0;
    }
    public Admin(String name, int ID){
        this.name = name;
        this.ID = ID;
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
