package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.ServicePropose; 
import com.zsmart.base.ws.rest.vo.ServiceProposeVo; 

 @Component 
public class ServiceProposeConverter extends AbstractConverter<ServicePropose,ServiceProposeVo>{ 

private boolean categorieService; 

 @Autowired
 private CategorieServiceConverter categorieServiceConverter ; 

 @Override 
 public ServicePropose toItem(ServiceProposeVo vo) {
 if (vo == null) {
    return null;
      } else {
ServicePropose item = new ServicePropose();

 if(categorieService&& vo.getCategorieServiceVo() != null) {
 item.setCategorieService(categorieServiceConverter.toItem(vo.getCategorieServiceVo()));
} 
 
 if (StringUtil.isNotEmpty(vo.getLibelle())) {
 item.setLibelle(vo.getLibelle());
} 

 if (StringUtil.isNotEmpty(vo.getDescription())) {
 item.setDescription(vo.getDescription());
} 

 if (StringUtil.isNotEmpty(vo.getLien())) {
 item.setLien(vo.getLien());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getPrix() != null) {
 item.setPrix(NumberUtil.toBigDecimal(vo.getPrix()));
} 

return item;
 }
 }

  @Override 
 public ServiceProposeVo toVo(ServicePropose item) {
 if (item == null) {
    return null;
      } else {
ServiceProposeVo vo = new ServiceProposeVo();

 if(categorieService&& item.getCategorieService() != null) {
 vo.setCategorieServiceVo(categorieServiceConverter.toVo(item.getCategorieService()));
} 
 
 if (StringUtil.isNotEmpty(item.getLibelle())) {
 vo.setLibelle(item.getLibelle());
} 

 if (StringUtil.isNotEmpty(item.getDescription())) {
 vo.setDescription(item.getDescription());
} 

 if (StringUtil.isNotEmpty(item.getLien())) {
 vo.setLien(item.getLien());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getPrix() != null) {
 vo.setPrix(NumberUtil.toString(item.getPrix()));
} 

return vo;
 }
 }
public void init() { 

categorieService = true; 
}
 } 
