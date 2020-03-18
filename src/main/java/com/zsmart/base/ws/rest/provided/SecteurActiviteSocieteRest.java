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
import com.zsmart.base.service.facade.SecteurActiviteSocieteService;
import com.zsmart.base.bean.SecteurActiviteSociete;
import com.zsmart.base.ws.rest.vo.SecteurActiviteSocieteVo;
import com.zsmart.base.ws.rest.converter.SecteurActiviteSocieteConverter;
import com.zsmart.base.service.util.* ;
@RestController
@RequestMapping("/base/SecteurActiviteSociete")
@CrossOrigin(origins = {"http://localhost:4200"})
public class SecteurActiviteSocieteRest {

 @Autowired 
 private SecteurActiviteSocieteService secteurActiviteSocieteService;

 @Autowired 
private SecteurActiviteSocieteConverter secteurActiviteSocieteConverter ;

@PostMapping("/")
public SecteurActiviteSocieteVo save(@RequestBody SecteurActiviteSocieteVo secteurActiviteSocieteVo){
SecteurActiviteSociete secteurActiviteSociete= secteurActiviteSocieteConverter.toItem(secteurActiviteSocieteVo);
return secteurActiviteSocieteConverter.toVo(secteurActiviteSocieteService.save(secteurActiviteSociete));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
secteurActiviteSocieteService.deleteById(id);
}
@GetMapping("/")
public List<SecteurActiviteSocieteVo> findAll(){
return secteurActiviteSocieteConverter.toVo(secteurActiviteSocieteService.findAll());
}

 public SecteurActiviteSocieteConverter getSecteurActiviteSocieteConverter(){
return secteurActiviteSocieteConverter;
}
 
 public void setSecteurActiviteSocieteConverter(SecteurActiviteSocieteConverter secteurActiviteSocieteConverter){
this.secteurActiviteSocieteConverter=secteurActiviteSocieteConverter;
}

 public SecteurActiviteSocieteService getSecteurActiviteSocieteService(){
return secteurActiviteSocieteService;
}
 
 public void setSecteurActiviteSocieteService(SecteurActiviteSocieteService secteurActiviteSocieteService){
this.secteurActiviteSocieteService=secteurActiviteSocieteService;
}

}