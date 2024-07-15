package com.bankmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    Connection connection;

    Statement statement;
    public Con()
    {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","Kavins@1234");
            statement = connection.createStatement();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
