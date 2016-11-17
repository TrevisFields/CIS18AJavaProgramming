package finaltest;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class ProjectUI extends JFrame{
   
    final String[] SIZE_STRING = {"XS", "S", "M", "L", "XL", "XXL"};
    
    JPanel sizePanel = new JPanel();
    JLabel customerLabel = new JLabel("Customer Name:");
    JTextField customerField = new JTextField(24); //length of text field
    JRadioButton[] sizeButtons = new JRadioButton[SIZE_STRING.length];
    //constructor for ProjectUI
    public ProjectUI(){
        init();
        setTitle("CLOTHING ORDER");
        setSize(400, 200);  //width, height
        setVisible(true);   //show frame
        setLayout(new BorderLayout()); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel aPanel = new JPanel();
        aPanel.setLayout(new FlowLayout());
        aPanel.setBackground(Color.black);
        
        //adding stuff in the panel
        aPanel.add(customerLabel);
        aPanel.add(customerField);
        aPanel.add(sizePanel);
        //adding stuff in the frame
        add(aPanel);
    }
    
    public void init() //initializing method
    {
        
    for(int i = 0; i < SIZE_STRING.length; i++){
    sizeButtons[i] = new JRadioButton(SIZE_STRING[i]);
    sizePanel.add(sizeButtons[i]);
    }
    }
    
}
