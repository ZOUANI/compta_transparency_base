package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.Comptable;
import com.zsmart.base.bean.Ville; 
public interface ComptableService {

public Comptable save(Comptable comptable); 
public List<Comptable>  findAll();
public Comptable findById(Long id);
public int delete(Comptable comptable);
public void  deleteById(Long id);
public void clone(Comptable comptable,Comptable comptableClone);
public Comptable clone(Comptable comptable);
public List<Comptable> clone(List<Comptable>comptables);
 public List<Comptable>  findByCriteria(String nom,String email,String tel,String login,String password,Long idMin,Long idMax);

}
