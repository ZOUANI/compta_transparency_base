package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.AssocieSociete;
import com.zsmart.base.bean.Societe; 
public interface AssocieSocieteService {

public AssocieSociete save(AssocieSociete associesociete); 
public List<AssocieSociete>  findAll();
public AssocieSociete findById(Long id);
public int delete(AssocieSociete associesociete);
public void  deleteById(Long id);
public void clone(AssocieSociete associesociete,AssocieSociete associesocieteClone);
public AssocieSociete clone(AssocieSociete associesociete);
public List<AssocieSociete> clone(List<AssocieSociete>associesocietes);
 public List<AssocieSociete>  findByCriteria(String nom,String prenom,String cin,String adresse,Long idMin,Long idMax,Integer nombreActionMin,Integer nombreActionMax);

}
