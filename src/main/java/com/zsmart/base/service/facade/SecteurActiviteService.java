package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.SecteurActivite;
public interface SecteurActiviteService {

public SecteurActivite save(SecteurActivite secteuractivite); 
public List<SecteurActivite>  findAll();
public SecteurActivite findById(Long id);
public int delete(SecteurActivite secteuractivite);
public void  deleteById(Long id);
public void clone(SecteurActivite secteuractivite,SecteurActivite secteuractiviteClone);
public SecteurActivite clone(SecteurActivite secteuractivite);
public List<SecteurActivite> clone(List<SecteurActivite>secteuractivites);
 public List<SecteurActivite>  findByCriteria(String libelle,Long idMin,Long idMax);

}
