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
import com.zsmart.base.service.facade.EtatEmployeeService;
import com.zsmart.base.bean.EtatEmployee;
import com.zsmart.base.ws.rest.vo.EtatEmployeeVo;
import com.zsmart.base.ws.rest.converter.EtatEmployeeConverter;
import com.zsmart.base.service.util.* ;
@RestController
@RequestMapping("/base/EtatEmployee")
@CrossOrigin(origins = {"http://localhost:4200"})
public class EtatEmployeeRest {

 @Autowired 
 private EtatEmployeeService etatEmployeeService;

 @Autowired 
private EtatEmployeeConverter etatEmployeeConverter ;

@PostMapping("/")
public EtatEmployeeVo save(@RequestBody EtatEmployeeVo etatEmployeeVo){
EtatEmployee etatEmployee= etatEmployeeConverter.toItem(etatEmployeeVo);
return etatEmployeeConverter.toVo(etatEmployeeService.save(etatEmployee));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
etatEmployeeService.deleteById(id);
}
@GetMapping("/")
public List<EtatEmployeeVo> findAll(){
return etatEmployeeConverter.toVo(etatEmployeeService.findAll());
}

 public EtatEmployeeConverter getEtatEmployeeConverter(){
return etatEmployeeConverter;
}
 
 public void setEtatEmployeeConverter(EtatEmployeeConverter etatEmployeeConverter){
this.etatEmployeeConverter=etatEmployeeConverter;
}

 public EtatEmployeeService getEtatEmployeeService(){
return etatEmployeeService;
}
 
 public void setEtatEmployeeService(EtatEmployeeService etatEmployeeService){
this.etatEmployeeService=etatEmployeeService;
}

}