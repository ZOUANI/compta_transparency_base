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
import com.zsmart.base.service.facade.ComptableService;
import com.zsmart.base.bean.Comptable;
import com.zsmart.base.ws.rest.vo.ComptableVo;
import com.zsmart.base.ws.rest.converter.ComptableConverter;
import com.zsmart.base.service.util.* ;
@RestController
@RequestMapping("/base/Comptable")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ComptableRest {

 @Autowired 
 private ComptableService comptableService;

 @Autowired 
private ComptableConverter comptableConverter ;

@PostMapping("/")
public ComptableVo save(@RequestBody ComptableVo comptableVo){
Comptable comptable= comptableConverter.toItem(comptableVo);
return comptableConverter.toVo(comptableService.save(comptable));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
comptableService.deleteById(id);
}
@GetMapping("/")
public List<ComptableVo> findAll(){
return comptableConverter.toVo(comptableService.findAll());
}

 public ComptableConverter getComptableConverter(){
return comptableConverter;
}
 
 public void setComptableConverter(ComptableConverter comptableConverter){
this.comptableConverter=comptableConverter;
}

 public ComptableService getComptableService(){
return comptableService;
}
 
 public void setComptableService(ComptableService comptableService){
this.comptableService=comptableService;
}

}