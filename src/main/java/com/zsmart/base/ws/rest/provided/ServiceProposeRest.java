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
import com.zsmart.base.service.facade.ServiceProposeService;
import com.zsmart.base.bean.ServicePropose;
import com.zsmart.base.ws.rest.vo.ServiceProposeVo;
import com.zsmart.base.ws.rest.converter.ServiceProposeConverter;
import com.zsmart.base.service.util.* ;
@RestController
@RequestMapping("/base/ServicePropose")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ServiceProposeRest {

 @Autowired 
 private ServiceProposeService serviceProposeService;

 @Autowired 
private ServiceProposeConverter serviceProposeConverter ;

@PostMapping("/")
public ServiceProposeVo save(@RequestBody ServiceProposeVo serviceProposeVo){
ServicePropose servicePropose= serviceProposeConverter.toItem(serviceProposeVo);
return serviceProposeConverter.toVo(serviceProposeService.save(servicePropose));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
serviceProposeService.deleteById(id);
}
@GetMapping("/")
public List<ServiceProposeVo> findAll(){
return serviceProposeConverter.toVo(serviceProposeService.findAll());
}

 public ServiceProposeConverter getServiceProposeConverter(){
return serviceProposeConverter;
}
 
 public void setServiceProposeConverter(ServiceProposeConverter serviceProposeConverter){
this.serviceProposeConverter=serviceProposeConverter;
}

 public ServiceProposeService getServiceProposeService(){
return serviceProposeService;
}
 
 public void setServiceProposeService(ServiceProposeService serviceProposeService){
this.serviceProposeService=serviceProposeService;
}

}