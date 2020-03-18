package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.Societe;
import com.zsmart.base.bean.Ville; 
import com.zsmart.base.bean.Employee; 
import com.zsmart.base.bean.TypeSociete; 
import com.zsmart.base.bean.Comptable; 
import com.zsmart.base.bean.Adherent; 
import com.zsmart.base.bean.TypeDeclarationTva; 
public interface SocieteService {

public Societe save(Societe societe); 
public Societe  saveWithAssocieSocietes (Societe societe);public List<Societe>  findAll();
public Societe findById(Long id);
public int delete(Societe societe);
public void  deleteById(Long id);
public void clone(Societe societe,Societe societeClone);
public Societe clone(Societe societe);
public List<Societe> clone(List<Societe>societes);
 public List<Societe>  findByCriteria(String enseigne,String identifiantFiscal,String rc,String ice,String loginDgi,String paswordDgi,Long idMin,Long idMax,BigDecimal capitaleMin,BigDecimal capitaleMax,BigDecimal totalActionMin,BigDecimal totalActionMax);

}
