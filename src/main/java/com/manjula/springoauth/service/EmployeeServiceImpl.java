package com.manjula.springoauth.service;

import com.manjula.springoauth.model.Employee;
import com.manjula.springoauth.repository.EmployeeRepository;
import com.manjula.springoauth.view.EmployeeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void save(EmployeeView view) {
        employeeRepository.save(Employee.valueOf(view));
    }

    @Override
    public List<EmployeeView> findAll() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(Employee::view).collect(Collectors.toList());
    }

    @Override
    public EmployeeView findOne(String id) {
        Employee employee = employeeRepository.findOne(id);
        return employee.view();
    }

    @Override
    public EmployeeView update(EmployeeView view) {
        employeeRepository.save(Employee.valueOf(view));
        return null;
    }

    @Override
    public void delete(String id) {
        employeeRepository.delete(id);
    }

}
