package com.manjula.springoauth.service;

import com.manjula.springoauth.view.EmployeeView;

import java.util.List;

public interface EmployeeService {

    void save(EmployeeView employee);

    List<EmployeeView> findAll();

    EmployeeView findOne(String id);

    EmployeeView update(EmployeeView employee);

    void delete(String id);

}
