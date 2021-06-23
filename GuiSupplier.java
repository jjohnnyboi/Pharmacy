/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacysystem;

/**
 *
 * @author John
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class GuiSupplier extends JFrame {
    
    
      
    private Container c;
    private JLabel title;
    private JLabel text;
    private JLabel name;
    private JLabel pno;
    private JLabel sl ; 
    
    
    private JTextArea dname;
    private JTextArea details; 
    private JTextArea sno;
     private JTextArea sll;
     
     
    private JTextField tname;
    private JTextField tprice;
    private JTextField tav;
    private JButton sub;

    public  GuiSupplier() {

        setTitle("Supplier Details");
        setBounds(250, 90, 850, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Supplier ");
        title.setFont(new Font("Arial", Font.PLAIN, 32));
        title.setSize(700, 100);
        title.setLocation(370,25);
        c.add(title);

        text = new JLabel(" supplier name ");
        text.setFont(new Font("Arial", Font.PLAIN, 20));
        text.setSize(500, 100);
        text.setLocation(100, 100);
        c.add(text);
        
        dname= new JTextArea();
        dname.setFont(new Font("Arial", Font.PLAIN, 15));
        dname.setSize(150, 20);
        dname.setLocation(250, 140);
        c.add(dname);
        
         name = new JLabel(" company name ");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(500, 100);
        name.setLocation(100, 140);
        c.add(name);
        
         details= new JTextArea();
        details.setFont(new Font("Arial", Font.PLAIN, 15));
        details.setSize(150, 20);
        details.setLocation(250, 180);
        c.add(details);
        
        pno = new JLabel(" supplier phone ");
        pno.setFont(new Font("Arial", Font.PLAIN, 20));
        pno.setSize(500, 100);
        pno.setLocation(100,180);
        c.add(pno);
        
        sno= new JTextArea();
        sno.setFont(new Font("Arial", Font.PLAIN, 15));
        sno.setSize(150, 20);
        sno.setLocation(250, 221);
        c.add(sno);
        
        
         sl = new JLabel("supplierlastorder ");
        sl.setFont(new Font("Arial", Font.PLAIN, 20));
        sl.setSize(500, 100);
        sl.setLocation(100,220);
        c.add(sl);
        
        
          sll= new JTextArea();
        sll.setFont(new Font("Arial", Font.PLAIN, 15));
        sll.setSize(150, 20);
        sll.setLocation(250, 261);
        c.add(sll);
        
        
        
           sub = new JButton("SUBMET");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(150, 30);
        sub.setLocation(350, 350);
        c.add(sub);
        
        
}
    
    
}