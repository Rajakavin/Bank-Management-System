package com.bankmanagementsystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1,r2,m1,m2,m3;

    JButton next;


    JTextField textName,textFname,textEmail,textAdd,textCity,textPin,textState;

    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() %9000L)+1000L;

    String first = " " + Math.abs(first4);

    Signup()
    {
        super("APPLICATION FROM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/R.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO. "+first);
        label1.setBounds(160,50,500,40);
        label1.setFont(new Font("Raleway",Font.BOLD,24));
        label1.setForeground(Color.WHITE);
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(360,100,500,40);
        label2.setFont(new Font("Raleway",Font.BOLD,18));
        label2.setForeground(Color.white);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(325,130,500,40);
        label3.setFont(new Font("Raleway",Font.BOLD,18));
        label3.setForeground(Color.white);
        add(label3);

        JLabel labelName = new JLabel("Name : ");
        labelName.setBounds(150,170,300,30);
        labelName.setFont(new Font("Raleway",Font.BOLD,16));
        labelName.setForeground(Color.white);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,174,350,20);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name : ");
        labelfName.setBounds(150,200,300,30);
        labelfName.setFont(new Font("Raleway",Font.BOLD,16));
        labelfName.setForeground(Color.white);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,204,350,20);
        add(textFname);

        JLabel DOB = new JLabel("Date Of Birth : ");
        DOB.setBounds(150,230,300,30);
        DOB.setFont(new Font("Raleway",Font.BOLD,16));
        DOB.setForeground(Color.white);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,240,350,20);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender:");
        labelG.setFont(new Font("Raleway",Font.BOLD,16));
        labelG.setBounds(150,260,300,30);
        labelG.setForeground(Color.white);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,  14));
        r1.setBackground(new Color(0,0,0));
        r1.setForeground(Color.WHITE);
        r1.setBounds( 300,  270, 100,  30) ;
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD,  14));
        r2.setBackground(new Color(0,0,0));
        r2.setForeground(Color.WHITE);
        r2.setBounds( 420,  270, 100,  30) ;
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel( "Email address :");
        labelEmail. setFont (new Font ( "Raleway", Font.BOLD,16));
        labelEmail.setForeground(Color.WHITE);
        labelEmail. setBounds(150, 290, 300,  30) ;
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,300,350,20);
        add(textEmail);

        JLabel labelMs = new JLabel( "Marital Status :");
        labelMs. setFont (new Font ( "Raleway", Font.BOLD,16));
        labelMs.setForeground(Color.WHITE);
        labelMs. setBounds(150, 320, 300,  30) ;
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway", Font.BOLD,  14));
        m1.setBackground(new Color(0,0,0));
        m1.setForeground(Color.WHITE);
        m1.setBounds( 300,  320, 100,  30) ;
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway", Font.BOLD,  14));
        m2.setBackground(new Color(0,0,0));
        m2.setForeground(Color.WHITE);
        m2.setBounds( 400,  320, 100,  30) ;
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Raleway", Font.BOLD,  14));
        m3.setBackground(new Color(0,0,0));
        m3.setForeground(Color.WHITE);
        m3.setBounds( 550,  320, 100,  30) ;
        add(m3);

        ButtonGroup bbuttonGroup = new ButtonGroup();
        bbuttonGroup.add(m1);
        bbuttonGroup.add(m2);
        bbuttonGroup.add(m3);

        JLabel labelAdd = new JLabel( "Address :");
        labelAdd. setFont (new Font ( "Raleway", Font.BOLD,16));
        labelAdd.setForeground(Color.WHITE);
        labelAdd. setBounds(150, 350, 300,  30) ;
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,360,350,20);
        add(textAdd);

        JLabel labelCity = new JLabel( "City :");
        labelCity. setFont (new Font ( "Raleway", Font.BOLD,16));
        labelCity.setForeground(Color.WHITE);
        labelCity. setBounds(150, 380, 300,  30) ;
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,390,350,20);
        add(textCity);

        JLabel labelPin = new JLabel( "Pin Code :");
        labelPin. setFont (new Font ( "Raleway", Font.BOLD,16));
        labelPin.setForeground(Color.WHITE);
        labelPin. setBounds(150, 410, 300,  30) ;
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,420,350,20);
        add(textPin);

        JLabel labelState = new JLabel( "State :");
        labelState. setFont (new Font ( "Raleway", Font.BOLD,16));
        labelState.setForeground(Color.WHITE);
        labelState. setBounds(150, 440, 300,  30) ;
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,450,350,20);
        add(textState);


        next = new JButton( "Next");
        next.setFont (new Font( "Raleway", Font. BOLD,14));
        next.setBackground (Color.BLACK);
        next.setForeground (Color.WHITE);
        next.setBounds(550,500,80,30);
        next.addActionListener(this);
        add(next);







        getContentPane().setBackground(new Color(0,0,0));
        setLayout(null);
        setSize(850,600);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected())
        {
            gender = "Male";
        } else if (r2.isSelected()) {

            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected())
        {
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        } else if (m3.isSelected()) {
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try
        {
            if(textName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else if(textFname.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else if(textEmail.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else if(textState.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else
            {
                Con con1 = new Con();
                String q = "insert into signup value('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);

            }
        }catch (Exception E)
        {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}
