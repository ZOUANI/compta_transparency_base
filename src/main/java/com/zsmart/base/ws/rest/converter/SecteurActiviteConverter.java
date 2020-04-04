package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.SecteurActivite; 
import com.zsmart.base.ws.rest.vo.SecteurActiviteVo; 

 @Component 
public class SecteurActiviteConverter extends AbstractConverter<SecteurActivite,SecteurActiviteVo>{ 


 @Override 
 public SecteurActivite toItem(SecteurActiviteVo vo) {
 if (vo == null) {
    return null;
      } else {
SecteurActivite item = new SecteurActivite();

 if (StringUtil.isNotEmpty(vo.getLibelle())) {
 item.setLibelle(vo.getLibelle());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

return item;
 }
 }

  @Override 
 public SecteurActiviteVo toVo(SecteurActivite item) {
 if (item == null) {
    return null;
      } else {
SecteurActiviteVo vo = new SecteurActiviteVo();

 if (StringUtil.isNotEmpty(item.getLibelle())) {
 vo.setLibelle(item.getLibelle());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

return vo;
 }
 }
public void init() { 
}
 } 
