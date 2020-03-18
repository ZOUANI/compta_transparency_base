package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.Admin;
public interface AdminService {

public Admin save(Admin admin); 
public List<Admin>  findAll();
public Admin findById(Long id);
public int delete(Admin admin);
public void  deleteById(Long id);
public void clone(Admin admin,Admin adminClone);
public Admin clone(Admin admin);
public List<Admin> clone(List<Admin>admins);
 public List<Admin>  findByCriteria(String login,String nom,String phone,String password,Boolean blocked,String prenom,Long idMin,Long idMax,Integer nbrCnxMin,Integer nbrCnxMax);

}
