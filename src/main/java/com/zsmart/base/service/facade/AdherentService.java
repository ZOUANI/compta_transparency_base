package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.Adherent;
public interface AdherentService {

public Adherent save(Adherent adherent); 
public Adherent  saveWithSocietes (Adherent adherent);public List<Adherent>  findAll();
public Adherent findById(Long id);
public int delete(Adherent adherent);
public void  deleteById(Long id);
public void clone(Adherent adherent,Adherent adherentClone);
public Adherent clone(Adherent adherent);
public List<Adherent> clone(List<Adherent>adherents);
 public List<Adherent>  findByCriteria(String nom,String email,String tel,String login,String password,Long idMin,Long idMax);

}
