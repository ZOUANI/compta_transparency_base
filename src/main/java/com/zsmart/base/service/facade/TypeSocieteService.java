package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.TypeSociete;
public interface TypeSocieteService {

public TypeSociete save(TypeSociete typesociete); 
public List<TypeSociete>  findAll();
public TypeSociete findById(Long id);
public int delete(TypeSociete typesociete);
public void  deleteById(Long id);
public void clone(TypeSociete typesociete,TypeSociete typesocieteClone);
public TypeSociete clone(TypeSociete typesociete);
public List<TypeSociete> clone(List<TypeSociete>typesocietes);
 public List<TypeSociete>  findByCriteria(String libelle,Long idMin,Long idMax);

}
