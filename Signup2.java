package com.bankmanagementsystem;

import com.toedter.components.JLocaleChooserBeanInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JButton next;
    JRadioButton r1,r2,e1,e2;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAadhar;
    String formno;

    Signup2(String formno)
    {

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/R.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,10,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2:-");
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setBounds(300,50,550,25);
        l1.setBackground(Color.BLACK);
        l1.setForeground(Color.WHITE);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,18));
        l2.setBounds(300,80,550,25);
        l2.setBackground(Color.BLACK);
        l2.setForeground(Color.white);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway" , Font.BOLD,18));
        l3.setBounds(150,110,100,25);
        l3.setBackground(Color.BLACK);
        l3.setForeground(Color.white);
        add(l3);


        String religion[] = {"Hindu","Sikh","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(0,0,0));
        comboBox.setFont(new Font("Italic ",Font.BOLD,14));
        comboBox.setBounds(300,110,300,30);
        comboBox.setForeground(Color.WHITE);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Italic" , Font.BOLD,18));
        l4.setBounds(150,150,100,25);
        l4.setBackground(Color.BLACK);
        l4.setForeground(Color.white);
        add(l4);

        String Category[] = {"Genral","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(0,0,0));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(300,150,300,30);
        comboBox2.setForeground(Color.WHITE);
        add(comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setBounds(150,190,100,25);
        l5.setBackground(Color.BLACK);
        l5.setForeground(Color.WHITE);
        add(l5);

        String income [] = {"Null","<1,50,000","<2,50,000", "5,00,000", "Uptp 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(0,0,0));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(300,190,300,30);
        comboBox3.setForeground(Color.white);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(150,230,150,30);
        l6.setBackground(Color.BLACK);
        l6.setForeground(Color.WHITE);
        add(l6);

        String educational [] = {"Non-Graduate","Graduate","Post-Graduate", "Doctrate", "Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(0,0,0));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(300,230,300,30);
        comboBox4.setForeground(Color.white);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(150,270,150,30);
        l7.setBackground(Color.BLACK);
        l7.setForeground(Color.WHITE);
        add(l7);

        String Occupation [] = {"Salaried","Self-Employed","Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(0,0,0));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(300,270,300,30);
        comboBox5.setForeground(Color.white);
        add(comboBox5);

        JLabel l8 = new JLabel("Pan Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(150,310,150,30);
        l8.setBackground(Color.BLACK);
        l8.setForeground(Color.WHITE);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD,18));
        textPan.setBounds(300,310,300,25);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(150,350,180,30);
        l9.setBackground(Color.BLACK);
        l9.setForeground(Color.WHITE);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway", Font.BOLD,18));
        textAadhar.setBounds(300,350,300,25);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setBounds(150,390,180,30);
        l10.setBackground(Color.BLACK);
        l10.setForeground(Color.WHITE);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(0,0,0));
        r1.setBounds(320,390,100,30);
        r1.setForeground(Color.white);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(0,0,0));
        r2.setBounds(450,390,100,30);
        r2.setForeground(Color.white);
        add(r2);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r1);
        buttonGroup2.add(r2);

        JLabel l11 = new JLabel("Existing Account:");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(150,430,180,30);
        l11.setBackground(Color.BLACK);
        l11.setForeground(Color.WHITE);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD,14));
        e1.setBackground(new Color(0,0,0));
        e1.setBounds(320,430,100,30);
        e1.setForeground(Color.white);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD,14));
        e2.setBackground(new Color(0,0,0));
        e2.setBounds(450,430,100,30);
        e2.setForeground(Color.white);
        add(e2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(e1);
        buttonGroup.add(e2);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(600,10,100,30);
        l12.setBackground(Color.BLACK);
        l12.setForeground(Color.WHITE);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(680,10,60,30);
        l13.setForeground(Color.white);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(320,480,100,30);
        next.addActionListener(this);
        add(next);




        setLayout(null);
        setSize(750,580);
        setLocation(250,60);
        getContentPane().setBackground(new Color(0,0,0));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String)comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String addhar = textAadhar.getText();

        String scitizen = " ";
        if ((r1.isSelected())){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen ="No";
        }
        String eAccount = " ";
        if ((r1.isSelected())){
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount ="No";
        }

        try{
            if (textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Con c1 = new Con();
                String q = "insert into Signuptwo values('"+formno+"', '"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
               c1.statement.executeUpdate(q);
               new Signup3(formno);
               setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {

        new Signup2("");
    }

}
