package com.jschouw.scheduleMate.service;

import com.jschouw.scheduleMate.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeService extends CrudRepository<Employee, Integer> {



}
