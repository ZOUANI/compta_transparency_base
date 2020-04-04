package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.Employee; 
import com.zsmart.base.ws.rest.vo.EmployeeVo; 

 @Component 
public class EmployeeConverter extends AbstractConverter<Employee,EmployeeVo>{ 

private boolean societe; 

 @Autowired
 private SocieteConverter societeConverter ; 
private boolean etatEmployee; 

 @Autowired
 private EtatEmployeeConverter etatEmployeeConverter ; 

 @Override 
 public Employee toItem(EmployeeVo vo) {
 if (vo == null) {
    return null;
      } else {
Employee item = new Employee();

 if(societe&& vo.getSocieteVo() != null) {
 item.setSociete(societeConverter.toItem(vo.getSocieteVo()));
} 
 
 if(etatEmployee&& vo.getEtatEmployeeVo() != null) {
 item.setEtatEmployee(etatEmployeeConverter.toItem(vo.getEtatEmployeeVo()));
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

 if (vo.getSalaire() != null) {
 item.setSalaire(NumberUtil.toBigDecimal(vo.getSalaire()));
} 

 if (vo.getPrime() != null) {
 item.setPrime(NumberUtil.toBigDecimal(vo.getPrime()));
} 

return item;
 }
 }

  @Override 
 public EmployeeVo toVo(Employee item) {
 if (item == null) {
    return null;
      } else {
EmployeeVo vo = new EmployeeVo();

 if(societe&& item.getSociete() != null) {
 vo.setSocieteVo(societeConverter.toVo(item.getSociete()));
} 
 
 if(etatEmployee&& item.getEtatEmployee() != null) {
 vo.setEtatEmployeeVo(etatEmployeeConverter.toVo(item.getEtatEmployee()));
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

 if (item.getSalaire() != null) {
 vo.setSalaire(NumberUtil.toString(item.getSalaire()));
} 

 if (item.getPrime() != null) {
 vo.setPrime(NumberUtil.toString(item.getPrime()));
} 

return vo;
 }
 }
public void init() { 

societe = true; 

etatEmployee = true; 
}
 } 
