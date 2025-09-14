package com.jdbc.services;

import com.jdbc.dao.EmployeesDao;

import java.sql.SQLException;

public class EmployeesServices {
    public void insertData() throws Exception {
        EmployeesDao ed = new EmployeesDao();
        ed.insertData();

    }
    public void updateData() throws Exception {
        EmployeesDao ed = new EmployeesDao();
        ed.updateData();

    }
    public void singleData() throws Exception {
        EmployeesDao ed = new EmployeesDao();
       ed.singleData();
    }
    public void getAllRecord() throws Exception{
        EmployeesDao ed = new EmployeesDao();
        ed.getAllRecord();


    }

}
