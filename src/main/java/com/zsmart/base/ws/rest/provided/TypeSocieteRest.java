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
import com.zsmart.base.service.facade.TypeSocieteService;
import com.zsmart.base.bean.TypeSociete;
import com.zsmart.base.ws.rest.vo.TypeSocieteVo;
import com.zsmart.base.ws.rest.converter.TypeSocieteConverter;
import com.zsmart.base.service.util.* ;
@RestController
@RequestMapping("/base/TypeSociete")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TypeSocieteRest {

 @Autowired 
 private TypeSocieteService typeSocieteService;

 @Autowired 
private TypeSocieteConverter typeSocieteConverter ;

@PostMapping("/")
public TypeSocieteVo save(@RequestBody TypeSocieteVo typeSocieteVo){
TypeSociete typeSociete= typeSocieteConverter.toItem(typeSocieteVo);
return typeSocieteConverter.toVo(typeSocieteService.save(typeSociete));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
typeSocieteService.deleteById(id);
}
@GetMapping("/")
public List<TypeSocieteVo> findAll(){
return typeSocieteConverter.toVo(typeSocieteService.findAll());
}

 public TypeSocieteConverter getTypeSocieteConverter(){
return typeSocieteConverter;
}
 
 public void setTypeSocieteConverter(TypeSocieteConverter typeSocieteConverter){
this.typeSocieteConverter=typeSocieteConverter;
}

 public TypeSocieteService getTypeSocieteService(){
return typeSocieteService;
}
 
 public void setTypeSocieteService(TypeSocieteService typeSocieteService){
this.typeSocieteService=typeSocieteService;
}

}