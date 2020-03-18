package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.TypeSociete; 
import com.zsmart.base.ws.rest.vo.TypeSocieteVo; 

 @Component 
public class TypeSocieteConverter extends AbstractConverter<TypeSociete,TypeSocieteVo>{ 


 @Override 
 public TypeSociete toItem(TypeSocieteVo vo) {
 if (vo == null) {
    return null;
      } else {
TypeSociete item = new TypeSociete();

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
 public TypeSocieteVo toVo(TypeSociete item) {
 if (item == null) {
    return null;
      } else {
TypeSocieteVo vo = new TypeSocieteVo();

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
