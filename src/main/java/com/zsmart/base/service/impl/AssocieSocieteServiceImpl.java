
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.AssocieSocieteService ; 
import com.zsmart.base.dao.AssocieSocieteDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.AssocieSociete;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.base.bean.Societe; 
import com.zsmart.base.service.facade.SocieteService ; 

 @Service  

 public class AssocieSocieteServiceImpl implements AssocieSocieteService  {


 @Autowired 

 private AssocieSocieteDao associesocieteDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private SocieteService societeService; 

 @Override 
public AssocieSociete  save (AssocieSociete associesociete){

if(associesociete== null){ 
 return null; 
}else {
 associesocieteDao.save(associesociete);
return associesociete;
}
}

 @Override 
public List< AssocieSociete>  findAll(){
 return associesocieteDao.findAll();
}

 @Override 
public AssocieSociete findById(Long id){
 return associesocieteDao.getOne(id);
}

 @Override 
public int delete(AssocieSociete associesociete){
if(associesociete== null){ 
  return -1; 
}else {
 associesocieteDao.delete(associesociete);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       associesocieteDao.deleteById(id);
}
public void clone(AssocieSociete associesociete,AssocieSociete associesocieteClone){
if(associesociete!= null && associesocieteClone != null){
associesocieteClone.setId(associesociete.getId());
associesocieteClone.setNom(associesociete.getNom());
associesocieteClone.setPrenom(associesociete.getPrenom());
associesocieteClone.setCin(associesociete.getCin());
associesocieteClone.setAdresse(associesociete.getAdresse());
associesocieteClone.setNombreAction(associesociete.getNombreAction());
associesocieteClone.setSociete(societeService.clone(associesociete.getSociete()));
}
}
public AssocieSociete clone(AssocieSociete associesociete){
if(associesociete== null){       return null ;
}else{AssocieSociete associesocieteClone= new AssocieSociete();
 clone(associesociete,associesocieteClone);
return associesocieteClone;
}
}
public List<AssocieSociete> clone(List<AssocieSociete>associesocietes){
if(associesocietes== null){
       return null ;
}else{List<AssocieSociete> associesocietesClone = new ArrayList();
	 	 	 associesocietes.forEach((associesociete)->{associesocietesClone.add(clone(associesociete));
});return associesocietesClone;
}
}
 @Override 
 public List< AssocieSociete>  findByCriteria(String nom,String prenom,String cin,String adresse,Long idMin,Long idMax,Integer nombreActionMin,Integer nombreActionMax){
 return entityManager.createQuery(constructQuery(nom,prenom,cin,adresse,idMin,idMax,nombreActionMin,nombreActionMax)).getResultList(); 
 }
private String constructQuery(String nom,String prenom,String cin,String adresse,Long idMin,Long idMax,Integer nombreActionMin,Integer nombreActionMax){
String query = "SELECT a FROM AssocieSociete a where 1=1 ";
query += SearchUtil.addConstraint( "a", "nom","=",nom);
query += SearchUtil.addConstraint( "a", "prenom","=",prenom);
query += SearchUtil.addConstraint( "a", "cin","=",cin);
query += SearchUtil.addConstraint( "a", "adresse","=",adresse);
query += SearchUtil.addConstraintMinMax("a", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("a", "nombreAction", nombreActionMin, nombreActionMax);

  return query; 
}
}
