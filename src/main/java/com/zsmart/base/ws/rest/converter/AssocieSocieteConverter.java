package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.AssocieSociete; 
import com.zsmart.base.ws.rest.vo.AssocieSocieteVo; 

 @Component 
public class AssocieSocieteConverter extends AbstractConverter<AssocieSociete,AssocieSocieteVo>{ 

private boolean societe; 

 @Autowired
 private SocieteConverter societeConverter ; 

 @Override 
 public AssocieSociete toItem(AssocieSocieteVo vo) {
 if (vo == null) {
    return null;
      } else {
AssocieSociete item = new AssocieSociete();

 if(societe&& vo.getSocieteVo() != null) {
 item.setSociete(societeConverter.toItem(vo.getSocieteVo()));
} 
 
 if (StringUtil.isNotEmpty(vo.getNom())) {
 item.setNom(vo.getNom());
} 

 if (StringUtil.isNotEmpty(vo.getPrenom())) {
 item.setPrenom(vo.getPrenom());
} 

 if (StringUtil.isNotEmpty(vo.getCin())) {
 item.setCin(vo.getCin());
} 

 if (StringUtil.isNotEmpty(vo.getAdresse())) {
 item.setAdresse(vo.getAdresse());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getNombreAction() != null) {
 item.setNombreAction(NumberUtil.toInt(vo.getNombreAction()));
} 

return item;
 }
 }

  @Override 
 public AssocieSocieteVo toVo(AssocieSociete item) {
 if (item == null) {
    return null;
      } else {
AssocieSocieteVo vo = new AssocieSocieteVo();

 if(societe&& item.getSociete() != null) {
 vo.setSocieteVo(societeConverter.toVo(item.getSociete()));
} 
 
 if (StringUtil.isNotEmpty(item.getNom())) {
 vo.setNom(item.getNom());
} 

 if (StringUtil.isNotEmpty(item.getPrenom())) {
 vo.setPrenom(item.getPrenom());
} 

 if (StringUtil.isNotEmpty(item.getCin())) {
 vo.setCin(item.getCin());
} 

 if (StringUtil.isNotEmpty(item.getAdresse())) {
 vo.setAdresse(item.getAdresse());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getNombreAction() != null) {
 vo.setNombreAction(NumberUtil.toString(item.getNombreAction()));
} 

return vo;
 }
 }
public void init() { 

societe = true; 
}
 } 
