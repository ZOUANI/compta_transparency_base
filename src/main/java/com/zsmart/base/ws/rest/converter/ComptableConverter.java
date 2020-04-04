package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.Comptable; 
import com.zsmart.base.ws.rest.vo.ComptableVo; 

 @Component 
public class ComptableConverter extends AbstractConverter<Comptable,ComptableVo>{ 

private boolean ville; 

 @Autowired
 private VilleConverter villeConverter ; 

 @Override 
 public Comptable toItem(ComptableVo vo) {
 if (vo == null) {
    return null;
      } else {
Comptable item = new Comptable();

 if(ville&& vo.getVilleVo() != null) {
 item.setVille(villeConverter.toItem(vo.getVilleVo()));
} 
 
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

return item;
 }
 }

  @Override 
 public ComptableVo toVo(Comptable item) {
 if (item == null) {
    return null;
      } else {
ComptableVo vo = new ComptableVo();

 if(ville&& item.getVille() != null) {
 vo.setVilleVo(villeConverter.toVo(item.getVille()));
} 
 
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

return vo;
 }
 }
public void init() { 

ville = true; 
}
 } 
