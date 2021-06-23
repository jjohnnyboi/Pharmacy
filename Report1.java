/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacysystem;

import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author John
 */
public class Report1 extends JFrame {
     private Container c;
    private JLabel title;
    private JLabel name;
   private JTextArea tout;
  
    
      
    public  Report1(){ 
        
         setTitle("Report");
        setBounds(250, 90, 850, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

         c = getContentPane();
        c.setLayout(null);
        
        
         title = new JLabel("REPORT");
        title.setFont(new Font("Arial", Font.PLAIN, 32));
        title.setSize(730, 100);
        title.setLocation(370, 20);
        c.add(title);
        
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(720, 220);
        tout.setLocation(60, 120);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
        
        
    
    }
    
    
}
