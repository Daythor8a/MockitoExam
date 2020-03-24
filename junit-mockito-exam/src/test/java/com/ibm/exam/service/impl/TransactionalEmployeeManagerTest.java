package com.ibm.exam.service.impl;

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
import com.ibm.exam.service.api.TransactionManager;

@RunWith(MockitoJUnitRunner.class)
public class TransactionalEmployeeManagerTest {
  
  @Mock
  TransactionManager transactionManager;

  @Mock
  BankService bankService;
  
//  @Mock
//  EmployeeRepository employeeRepository;
//  
  @InjectMocks
  private TransactionalEmployeeManager transactionalEmployeeM;
  

  @Test
  public void testPayEmployees() {
    
    
    
    Employee emp= new Employee("0", 123);
    List<Employee> employees = new ArrayList<>();
    emp.setId("0");
    emp.setSalary(123);
    employees.add(emp);
   // when(employeeRepository.findAll()).thenReturn(employees);
    when(transactionManager.doInTransaction(Mockito.any())).thenReturn(employees);   
    transactionalEmployeeM.payEmployees();
  }

}
