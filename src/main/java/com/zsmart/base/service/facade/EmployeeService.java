package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.Employee;
import com.zsmart.base.bean.Societe; 
import com.zsmart.base.bean.EtatEmployee; 
public interface EmployeeService {

public Employee save(Employee employee); 
public List<Employee>  findAll();
public Employee findById(Long id);
public int delete(Employee employee);
public void  deleteById(Long id);
public void clone(Employee employee,Employee employeeClone);
public Employee clone(Employee employee);
public List<Employee> clone(List<Employee>employees);
 public List<Employee>  findByCriteria(String nom,String prenom,String cin,String adresse,Long idMin,Long idMax,BigDecimal salaireMin,BigDecimal salaireMax,BigDecimal primeMin,BigDecimal primeMax);

}
