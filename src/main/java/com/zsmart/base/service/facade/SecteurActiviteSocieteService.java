package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.SecteurActiviteSociete;
import com.zsmart.base.bean.SecteurActivite; 
import com.zsmart.base.bean.Societe; 
public interface SecteurActiviteSocieteService {

public SecteurActiviteSociete save(SecteurActiviteSociete secteuractivitesociete); 
public List<SecteurActiviteSociete>  findAll();
public SecteurActiviteSociete findById(Long id);
public int delete(SecteurActiviteSociete secteuractivitesociete);
public void  deleteById(Long id);
public void clone(SecteurActiviteSociete secteuractivitesociete,SecteurActiviteSociete secteuractivitesocieteClone);
public SecteurActiviteSociete clone(SecteurActiviteSociete secteuractivitesociete);
public List<SecteurActiviteSociete> clone(List<SecteurActiviteSociete>secteuractivitesocietes);
 public List<SecteurActiviteSociete>  findByCriteria(Long idMin,Long idMax);

}
