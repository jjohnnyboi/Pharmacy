package proj;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Customer extends Person {
    public int phoneNum;
    public Product product;

    public Customer(String name, int phoneNum, Product product  ) {
        super(name);
        this.phoneNum = phoneNum;
    }
    
    public String buyProduct(){
        
    }
}
