
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.ComptableService ; 
import com.zsmart.base.dao.ComptableDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.Comptable;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.base.bean.Ville; 
import com.zsmart.base.service.facade.VilleService ; 

 @Service  

 public class ComptableServiceImpl implements ComptableService  {


 @Autowired 

 private ComptableDao comptableDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private VilleService villeService; 

 @Override 
public Comptable  save (Comptable comptable){

if(comptable== null){ 
 return null; 
}else {
 comptableDao.save(comptable);
return comptable;
}
}

 @Override 
public List< Comptable>  findAll(){
 return comptableDao.findAll();
}

 @Override 
public Comptable findById(Long id){
 return comptableDao.getOne(id);
}

 @Override 
public int delete(Comptable comptable){
if(comptable== null){ 
  return -1; 
}else {
 comptableDao.delete(comptable);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       comptableDao.deleteById(id);
}
public void clone(Comptable comptable,Comptable comptableClone){
if(comptable!= null && comptableClone != null){
comptableClone.setId(comptable.getId());
comptableClone.setNom(comptable.getNom());
comptableClone.setEmail(comptable.getEmail());
comptableClone.setTel(comptable.getTel());
comptableClone.setLogin(comptable.getLogin());
comptableClone.setPassword(comptable.getPassword());
comptableClone.setVille(villeService.clone(comptable.getVille()));
}
}
public Comptable clone(Comptable comptable){
if(comptable== null){       return null ;
}else{Comptable comptableClone= new Comptable();
 clone(comptable,comptableClone);
return comptableClone;
}
}
public List<Comptable> clone(List<Comptable>comptables){
if(comptables== null){
       return null ;
}else{List<Comptable> comptablesClone = new ArrayList();
	 	 	 comptables.forEach((comptable)->{comptablesClone.add(clone(comptable));
});return comptablesClone;
}
}
 @Override 
 public List< Comptable>  findByCriteria(String nom,String email,String tel,String login,String password,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(nom,email,tel,login,password,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String nom,String email,String tel,String login,String password,Long idMin,Long idMax){
String query = "SELECT c FROM Comptable c where 1=1 ";
query += SearchUtil.addConstraint( "c", "nom","=",nom);
query += SearchUtil.addConstraint( "c", "email","=",email);
query += SearchUtil.addConstraint( "c", "tel","=",tel);
query += SearchUtil.addConstraint( "c", "login","=",login);
query += SearchUtil.addConstraint( "c", "password","=",password);
query += SearchUtil.addConstraintMinMax("c", "id", idMin, idMax);

  return query; 
}
}
