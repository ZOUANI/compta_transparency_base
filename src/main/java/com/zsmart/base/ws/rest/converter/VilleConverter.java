package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.Ville; 
import com.zsmart.base.ws.rest.vo.VilleVo; 

 @Component 
public class VilleConverter extends AbstractConverter<Ville,VilleVo>{ 


 @Override 
 public Ville toItem(VilleVo vo) {
 if (vo == null) {
    return null;
      } else {
Ville item = new Ville();

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
 public VilleVo toVo(Ville item) {
 if (item == null) {
    return null;
      } else {
VilleVo vo = new VilleVo();

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
