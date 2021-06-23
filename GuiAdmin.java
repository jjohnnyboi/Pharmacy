/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

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
import javax.swing.JTextField;

public class GuiAdmin extends JFrame {

    private Container c;
    private JLabel title;
    private JLabel text;
    private JLabel name;
    private JLabel id;
    private JTextField tname;
    private JTextField tid;
    private JButton sub;

    public GuiAdmin() {

        setTitle("ADMIN Form");
        setBounds(250, 90, 850, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("ADMIN");
        title.setFont(new Font("Arial", Font.PLAIN, 32));
        title.setSize(700, 100);
        title.setLocation(380, 30);
        c.add(title);

        text = new JLabel("Please enter your Name and Id :");
        text.setFont(new Font("Arial", Font.PLAIN, 20));
        text.setSize(500, 100);
        text.setLocation(100, 100);
        c.add(text);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 200);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 200);
        c.add(tname);

        id = new JLabel("ID");
        id.setFont(new Font("Arial", Font.PLAIN, 20));
        id.setSize(100, 20);
        id.setLocation(100, 250);
        c.add(id);

        tid = new JTextField();
        tid.setFont(new Font("Arial", Font.PLAIN, 15));
        tid.setSize(190, 20);
        tid.setLocation(200, 250);
        c.add(tid);

        sub = new JButton("SUBMET");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(150, 30);
        sub.setLocation(350, 350);
        c.add(sub);
        

    }
    
    public void  Actionperformed (ActionEvent a){
    
    
    if (a.getSource()== sub){
    
    }
    
    
    
    }
    
    
    
    
    
    
    
}
