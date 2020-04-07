package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.TauxSejour; 
import com.zsmart.base.ws.rest.vo.TauxSejourVo; 

 @Component 
public class TauxSejourConverter extends AbstractConverter<TauxSejour,TauxSejourVo>{ 


 @Override 
 public TauxSejour toItem(TauxSejourVo vo) {
 if (vo == null) {
    return null;
      } else {
TauxSejour item = new TauxSejour();

 if (StringUtil.isNotEmpty(vo.getCodeCategorieSejour())) {
 item.setCodeCategorieSejour(vo.getCodeCategorieSejour());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getMontantParNuite() != null) {
 item.setMontantParNuite(NumberUtil.toBigDecimal(vo.getMontantParNuite()));
} 

 if (vo.getNombreNuitees() != null) {
 item.setNombreNuitees(NumberUtil.toBigDecimal(vo.getNombreNuitees()));
} 

 if (vo.getMajorationTrim() != null) {
 item.setMajorationTrim(NumberUtil.toBigDecimal(vo.getMajorationTrim()));
} 

 if (vo.getPenaliteTrim() != null) {
 item.setPenaliteTrim(NumberUtil.toBigDecimal(vo.getPenaliteTrim()));
} 

 if (vo.getMajorationAnnuelle() != null) {
 item.setMajorationAnnuelle(NumberUtil.toBigDecimal(vo.getMajorationAnnuelle()));
} 

 if (vo.getPenaliteAnnuelle() != null) {
 item.setPenaliteAnnuelle(NumberUtil.toBigDecimal(vo.getPenaliteAnnuelle()));
} 

 if (vo.getDateApplicationDebut() != null) {
 item.setDateApplicationDebut(DateUtil.parse(vo.getDateApplicationDebut()));
} 

 if (vo.getDateApplicationFin() != null) {
 item.setDateApplicationFin(DateUtil.parse(vo.getDateApplicationFin()));
} 

return item;
 }
 }

  @Override 
 public TauxSejourVo toVo(TauxSejour item) {
 if (item == null) {
    return null;
      } else {
TauxSejourVo vo = new TauxSejourVo();

 if (StringUtil.isNotEmpty(item.getCodeCategorieSejour())) {
 vo.setCodeCategorieSejour(item.getCodeCategorieSejour());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getMontantParNuite() != null) {
 vo.setMontantParNuite(NumberUtil.toString(item.getMontantParNuite()));
} 

 if (item.getNombreNuitees() != null) {
 vo.setNombreNuitees(NumberUtil.toString(item.getNombreNuitees()));
} 

 if (item.getMajorationTrim() != null) {
 vo.setMajorationTrim(NumberUtil.toString(item.getMajorationTrim()));
} 

 if (item.getPenaliteTrim() != null) {
 vo.setPenaliteTrim(NumberUtil.toString(item.getPenaliteTrim()));
} 

 if (item.getMajorationAnnuelle() != null) {
 vo.setMajorationAnnuelle(NumberUtil.toString(item.getMajorationAnnuelle()));
} 

 if (item.getPenaliteAnnuelle() != null) {
 vo.setPenaliteAnnuelle(NumberUtil.toString(item.getPenaliteAnnuelle()));
} 

 if (item.getDateApplicationDebut() != null) {
 vo.setDateApplicationDebut(DateUtil.formateDate(item.getDateApplicationDebut()));
} 

 if (item.getDateApplicationFin() != null) {
 vo.setDateApplicationFin(DateUtil.formateDate(item.getDateApplicationFin()));
} 

return vo;
 }
 }
public void init() { 
}
 } 
