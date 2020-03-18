package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.Role;
public interface RoleService {

public Role save(Role role); 
public List<Role>  findAll();
public Role findById(Long id);
public int delete(Role role);
public void  deleteById(Long id);
public void clone(Role role,Role roleClone);
public Role clone(Role role);
public List<Role> clone(List<Role>roles);
 public List<Role>  findByCriteria(String libelle,String lien,Long idMin,Long idMax);

}
