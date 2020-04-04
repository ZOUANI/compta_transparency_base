
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.RoleService ; 
import com.zsmart.base.dao.RoleDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.Role;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class RoleServiceImpl implements RoleService  {


 @Autowired 

 private RoleDao roleDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public Role  save (Role role){

if(role== null){ 
 return null; 
}else {
 roleDao.save(role);
return role;
}
}

 @Override 
public List< Role>  findAll(){
 return roleDao.findAll();
}

 @Override 
public Role findById(Long id){
 return roleDao.getOne(id);
}

 @Override 
public int delete(Role role){
if(role== null){ 
  return -1; 
}else {
 roleDao.delete(role);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       roleDao.deleteById(id);
}
public void clone(Role role,Role roleClone){
if(role!= null && roleClone != null){
roleClone.setId(role.getId());
roleClone.setLibelle(role.getLibelle());
roleClone.setLien(role.getLien());
}
}
public Role clone(Role role){
if(role== null){       return null ;
}else{Role roleClone= new Role();
 clone(role,roleClone);
return roleClone;
}
}
public List<Role> clone(List<Role>roles){
if(roles== null){
       return null ;
}else{List<Role> rolesClone = new ArrayList();
	 	 	 roles.forEach((role)->{rolesClone.add(clone(role));
});return rolesClone;
}
}
 @Override 
 public List< Role>  findByCriteria(String libelle,String lien,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,lien,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,String lien,Long idMin,Long idMax){
String query = "SELECT r FROM Role r where 1=1 ";
query += SearchUtil.addConstraint( "r", "libelle","=",libelle);
query += SearchUtil.addConstraint( "r", "lien","=",lien);
query += SearchUtil.addConstraintMinMax("r", "id", idMin, idMax);

  return query; 
}
}
