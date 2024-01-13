package com.lms.z_myform;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public final class MyWindow extends JFrame
{
    private JLabel heading;
   Font font = new Font("",Font.BOLD,20);
   
   private JPanel mainPanel;
   private JLabel nameLabel,passwordLabel;
   private JTextField nameTextField;
   private JPasswordField passwordField;
   private JButton button1,button2;
   
    public MyWindow()
    {
        super.setTitle("My First Form");
        super.setSize(500,500);
        super.setLocation(100,100);
        //super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();
        setVisible(true);
        System.out.println("this is constructor..");
    }
    
    public void createGUI()
    {
        this.setLayout(new BorderLayout());
        heading= new JLabel("My First Form");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);
        
        this.add(heading,BorderLayout.NORTH);
        
        ////working with j panel...
        
        mainPanel=new JPanel();
        mainPanel.setLayout(new GridLayout(3,2));
        
        nameLabel = new JLabel("ENTER YOUR NAME: ");
        nameLabel.setFont(font);
        
        
        passwordLabel=new JLabel("ENTER PASSWORD: ");
        passwordLabel.setFont(font);
        
        nameTextField=new JTextField();
        nameTextField.setFont(font);
        
        
        passwordField = new JPasswordField();
        passwordField.setFont(font);
        
        button1= new JButton("SUBMIT");
        button1.setFont(font);
        
        button2= new JButton("RESET");
        button2.setFont(font);
        
        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField);
        mainPanel.add(button1);
        mainPanel.add(button2);
        
        
        this.add(mainPanel,BorderLayout.CENTER);
        
    }
}
