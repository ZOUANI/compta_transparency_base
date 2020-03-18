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
import com.zsmart.base.service.facade.TypeDeclarationTvaService;
import com.zsmart.base.bean.TypeDeclarationTva;
import com.zsmart.base.ws.rest.vo.TypeDeclarationTvaVo;
import com.zsmart.base.ws.rest.converter.TypeDeclarationTvaConverter;
import com.zsmart.base.service.util.* ;
@RestController
@RequestMapping("/base/TypeDeclarationTva")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TypeDeclarationTvaRest {

 @Autowired 
 private TypeDeclarationTvaService typeDeclarationTvaService;

 @Autowired 
private TypeDeclarationTvaConverter typeDeclarationTvaConverter ;

@PostMapping("/")
public TypeDeclarationTvaVo save(@RequestBody TypeDeclarationTvaVo typeDeclarationTvaVo){
TypeDeclarationTva typeDeclarationTva= typeDeclarationTvaConverter.toItem(typeDeclarationTvaVo);
return typeDeclarationTvaConverter.toVo(typeDeclarationTvaService.save(typeDeclarationTva));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
typeDeclarationTvaService.deleteById(id);
}
@GetMapping("/")
public List<TypeDeclarationTvaVo> findAll(){
return typeDeclarationTvaConverter.toVo(typeDeclarationTvaService.findAll());
}

 public TypeDeclarationTvaConverter getTypeDeclarationTvaConverter(){
return typeDeclarationTvaConverter;
}
 
 public void setTypeDeclarationTvaConverter(TypeDeclarationTvaConverter typeDeclarationTvaConverter){
this.typeDeclarationTvaConverter=typeDeclarationTvaConverter;
}

 public TypeDeclarationTvaService getTypeDeclarationTvaService(){
return typeDeclarationTvaService;
}
 
 public void setTypeDeclarationTvaService(TypeDeclarationTvaService typeDeclarationTvaService){
this.typeDeclarationTvaService=typeDeclarationTvaService;
}

}