package finaltest;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class ProjectUI extends JFrame implements ActionListener{
   
    //Global 
    final String[] SIZE_STRING = {"XS", "S", "M", "L", "XL", "XXL"};
    final String[] COLOR_STRINGS ={"(Select Color)"," RED", " GREEN", " BLUE", " HOT PINK"};
    JPanel aPanel = new JPanel();
    
    JPanel sizePanel = new JPanel();
    JLabel customerLabel = new JLabel("Customer Name: ");
    JTextField customerField = new JTextField(24); //length of text field
    JRadioButton[] sizeButtons = new JRadioButton[SIZE_STRING.length];
    JComboBox<String> comboBox = new JComboBox<>(COLOR_STRINGS);
    JCheckBox checkBox = new JCheckBox("Pick Up?");
    JButton submitButton = new JButton("Submit");
    
    
    //constructor for ProjectUI
    public ProjectUI(){
        init();
        setTitle("CLOTHING ORDER");
        setSize(400, 400);  //width, height
        setVisible(true);   //show frame
        setLayout(new BorderLayout()); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        aPanel.setLayout(new FlowLayout());
        aPanel.setBackground(Color.BLUE);
        
        //adding stuff in the panel
        aPanel.add(customerLabel);
        aPanel.add(customerField);
        aPanel.add(sizePanel);
        aPanel.add(comboBox);
        aPanel.add(checkBox);
        aPanel.add(submitButton);
        
        //adding stuff in the frame
        add(aPanel);
    }
    
    public void init() //initializing method
    {
        submitButton.setIcon(new ImageIcon("..\\finaltest\\assets\\image\\'image_title'.png"));
    
        ButtonGroup group = new ButtonGroup();
        sizePanel.setBorder(BorderFactory.createTitledBorder("Select a size"));
    for(int i = 0; i < SIZE_STRING.length; i++){
    sizeButtons[i] = new JRadioButton(SIZE_STRING[i]);
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
    //if comboBox's selected item matches the COLOR_STRING...
    if(comboBox.getSelectedItem().toString().equals(COLOR_STRINGS[1]))
{
    aPanel.setBackground(Color.RED);
}
}
if(e.getSource().equals(submitButton))
{
 String message = customerField.getText().toString() + "\n";
 
 for(int i = 0; i < sizeButtons.length; i++){
     if(sizeButtons[i].isSelected()){
         message += sizeButtons[i].getText().toString();
     }
 }
 for(int i = 0; i < COLOR_STRINGS.length; i++){
     if(comboBox.getSelectedItem().toString().equals(COLOR_STRINGS[i]))
     {
         message += comboBox.getSelectedItem().toString();
     }
 }
 if(checkBox.isSelected()){
 message += " WILL PICK UP ITEM\n";
 }else{
 message += " ITEMS WILL BE SHIPPED\n";
 }
 JOptionPane.showConfirmDialog(null, message);
}
}
}


//Search google for an icon for the checkout button
//save it and then go to the assets folder create and save the image into the images folder
//64 x 64 image


