package com.jdbc.controller;

import com.jdbc.services.EmployeesServices;

public class EmployeesController {
    public static void main(String[] args) throws Exception {

        EmployeesServices ss = new EmployeesServices();

        ss.insertData();
        ss.updateData();
        ss.singleData();
        ss.getAllRecord();


    }

}
