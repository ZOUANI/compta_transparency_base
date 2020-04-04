package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.EtatEmployee; 
import com.zsmart.base.ws.rest.vo.EtatEmployeeVo; 

 @Component 
public class EtatEmployeeConverter extends AbstractConverter<EtatEmployee,EtatEmployeeVo>{ 


 @Override 
 public EtatEmployee toItem(EtatEmployeeVo vo) {
 if (vo == null) {
    return null;
      } else {
EtatEmployee item = new EtatEmployee();

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
 public EtatEmployeeVo toVo(EtatEmployee item) {
 if (item == null) {
    return null;
      } else {
EtatEmployeeVo vo = new EtatEmployeeVo();

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
