package com.ibm.exam.service.impl;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.ibm.exam.model.Employee;
import com.ibm.exam.repository.EmployeeRepository;
import com.ibm.exam.service.api.BankService;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeManagerTest {
  
  @Mock
  EmployeeRepository employeeRepository;

  @Mock
  BankService bankService;
  
  @InjectMocks
  private EmployeeManager employeeManager;

  @Test
  public void testPayEmployees() {
    
    Employee emp= new Employee(null, 0);
    List<Employee> employees = new ArrayList<>();
    emp.setId("0");
    emp.setSalary(123);
    emp.setPaid(true);
    employees.add(emp);
    when(employeeRepository.findAll()).thenReturn(employees);
    employeeManager.payEmployees(); 
    //fail("Not yet implemented");
  }
  
  @Test(expected = RuntimeException.class)
  public void testPayEmployeesFail() {
    
    Employee emp= new Employee(null, 0);
    List<Employee> employees = new ArrayList<>();
    emp.setId(null);
    emp.setSalary(0);
    employees.add(null);
    //doThrow(RuntimeException.class).when(bankService).pay(Mockito.anyString(), Mockito.anyDouble());
    when(employeeRepository.findAll()).thenReturn(employees);
    employeeManager.payEmployees(); 
    //fail("Not yet implemented");
  }


}
