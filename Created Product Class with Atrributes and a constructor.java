package proj;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Product {
    public String prodName;
    public String prodType;
    public String scName;
    public int quantity;
    private int prodID;
    public int prodDate;
    public int expDate;

    public Product(String prodName, String prodType, String scName, int quantity, int prodID, int prodDate, int expDate) {
        this.prodName = prodName;
        this.prodType = prodType;
        this.scName = scName;
        this.quantity = quantity;
        this.prodID = prodID;
        this.prodDate = prodDate;
        this.expDate = expDate;
    }
    
}
