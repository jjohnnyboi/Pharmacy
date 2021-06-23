/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacysystem;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

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

public class GuiStart extends JFrame {

    private Container c;
    private JLabel title;
    private JLabel text;
    private JButton admin;       
    private JButton login;

    public GuiStart() {

        setTitle("Start Form");
        setBounds(250, 90, 850, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("PHARMACY MANAGEMENT SYSTEM");
        title.setFont(new Font("Arial", Font.PLAIN, 32));
        title.setSize(700, 100);
        title.setLocation(130, 30);
        c.add(title);

        text = new JLabel("WELCOME ! choose an option to enter ");
        text.setFont(new Font("Arial", Font.PLAIN, 20));
        text.setSize(500, 100);
        text.setLocation(185, 130);
        c.add(text);

        admin = new JButton("Admin");
        admin.setFont(new Font("Arial", Font.PLAIN, 15));
        admin.setSize(200, 40);
        admin.setLocation(150, 250);

        c.add(admin);

        login = new JButton("User Side");
        login.setFont(new Font("Arial", Font.PLAIN, 15));
        login.setSize(200, 40);
        login.setLocation(450, 250);

        c.add(login);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == admin) {

        } else if (e.getSource() == login) {

        }

    }

}

    

