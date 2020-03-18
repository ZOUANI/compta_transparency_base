package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.SecteurActiviteSociete; 
import com.zsmart.base.ws.rest.vo.SecteurActiviteSocieteVo; 

 @Component 
public class SecteurActiviteSocieteConverter extends AbstractConverter<SecteurActiviteSociete,SecteurActiviteSocieteVo>{ 

private boolean secteurActivite; 

 @Autowired
 private SecteurActiviteConverter secteurActiviteConverter ; 
private boolean societe; 

 @Autowired
 private SocieteConverter societeConverter ; 

 @Override 
 public SecteurActiviteSociete toItem(SecteurActiviteSocieteVo vo) {
 if (vo == null) {
    return null;
      } else {
SecteurActiviteSociete item = new SecteurActiviteSociete();

 if(secteurActivite&& vo.getSecteurActiviteVo() != null) {
 item.setSecteurActivite(secteurActiviteConverter.toItem(vo.getSecteurActiviteVo()));
} 
 
 if(societe&& vo.getSocieteVo() != null) {
 item.setSociete(societeConverter.toItem(vo.getSocieteVo()));
} 
 
 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

return item;
 }
 }

  @Override 
 public SecteurActiviteSocieteVo toVo(SecteurActiviteSociete item) {
 if (item == null) {
    return null;
      } else {
SecteurActiviteSocieteVo vo = new SecteurActiviteSocieteVo();

 if(secteurActivite&& item.getSecteurActivite() != null) {
 vo.setSecteurActiviteVo(secteurActiviteConverter.toVo(item.getSecteurActivite()));
} 
 
 if(societe&& item.getSociete() != null) {
 vo.setSocieteVo(societeConverter.toVo(item.getSociete()));
} 
 
 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

return vo;
 }
 }
public void init() { 

secteurActivite = true; 

societe = true; 
}
 } 
