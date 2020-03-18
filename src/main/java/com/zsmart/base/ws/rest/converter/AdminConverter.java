package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.Admin; 
import com.zsmart.base.ws.rest.vo.AdminVo; 

 @Component 
public class AdminConverter extends AbstractConverter<Admin,AdminVo>{ 


 @Override 
 public Admin toItem(AdminVo vo) {
 if (vo == null) {
    return null;
      } else {
Admin item = new Admin();

 if (StringUtil.isNotEmpty(vo.getLogin())) {
 item.setLogin(vo.getLogin());
} 

 if (StringUtil.isNotEmpty(vo.getNom())) {
 item.setNom(vo.getNom());
} 

 if (StringUtil.isNotEmpty(vo.getPhone())) {
 item.setPhone(vo.getPhone());
} 

 if (StringUtil.isNotEmpty(vo.getPassword())) {
 item.setPassword(vo.getPassword());
} 

 if (vo.getBlocked() != null) {
 item.setBlocked(NumberUtil.toBoolean(vo.getBlocked()));
} 

 if (StringUtil.isNotEmpty(vo.getPrenom())) {
 item.setPrenom(vo.getPrenom());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getNbrCnx() != null) {
 item.setNbrCnx(NumberUtil.toInt(vo.getNbrCnx()));
} 

return item;
 }
 }

  @Override 
 public AdminVo toVo(Admin item) {
 if (item == null) {
    return null;
      } else {
AdminVo vo = new AdminVo();

 if (StringUtil.isNotEmpty(item.getLogin())) {
 vo.setLogin(item.getLogin());
} 

 if (StringUtil.isNotEmpty(item.getNom())) {
 vo.setNom(item.getNom());
} 

 if (StringUtil.isNotEmpty(item.getPhone())) {
 vo.setPhone(item.getPhone());
} 

 if (StringUtil.isNotEmpty(item.getPassword())) {
 vo.setPassword(item.getPassword());
} 

 if (item.getBlocked() != null) {
 vo.setBlocked(NumberUtil.toString(item.getBlocked()));
} 

 if (StringUtil.isNotEmpty(item.getPrenom())) {
 vo.setPrenom(item.getPrenom());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getNbrCnx() != null) {
 vo.setNbrCnx(NumberUtil.toString(item.getNbrCnx()));
} 

return vo;
 }
 }
public void init() { 
}
 } 
