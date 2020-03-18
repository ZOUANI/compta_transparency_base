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
import com.zsmart.base.service.facade.AssocieSocieteService;
import com.zsmart.base.bean.AssocieSociete;
import com.zsmart.base.ws.rest.vo.AssocieSocieteVo;
import com.zsmart.base.ws.rest.converter.AssocieSocieteConverter;
import com.zsmart.base.service.util.* ;
@RestController
@RequestMapping("/base/AssocieSociete")
@CrossOrigin(origins = {"http://localhost:4200"})
public class AssocieSocieteRest {

 @Autowired 
 private AssocieSocieteService associeSocieteService;

 @Autowired 
private AssocieSocieteConverter associeSocieteConverter ;

@PostMapping("/")
public AssocieSocieteVo save(@RequestBody AssocieSocieteVo associeSocieteVo){
AssocieSociete associeSociete= associeSocieteConverter.toItem(associeSocieteVo);
return associeSocieteConverter.toVo(associeSocieteService.save(associeSociete));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
associeSocieteService.deleteById(id);
}
@GetMapping("/")
public List<AssocieSocieteVo> findAll(){
return associeSocieteConverter.toVo(associeSocieteService.findAll());
}

 public AssocieSocieteConverter getAssocieSocieteConverter(){
return associeSocieteConverter;
}
 
 public void setAssocieSocieteConverter(AssocieSocieteConverter associeSocieteConverter){
this.associeSocieteConverter=associeSocieteConverter;
}

 public AssocieSocieteService getAssocieSocieteService(){
return associeSocieteService;
}
 
 public void setAssocieSocieteService(AssocieSocieteService associeSocieteService){
this.associeSocieteService=associeSocieteService;
}

}