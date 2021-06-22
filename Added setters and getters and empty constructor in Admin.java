package proj;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Admin extends Person{
    private int ID;
    
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public Admin(){
        this.ID = 0;
    }
    public Admin(String name, int ID){
        super(name);
        this.ID = ID;
    }
}

