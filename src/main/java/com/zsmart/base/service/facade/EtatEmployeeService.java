package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.EtatEmployee;
public interface EtatEmployeeService {

public EtatEmployee save(EtatEmployee etatemployee); 
public List<EtatEmployee>  findAll();
public EtatEmployee findById(Long id);
public int delete(EtatEmployee etatemployee);
public void  deleteById(Long id);
public void clone(EtatEmployee etatemployee,EtatEmployee etatemployeeClone);
public EtatEmployee clone(EtatEmployee etatemployee);
public List<EtatEmployee> clone(List<EtatEmployee>etatemployees);
 public List<EtatEmployee>  findByCriteria(String libelle,Long idMin,Long idMax);

}
