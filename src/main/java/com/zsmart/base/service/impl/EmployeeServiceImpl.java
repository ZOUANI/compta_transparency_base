
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.EmployeeService ; 
import com.zsmart.base.dao.EmployeeDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.base.bean.Societe; 
import com.zsmart.base.service.facade.SocieteService ; 
import com.zsmart.base.bean.EtatEmployee; 
import com.zsmart.base.service.facade.EtatEmployeeService ; 

 @Service  

 public class EmployeeServiceImpl implements EmployeeService  {


 @Autowired 

 private EmployeeDao employeeDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private SocieteService societeService; 

 @Autowired 

 private EtatEmployeeService etatemployeeService; 

 @Override 
public Employee  save (Employee employee){

if(employee== null){ 
 return null; 
}else {
 employeeDao.save(employee);
return employee;
}
}

 @Override 
public List< Employee>  findAll(){
 return employeeDao.findAll();
}

 @Override 
public Employee findById(Long id){
 return employeeDao.getOne(id);
}

 @Override 
public int delete(Employee employee){
if(employee== null){ 
  return -1; 
}else {
 employeeDao.delete(employee);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       employeeDao.deleteById(id);
}
public void clone(Employee employee,Employee employeeClone){
if(employee!= null && employeeClone != null){
employeeClone.setId(employee.getId());
employeeClone.setNom(employee.getNom());
employeeClone.setPrenom(employee.getPrenom());
employeeClone.setCin(employee.getCin());
employeeClone.setAdresse(employee.getAdresse());
employeeClone.setSalaire(employee.getSalaire());
employeeClone.setPrime(employee.getPrime());
employeeClone.setSociete(societeService.clone(employee.getSociete()));
employeeClone.setEtatEmployee(etatemployeeService.clone(employee.getEtatEmployee()));
}
}
public Employee clone(Employee employee){
if(employee== null){       return null ;
}else{Employee employeeClone= new Employee();
employeeClone.setId(employee.getId());
employeeClone.setNom(employee.getNom());
employeeClone.setPrenom(employee.getPrenom());
employeeClone.setCin(employee.getCin());
employeeClone.setAdresse(employee.getAdresse());
employeeClone.setSalaire(employee.getSalaire());
employeeClone.setPrime(employee.getPrime());
employeeClone.setSociete(societeService.clone(employee.getSociete()));
employeeClone.setEtatEmployee(etatemployeeService.clone(employee.getEtatEmployee()));
return employeeClone;
}
}
public List<Employee> clone(List<Employee>employees){
if(employees== null){
       return null ;
}else{List<Employee> employeesClone = new ArrayList();
	 	 	 employees.forEach((employee)->{employeesClone.add(clone(employee));
});return employeesClone;
}
}
 @Override 
 public List< Employee>  findByCriteria(String nom,String prenom,String cin,String adresse,Long idMin,Long idMax,BigDecimal salaireMin,BigDecimal salaireMax,BigDecimal primeMin,BigDecimal primeMax){
 return entityManager.createQuery(constructQuery(nom,prenom,cin,adresse,idMin,idMax,salaireMin,salaireMax,primeMin,primeMax)).getResultList(); 
 }
private String constructQuery(String nom,String prenom,String cin,String adresse,Long idMin,Long idMax,BigDecimal salaireMin,BigDecimal salaireMax,BigDecimal primeMin,BigDecimal primeMax){
String query = "SELECT e FROM Employee e where 1=1 ";
query += SearchUtil.addConstraint( "e", "nom","=",nom);
query += SearchUtil.addConstraint( "e", "prenom","=",prenom);
query += SearchUtil.addConstraint( "e", "cin","=",cin);
query += SearchUtil.addConstraint( "e", "adresse","=",adresse);
query += SearchUtil.addConstraintMinMax("e", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("e", "salaire", salaireMin, salaireMax);
query += SearchUtil.addConstraintMinMax("e", "prime", primeMin, primeMax);

  return query; 
}
}
