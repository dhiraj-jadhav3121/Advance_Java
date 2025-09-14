package com.jdbc.dao;


import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class EmployeesDao {


    public void insertData() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/employees",
                        "root",
                        "Amol@1234");

        Statement s = c.createStatement();
        int a = s.executeUpdate("insert into student(id,name,city,profile)values(1,'Aditya','pune','developer'),(2, 'Dhiraj','hinjewadi','testing'), (3,'omkar','dhule','python')");

        if (a > 0) {
            System.out.println("Data inserted successfully....");
        } else {
            System.out.println("Data Not-inserted successfully....");

        }
        c.close();

    }

    public void updateData() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "Amol@1234");
        Statement s = c.createStatement();
        int rs = s.executeUpdate("update student set name = 'Aditya' where id = 1");

        if (rs > 0) {
            System.out.println("Data updated successfully...");
        } else {
            System.out.println("Data not updated...");
        }
        c.close();

    }

    public void singleData() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "Amol@1234");
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("select * from student where id = 1");

        if (rs.next()) {
            System.out.println(" Data is Executed..");
        } else {
            System.out.println(" Data is Not-Executed..");

        }
        s.close();

    }

    public void getAllRecord() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "Amol@1234");

        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("select * from student");

        if (rs.next()) {
            System.out.println("Get all Record Successfully ");

        } else {
            System.out.println("Not-Get all Record Successfully ");

        }
        c.close();
    }

}



