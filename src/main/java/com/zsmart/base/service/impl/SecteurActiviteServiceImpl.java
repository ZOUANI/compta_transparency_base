
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.SecteurActiviteService ; 
import com.zsmart.base.dao.SecteurActiviteDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.SecteurActivite;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class SecteurActiviteServiceImpl implements SecteurActiviteService  {


 @Autowired 

 private SecteurActiviteDao secteuractiviteDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public SecteurActivite  save (SecteurActivite secteuractivite){

if(secteuractivite== null){ 
 return null; 
}else {
 secteuractiviteDao.save(secteuractivite);
return secteuractivite;
}
}

 @Override 
public List< SecteurActivite>  findAll(){
 return secteuractiviteDao.findAll();
}

 @Override 
public SecteurActivite findById(Long id){
 return secteuractiviteDao.getOne(id);
}

 @Override 
public int delete(SecteurActivite secteuractivite){
if(secteuractivite== null){ 
  return -1; 
}else {
 secteuractiviteDao.delete(secteuractivite);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       secteuractiviteDao.deleteById(id);
}
public void clone(SecteurActivite secteuractivite,SecteurActivite secteuractiviteClone){
if(secteuractivite!= null && secteuractiviteClone != null){
secteuractiviteClone.setId(secteuractivite.getId());
secteuractiviteClone.setLibelle(secteuractivite.getLibelle());
}
}
public SecteurActivite clone(SecteurActivite secteuractivite){
if(secteuractivite== null){       return null ;
}else{SecteurActivite secteuractiviteClone= new SecteurActivite();
 clone(secteuractivite,secteuractiviteClone);
return secteuractiviteClone;
}
}
public List<SecteurActivite> clone(List<SecteurActivite>secteuractivites){
if(secteuractivites== null){
       return null ;
}else{List<SecteurActivite> secteuractivitesClone = new ArrayList();
	 	 	 secteuractivites.forEach((secteuractivite)->{secteuractivitesClone.add(clone(secteuractivite));
});return secteuractivitesClone;
}
}
 @Override 
 public List< SecteurActivite>  findByCriteria(String libelle,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,Long idMin,Long idMax){
String query = "SELECT s FROM SecteurActivite s where 1=1 ";
query += SearchUtil.addConstraint( "s", "libelle","=",libelle);
query += SearchUtil.addConstraintMinMax("s", "id", idMin, idMax);

  return query; 
}
}
