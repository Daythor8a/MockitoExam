package com.ibm.exam.repository.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.junit.Test;
import com.ibm.exam.model.Employee;

public class EmployeeRepositoryImplTest {

  @Test
  public void testEmployeeRepositoryImpl() {
    
  }

  @Test
  public void testFindAll() {
    fail("Not yet implemented");
  }

  @Test
  public void testSave() {
    Employee emp = new Employee("0", 123);
    List<Employee> employees = new ArrayList<>();
    ListIterator<Employee> listIterator = (ListIterator<Employee>) new ArrayList();
    emp.setId("0");
    emp.setSalary(123);
    employees.add(emp);
    listIterator.add(emp);
    assertNotNull(listIterator);
    
  }

}
