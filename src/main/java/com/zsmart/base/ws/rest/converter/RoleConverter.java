package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.Role; 
import com.zsmart.base.ws.rest.vo.RoleVo; 

 @Component 
public class RoleConverter extends AbstractConverter<Role,RoleVo>{ 


 @Override 
 public Role toItem(RoleVo vo) {
 if (vo == null) {
    return null;
      } else {
Role item = new Role();

 if (StringUtil.isNotEmpty(vo.getLibelle())) {
 item.setLibelle(vo.getLibelle());
} 

 if (StringUtil.isNotEmpty(vo.getLien())) {
 item.setLien(vo.getLien());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

return item;
 }
 }

  @Override 
 public RoleVo toVo(Role item) {
 if (item == null) {
    return null;
      } else {
RoleVo vo = new RoleVo();

 if (StringUtil.isNotEmpty(item.getLibelle())) {
 vo.setLibelle(item.getLibelle());
} 

 if (StringUtil.isNotEmpty(item.getLien())) {
 vo.setLien(item.getLien());
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
