package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.Adherent; 
import com.zsmart.base.ws.rest.vo.AdherentVo; 

 @Component 
public class AdherentConverter extends AbstractConverter<Adherent,AdherentVo>{ 

private boolean societes; 

 @Autowired
 private SocieteConverter societeConverter ; 

 @Override 
 public Adherent toItem(AdherentVo vo) {
 if (vo == null) {
    return null;
      } else {
Adherent item = new Adherent();

 if (StringUtil.isNotEmpty(vo.getNom())) {
 item.setNom(vo.getNom());
} 

 if (StringUtil.isNotEmpty(vo.getEmail())) {
 item.setEmail(vo.getEmail());
} 

 if (StringUtil.isNotEmpty(vo.getTel())) {
 item.setTel(vo.getTel());
} 

 if (StringUtil.isNotEmpty(vo.getLogin())) {
 item.setLogin(vo.getLogin());
} 

 if (StringUtil.isNotEmpty(vo.getPassword())) {
 item.setPassword(vo.getPassword());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (ListUtil.isNotEmpty(vo.getSocietesVo ()) && societes) {
 item.setSocietes(societeConverter.toItem(vo.getSocietesVo())); 
} 

return item;
 }
 }

  @Override 
 public AdherentVo toVo(Adherent item) {
 if (item == null) {
    return null;
      } else {
AdherentVo vo = new AdherentVo();

 if (StringUtil.isNotEmpty(item.getNom())) {
 vo.setNom(item.getNom());
} 

 if (StringUtil.isNotEmpty(item.getEmail())) {
 vo.setEmail(item.getEmail());
} 

 if (StringUtil.isNotEmpty(item.getTel())) {
 vo.setTel(item.getTel());
} 

 if (StringUtil.isNotEmpty(item.getLogin())) {
 vo.setLogin(item.getLogin());
} 

 if (StringUtil.isNotEmpty(item.getPassword())) {
 vo.setPassword(item.getPassword());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if(ListUtil.isNotEmpty(item.getSocietes()) && societes) {
 vo.setSocietesVo(societeConverter.toVo(item.getSocietes()));
} 

return vo;
 }
 }
public void init() { 

societes = true; 
}
 } 
