/*
NAME: TREVIS J. FIELDS
CLASS: CIS 18A
DATE: DEC 12 2016
TITLE: CLASS SCHEDULE CREATOR FINAL PROJECT (INCOMPLETE)
                                            DOES NOT CREATE/ READ/ OR WRITE TO A FILE
*/
package finalproject;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;

@SuppressWarnings("serial")
public class finalProjectUI extends JFrame implements ActionListener
{
    
    
   //GLOBAL DEFINITIONS
    final String[] SCHOOL_YEAR = {"FRESHMAN","SOPHOMORE","JUNIOR","SENIOR"};
    final String[] TIME_FOR_SCHOOL = {"SELECT TIME","MORNING","AFTERNOON ","NIGHT"};
    /*----------------------------------------------------------------*/
    JPanel aPanel = new JPanel(); 
    JPanel sizePanel = new JPanel();
    JLabel customerLabel = new JLabel("STUDENT NAME OR ID#: ");
    JTextField customerField = new JTextField(24); //length of text field
    JRadioButton[] sizeButtons = new JRadioButton[SCHOOL_YEAR.length];
    JComboBox<String> comboBox = new JComboBox<>(TIME_FOR_SCHOOL);
    JCheckBox checkBox = new JCheckBox("First year Student?");
    JButton submitButton = new JButton("Enroll");   
    //constructor for ProjectUI
    public finalProjectUI()
    {
        init();
        setTitle("SCHOOL SCHEDULE CREATOR");
        setSize(500, 750);  //width, height
        setVisible(true);   //show frame
        setLayout(new BorderLayout()); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        aPanel.setLayout(new FlowLayout());
        aPanel.setBackground(Color.CYAN);
    /*----------------------------------------------------------------*/
       doGridLayoutForAPanel();
    /*----------------------------------------------------------------*/  
        aPanel.add(customerLabel);
        aPanel.add(customerField);
        aPanel.add(sizePanel);
        aPanel.add(comboBox);
        aPanel.add(checkBox);
        aPanel.add(submitButton);
    /*----------------------------------------------------------------*/
        //adding stuff in the frame
        add(aPanel);     
    }
    /*----------------------------------------------------------------*/
    public void doGridLayoutForAPanel()
    {
    aPanel.setLayout(new GridLayout(8,2));
    aPanel.add(customerLabel);
    aPanel.add(customerField);
    aPanel.add(sizePanel);
    aPanel.add(comboBox);
    aPanel.add(checkBox);
    aPanel.add(submitButton);
        
    }
    /*----------------------------------------------------------------*/
    
    public void init() //initializing method
    {
        submitButton.setIcon(new ImageIcon("..\\finalProject\\assets\\image\\submit.png"));
    
        ButtonGroup group = new ButtonGroup();
        sizePanel.setBorder(BorderFactory.createTitledBorder("SELECT "));
    for(int i = 0; i < SCHOOL_YEAR.length; i++)
        {
        sizeButtons[i] = new JRadioButton(SCHOOL_YEAR[i]);
        group.add(sizeButtons[i]);  //grouping the radio buttons
        sizePanel.add(sizeButtons[i]);
        }
    comboBox.addActionListener(this);
    submitButton.addActionListener(this);
    }
    
    /*----------------------------------------------------------------*/

@Override
public void actionPerformed(ActionEvent e)
{
    
    
//if the source of the event is in the comboBox...
if(e.getSource().equals(comboBox))
{
    //...do this code
    //if comboBox's selected item matches the TIME_FOR_SCHOOL...
    if(comboBox.getSelectedItem().toString().equals(TIME_FOR_SCHOOL[0]))
    {
    aPanel.setBackground(Color.WHITE);
    }
    if(comboBox.getSelectedItem().toString().equals(TIME_FOR_SCHOOL[1]))
    {
    aPanel.setBackground(Color.YELLOW);
    }
    if(comboBox.getSelectedItem().toString().equals(TIME_FOR_SCHOOL[2]))
    {
    aPanel.setBackground(Color.BLUE);
    }
    if(comboBox.getSelectedItem().toString().equals(TIME_FOR_SCHOOL[3]))
    {
    aPanel.setBackground(Color.ORANGE);
    }

}
    if(e.getSource().equals(submitButton))
    {
    String message = "Hello, " + customerField.getText().toString() + "\n";

     for(int i = 0; i < TIME_FOR_SCHOOL.length; i++)
     {
     if(comboBox.getSelectedItem().toString().equals(TIME_FOR_SCHOOL[i]))
        {
         message += "Your schedule is: " + comboBox.getSelectedItem().toString();
        }
     }
 if(checkBox.isSelected())
 {
 message += "\nYou are a: First year student\n";
 }else
    {
 message += "\nYou are a: Returning Student\n";
    }
 JOptionPane.showMessageDialog(null, message);

for(int i = 0; i < sizeButtons.length; i++)
{
     if(sizeButtons[i].isSelected())
     {
         message += sizeButtons[i].getText().toString();
         if (sizeButtons[i] == sizeButtons[0]){
         JOptionPane.showMessageDialog(null,"FRESHMAN SCHEDULE:\nCHE-001\nMAT-100\nCIS-101\nPHY-201");
     }
     if (sizeButtons[i] == sizeButtons[1]){
         JOptionPane.showMessageDialog(null,"SOPHMORE SCHEDULE:\nMAT-200\nCHE-002\nCIS-102\nPHY-202");
     }
     if (sizeButtons[i] == sizeButtons[2]){
         JOptionPane.showMessageDialog(null,"JUNIOR SCHEDULE:\nCIS-103\nCHE-003\nMAT-300\nPHY-203");
     }
     if (sizeButtons[i] == sizeButtons[3]) {
         JOptionPane.showMessageDialog(null,"SENIOR SCHEDULE:\nPHY-204\nCHE-004\nMAT-400\nCIS-104");
     }
     }
     
}
} 
} 
    /* END OF PROGRAM */
}
/* 
*** NOTES | IDEAS TO IMPROVE  CODE *** 
* December 6 program broken and does not run
* December 8 program running but does not have any exception handling for files to write to
* December 10 program fixed again but still no files 
*/

/* 
*** PROGRAM IDEAS ***
* Create a program that gives the user a Freshman, Sophomore, Junior, or Senior schedule that is generic:
(if) the user does not select anything the schedule will be based off a generic morning, afternoon, or night schedule
(if) the user picks a time of day the schedule will reflect a schedule that is more suitable for the user
(if) the user picks the way the schedule is set up then the option for when a lab will be provided if the user takes classes with lab
(if) the user needs to set up the schedule with different classes allow that to be in the advanced options menu

Add in a log in menu for the student to create a student ID# that will be used for returning to schedule builder
*/