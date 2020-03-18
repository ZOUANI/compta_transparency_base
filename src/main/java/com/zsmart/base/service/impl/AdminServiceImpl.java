
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.AdminService ; 
import com.zsmart.base.dao.AdminDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.Admin;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class AdminServiceImpl implements AdminService  {


 @Autowired 

 private AdminDao adminDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public Admin  save (Admin admin){

if(admin== null){ 
 return null; 
}else {
 adminDao.save(admin);
return admin;
}
}

 @Override 
public List< Admin>  findAll(){
 return adminDao.findAll();
}

 @Override 
public Admin findById(Long id){
 return adminDao.getOne(id);
}

 @Override 
public int delete(Admin admin){
if(admin== null){ 
  return -1; 
}else {
 adminDao.delete(admin);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       adminDao.deleteById(id);
}
public void clone(Admin admin,Admin adminClone){
if(admin!= null && adminClone != null){
adminClone.setId(admin.getId());
adminClone.setLogin(admin.getLogin());
adminClone.setNom(admin.getNom());
adminClone.setPhone(admin.getPhone());
adminClone.setPassword(admin.getPassword());
adminClone.setBlocked(admin.getBlocked());
adminClone.setNbrCnx(admin.getNbrCnx());
adminClone.setPrenom(admin.getPrenom());
}
}
public Admin clone(Admin admin){
if(admin== null){       return null ;
}else{Admin adminClone= new Admin();
adminClone.setId(admin.getId());
adminClone.setLogin(admin.getLogin());
adminClone.setNom(admin.getNom());
adminClone.setPhone(admin.getPhone());
adminClone.setPassword(admin.getPassword());
adminClone.setBlocked(admin.getBlocked());
adminClone.setNbrCnx(admin.getNbrCnx());
adminClone.setPrenom(admin.getPrenom());
return adminClone;
}
}
public List<Admin> clone(List<Admin>admins){
if(admins== null){
       return null ;
}else{List<Admin> adminsClone = new ArrayList();
	 	 	 admins.forEach((admin)->{adminsClone.add(clone(admin));
});return adminsClone;
}
}
 @Override 
 public List< Admin>  findByCriteria(String login,String nom,String phone,String password,Boolean blocked,String prenom,Long idMin,Long idMax,Integer nbrCnxMin,Integer nbrCnxMax){
 return entityManager.createQuery(constructQuery(login,nom,phone,password,blocked,prenom,idMin,idMax,nbrCnxMin,nbrCnxMax)).getResultList(); 
 }
private String constructQuery(String login,String nom,String phone,String password,Boolean blocked,String prenom,Long idMin,Long idMax,Integer nbrCnxMin,Integer nbrCnxMax){
String query = "SELECT a FROM Admin a where 1=1 ";
query += SearchUtil.addConstraint( "a", "login","=",login);
query += SearchUtil.addConstraint( "a", "nom","=",nom);
query += SearchUtil.addConstraint( "a", "phone","=",phone);
query += SearchUtil.addConstraint( "a", "password","=",password);
query += SearchUtil.addConstraint( "a", "blocked","=",blocked);
query += SearchUtil.addConstraint( "a", "prenom","=",prenom);
query += SearchUtil.addConstraintMinMax("a", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("a", "nbrCnx", nbrCnxMin, nbrCnxMax);

  return query; 
}
}
