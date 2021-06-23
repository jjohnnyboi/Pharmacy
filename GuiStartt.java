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

public class GuiStart extends JFrame {

    private Container c;
    private JLabel title;
    private JLabel text;
    private JButton sign;
    private JButton login;

    public GuiStart() {

        setTitle("New Form");
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

        text = new JLabel("WELCOME ! DO YOU HAVE AN ACCOUNT ? ");
        text.setFont(new Font("Arial", Font.PLAIN, 20));
        text.setSize(500, 100);
        text.setLocation(185, 130);
        c.add(text);

        sign = new JButton("SIGN UP");
        sign.setFont(new Font("Arial", Font.PLAIN, 15));
        sign.setSize(200, 40);
        sign.setLocation(150, 250);

        c.add(sign);

        login = new JButton("LOGIN");
        login.setFont(new Font("Arial", Font.PLAIN, 15));
        login.setSize(200, 40);
        login.setLocation(450, 250);

        c.add(login);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sign) {

        } else if (e.getSource() == login) {

        }

    }

}
