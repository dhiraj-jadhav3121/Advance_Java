package com.jdbc.services;

import com.jdbc.dao.EmployeesDao;

public class EmployeesServices {
    EmployeesDao ed = new EmployeesDao();

    public void insertData() throws Exception {
        ed.insertData();

    }

    public void updateData() throws Exception {
        ed.updateData();

    }

    public void singleData() throws Exception {
        ed.singleData();
    }

    public void getAllRecord() throws Exception {
        ed.getAllRecord();


    }

}
