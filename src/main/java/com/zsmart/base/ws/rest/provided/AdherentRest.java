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
import com.zsmart.base.service.facade.AdherentService;
import com.zsmart.base.bean.Adherent;
import com.zsmart.base.ws.rest.vo.AdherentVo;
import com.zsmart.base.ws.rest.converter.AdherentConverter;
import com.zsmart.base.service.util.* ;
@RestController
@RequestMapping("/base/Adherent")
@CrossOrigin(origins = {"http://localhost:4200"})
public class AdherentRest {

 @Autowired 
 private AdherentService adherentService;

 @Autowired 
private AdherentConverter adherentConverter ;

@PostMapping("/")
public AdherentVo save(@RequestBody AdherentVo adherentVo){
Adherent adherent= adherentConverter.toItem(adherentVo);
return adherentConverter.toVo(adherentService.save(adherent));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
adherentService.deleteById(id);
}
@GetMapping("/")
public List<AdherentVo> findAll(){
return adherentConverter.toVo(adherentService.findAll());
}

 public AdherentConverter getAdherentConverter(){
return adherentConverter;
}
 
 public void setAdherentConverter(AdherentConverter adherentConverter){
this.adherentConverter=adherentConverter;
}

 public AdherentService getAdherentService(){
return adherentService;
}
 
 public void setAdherentService(AdherentService adherentService){
this.adherentService=adherentService;
}

}