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
import com.zsmart.base.service.facade.SecteurActiviteService;
import com.zsmart.base.bean.SecteurActivite;
import com.zsmart.base.ws.rest.vo.SecteurActiviteVo;
import com.zsmart.base.ws.rest.converter.SecteurActiviteConverter;
import com.zsmart.base.service.util.* ;
@RestController
@RequestMapping("/base/SecteurActivite")
@CrossOrigin(origins = {"http://localhost:4200"})
public class SecteurActiviteRest {

 @Autowired 
 private SecteurActiviteService secteurActiviteService;

 @Autowired 
private SecteurActiviteConverter secteurActiviteConverter ;

@PostMapping("/")
public SecteurActiviteVo save(@RequestBody SecteurActiviteVo secteurActiviteVo){
SecteurActivite secteurActivite= secteurActiviteConverter.toItem(secteurActiviteVo);
return secteurActiviteConverter.toVo(secteurActiviteService.save(secteurActivite));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
secteurActiviteService.deleteById(id);
}
@GetMapping("/")
public List<SecteurActiviteVo> findAll(){
return secteurActiviteConverter.toVo(secteurActiviteService.findAll());
}

 public SecteurActiviteConverter getSecteurActiviteConverter(){
return secteurActiviteConverter;
}
 
 public void setSecteurActiviteConverter(SecteurActiviteConverter secteurActiviteConverter){
this.secteurActiviteConverter=secteurActiviteConverter;
}

 public SecteurActiviteService getSecteurActiviteService(){
return secteurActiviteService;
}
 
 public void setSecteurActiviteService(SecteurActiviteService secteurActiviteService){
this.secteurActiviteService=secteurActiviteService;
}

}