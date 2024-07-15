package com.bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame  implements ActionListener {

    JLabel label1,label2,label3;
    JTextField textFiled2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;
    Login()
    {
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/R.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(370,10,100,100);
        add(image);

//        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
//        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
//        ImageIcon ii3 = new ImageIcon(ii2);
//        JLabel iimage = new JLabel(ii3);
//        iimage.setBounds(700,350,100,100);
//        add(iimage);


        label1 = new JLabel("WELCOME TO ATM ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantaGrade",Font.BOLD,24));
        label1.setBounds(300,110,450,40);
//        label1.setBackground(Color.white);
        add(label1);


        label2 = new JLabel("CARD NO: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralay",Font.BOLD,14));
        label2.setBounds(250,130,375,70);
        add(label2);

        textFiled2 = new JTextField(15);
        textFiled2.setBounds(350,157,170,18);
        textFiled2.setFont(new Font("Arial",Font.BOLD,14));
        add(textFiled2);


        label3 = new JLabel("PIN NO: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralay",Font.BOLD,14));
        label3.setBounds(250,160,375,70);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(350,187,170,18);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Ralay",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(320,220,100,25);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Ralay",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,220,100,25);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Ralay",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(350,257,150,30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/BankImage.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,478,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,478);
        add(iiimage);



        setLayout(null);
        setSize(850,478);
        setLocation(350,100);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1)
            {
                Con c = new Con();
                String cardno = textFiled2.getText();
                String pin = passwordField3.getText();
                String q = "select * from login where card_number = '"+cardno+"' and  pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }
                
            } else if (e.getSource() ==button2) {
                textFiled2.setText("");

                passwordField3.setText("");
                
            } else if (e.getSource() == button3) {

                new Signup();
                setVisible(false);
            }

        } catch(Exception E){
            E.printStackTrace();

        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
