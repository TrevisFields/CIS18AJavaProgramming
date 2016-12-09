package finalproject;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


@SuppressWarnings("serial")
public class finalProjectUI extends JFrame implements ActionListener
{
   //GLOBAL DEFINITIONS
    final String[] SCHOOL_YEAR = {"FRESHMAN","SOPHOMORE","JUNIOR","SENIOR"};
    final String[] TIME_FOR_SCHOOL = {"SELECT TIME","MORNING","AFTERNOON ","NIGHT"};
    
    JPanel aPanel = new JPanel();
    
    JPanel sizePanel = new JPanel();
    JLabel customerLabel = new JLabel("STUDENT NAME OR ID#: ");
    JTextField customerField = new JTextField(24); //length of text field
    JRadioButton[] sizeButtons = new JRadioButton[SCHOOL_YEAR.length];
    JComboBox<String> comboBox = new JComboBox<>(TIME_FOR_SCHOOL);
    JCheckBox checkBox = new JCheckBox("First year Student?");
    JButton submitButton = new JButton("Enroll");
    
    
    
    //constructor for ProjectUI
    public finalProjectUI(){
        init();
        setTitle("SCHOOL SCHEDULE CREATOR");
        setSize(500, 750);  //width, height
        setVisible(true);   //show frame
        setLayout(new BorderLayout()); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        aPanel.setLayout(new FlowLayout());
        aPanel.setBackground(Color.CYAN);
        
        //adding stuff in the panel
        
        
        //doBorderLayoutForAPanel();
        
       doGridLayoutForAPanel();
        
        aPanel.add(customerLabel);
        aPanel.add(customerField);
        aPanel.add(sizePanel);
        aPanel.add(comboBox);
        //Removed for the time being 
        aPanel.add(checkBox);
        aPanel.add(submitButton);

        
        //adding stuff in the frame
        add(aPanel);
    }
    
    
    public void init() //initializing method
    {
        submitButton.setIcon(new ImageIcon("..\\finalProject\\assets\\image\\submit.png"));
    
        ButtonGroup group = new ButtonGroup();
        sizePanel.setBorder(BorderFactory.createTitledBorder("SELECT "));
    for(int i = 0; i < SCHOOL_YEAR.length; i++){
    sizeButtons[i] = new JRadioButton(SCHOOL_YEAR[i]);
    group.add(sizeButtons[i]);  //grouping the radio buttons
    sizePanel.add(sizeButtons[i]);
    }
    comboBox.addActionListener(this);
    
    submitButton.addActionListener(this);
    }
    
    
    @Override
public void actionPerformed(ActionEvent e)
{
//if the source of the event is in the comboBox...
if(e.getSource().equals(comboBox)){
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
 
 // School year loop
  
 for(int i = 0; i < TIME_FOR_SCHOOL.length; i++){
     if(comboBox.getSelectedItem().toString().equals(TIME_FOR_SCHOOL[i]))
     {
         message += "Your schedule is: " + comboBox.getSelectedItem().toString();
     }
 }
 if(checkBox.isSelected()){
 message += "\nFirst year student?\n";
 }else{
 message += "\nReturning Student\n";
 }
 JOptionPane.showConfirmDialog(null, message);

for(int i = 0; i < sizeButtons.length; i++){
     if(sizeButtons[i].isSelected()){
         message += sizeButtons[i].getText().toString();
         if (sizeButtons[i] == sizeButtons[0]){
         JOptionPane.showMessageDialog(null,"FRESHMAN:\nCHE-001\nMAT-100\nCIS-101\nPHY-201");
     }
     if (sizeButtons[i] == sizeButtons[1]){
         JOptionPane.showMessageDialog(null,"SOPHMORE:\nMAT-200\nCHE-002\nCIS-102\nPHY-202");
     }
     if (sizeButtons[i] == sizeButtons[2]){
         JOptionPane.showMessageDialog(null,"JUNIOR:\nCIS-103\nCHE-003\nMAT-300\nPHY-203");
     }
     if (sizeButtons[i] == sizeButtons[3]) {
         JOptionPane.showMessageDialog(null,"SENIOR:\nPHY-204\nCHE-004\nMAT-400\nCIS-104");
     }
     }
}

}

public void doGridLayoutForAPanel() {
aPanel.setLayout(new GridLayout(8,2));

aPanel.add(customerLabel);
aPanel.add(customerField);
aPanel.add(sizePanel);
        aPanel.add(comboBox);
        aPanel.add(checkBox);
        aPanel.add(submitButton);
        
}


//////////////////////////////////////////////////////////////////





    
//END OF PROGRAM    
}

//For later improvement create a selector for advanced schedule creation.
//Right now leave four random schedules for the for years of school
//If nothing is selected by the user give a generic schedule


/**
 * 
 *  Freshman{
 * CHE-001
 * MAT-100
 * CIS-101
 * PHY-201
 * }
 * 
 * Sophomore{
 * MAT-200
 * CHE-002
 * CIS-102
 * PHY-202
 * }
 * Junior{
 * CIS-102
 * CHE-003
 * MAT-300
 * PHY-203
 * }
 * 
 *Senior{
 * PHY-204
 * CHE-004
 * MAT-400
 * CIS-103
 * }
 * 
 */