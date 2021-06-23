package proj;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Product {
    private Report report;
    public String prodName;
    public String prodType;
    public String scName;
    public int quantity;
    private int prodID;
    public int prodDate;
    public int expDate;
    
    public String getprodName(){
        return prodName;
    }
    public void setprodName(String prodName){
        this.prodName = prodName;
    }
    public String prodType(){
        return prodType;
    }
    public void setprodType(String prodType){
        this.prodType = prodType;
    }
    public String getscName(){
        return scName;
    }
    public void setscName(String scName){
        this.scName = scName;
    }
    public int getquantity(){
        return quantity;
    }
    public void setquantity(int quantity){
        this.quantity = quantity;
    }
    public int getprodID(){
        return prodID;
    }
    public void setprodID(int prodID){
        this.prodID = prodID;
    }
    public int getprodDate(){
        return prodDate;
    }
    public void setprodDate(int prodDate){
        this.prodDate = prodDate;
    }
    public int getexpDate(){
        return expDate;
    }
    public void setexpDate(int expDate){
        this.expDate = expDate;
    }

    public Product(){
        this.prodName = "";
        this.prodType = "";
        this.scName = "";
        this.quantity = 0;
        this.prodID = 0;
        this.prodDate = 0;
        this.expDate = 0;
    }

    public Product(String prodName, String prodType, String scName, int quantity, int prodID, int prodDate, int expDate, Report report) {
        this.prodName = prodName;
        this.prodType = prodType;
        this.scName = scName;
        this.quantity = quantity;
        this.prodID = prodID;
        this.prodDate = prodDate;
        this.expDate = expDate;
        this.report = report;
    }
    public void display() throws FileNotFoundException, IOException, ClassNotFoundException{
        try{
            FileInputStream meds = new FileInputStream("Meds.txt");
            Scanner sc = new Scanner(meds);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void WriteInMeds()throws FileNotFoundException, IOException{
        try{
            FileWriter medWriter = new FileWriter("Meds.txt");
            medWriter.write(this.prodName + "\n");
            medWriter.write(this.prodType + "\n");
            medWriter.write(this.scName + "\n");
            medWriter.write(this.quantity + "\n");
            medWriter.write(this.prodID + "\n");
            medWriter.write(this.prodDate + "\n");
            medWriter.write(this.expDate + "\n");
            medWriter.close();
        }
        catch (IOException e){
            System.out.println("An Error Occured");
            e.printStackTrace();
        }
    }
    
}
