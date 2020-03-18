package com.zsmart.base.ws.rest.provided ;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.zsmart.base.service.facade.EmployeeService;
import com.zsmart.base.bean.Employee;
import com.zsmart.base.ws.rest.vo.EmployeeVo;
import com.zsmart.base.ws.rest.converter.EmployeeConverter;
import com.zsmart.base.service.util.* ;
@RestController
@RequestMapping("/base/Employee")
@CrossOrigin(origins = {"http://localhost:4200"})
public class EmployeeRest {

 @Autowired 
 private EmployeeService employeeService;

 @Autowired 
private EmployeeConverter employeeConverter ;

@PostMapping("/")
public EmployeeVo save(@RequestBody EmployeeVo employeeVo){
Employee employee= employeeConverter.toItem(employeeVo);
return employeeConverter.toVo(employeeService.save(employee));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
employeeService.deleteById(id);
}
@GetMapping("/")
public List<EmployeeVo> findAll(){
return employeeConverter.toVo(employeeService.findAll());
}

 public EmployeeConverter getEmployeeConverter(){
return employeeConverter;
}
 
 public void setEmployeeConverter(EmployeeConverter employeeConverter){
this.employeeConverter=employeeConverter;
}

 public EmployeeService getEmployeeService(){
return employeeService;
}
 
 public void setEmployeeService(EmployeeService employeeService){
this.employeeService=employeeService;
}

}