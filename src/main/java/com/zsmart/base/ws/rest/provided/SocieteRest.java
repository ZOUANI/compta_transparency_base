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
import com.zsmart.base.service.facade.SocieteService;
import com.zsmart.base.bean.Societe;
import com.zsmart.base.ws.rest.vo.SocieteVo;
import com.zsmart.base.ws.rest.converter.SocieteConverter;
import com.zsmart.base.service.util.* ;
@RestController
@RequestMapping("/base/Societe")
@CrossOrigin(origins = {"http://localhost:4200"})
public class SocieteRest {

 @Autowired 
 private SocieteService societeService;

 @Autowired 
private SocieteConverter societeConverter ;

@PostMapping("/")
public SocieteVo save(@RequestBody SocieteVo societeVo){
Societe societe= societeConverter.toItem(societeVo);
return societeConverter.toVo(societeService.save(societe));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
societeService.deleteById(id);
}
@GetMapping("/")
public List<SocieteVo> findAll(){
return societeConverter.toVo(societeService.findAll());
}

 public SocieteConverter getSocieteConverter(){
return societeConverter;
}
 
 public void setSocieteConverter(SocieteConverter societeConverter){
this.societeConverter=societeConverter;
}

 public SocieteService getSocieteService(){
return societeService;
}
 
 public void setSocieteService(SocieteService societeService){
this.societeService=societeService;
}

}