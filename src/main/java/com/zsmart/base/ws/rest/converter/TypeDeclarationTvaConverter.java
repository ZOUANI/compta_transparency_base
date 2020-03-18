package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.TypeDeclarationTva; 
import com.zsmart.base.ws.rest.vo.TypeDeclarationTvaVo; 

 @Component 
public class TypeDeclarationTvaConverter extends AbstractConverter<TypeDeclarationTva,TypeDeclarationTvaVo>{ 


 @Override 
 public TypeDeclarationTva toItem(TypeDeclarationTvaVo vo) {
 if (vo == null) {
    return null;
      } else {
TypeDeclarationTva item = new TypeDeclarationTva();

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
 public TypeDeclarationTvaVo toVo(TypeDeclarationTva item) {
 if (item == null) {
    return null;
      } else {
TypeDeclarationTvaVo vo = new TypeDeclarationTvaVo();

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
