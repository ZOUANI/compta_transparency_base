
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.SecteurActiviteSocieteService ; 
import com.zsmart.base.dao.SecteurActiviteSocieteDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.SecteurActiviteSociete;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.base.bean.SecteurActivite; 
import com.zsmart.base.service.facade.SecteurActiviteService ; 
import com.zsmart.base.bean.Societe; 
import com.zsmart.base.service.facade.SocieteService ; 

 @Service  

 public class SecteurActiviteSocieteServiceImpl implements SecteurActiviteSocieteService  {


 @Autowired 

 private SecteurActiviteSocieteDao secteuractivitesocieteDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private SecteurActiviteService secteuractiviteService; 

 @Autowired 

 private SocieteService societeService; 

 @Override 
public SecteurActiviteSociete  save (SecteurActiviteSociete secteuractivitesociete){

if(secteuractivitesociete== null){ 
 return null; 
}else {
 secteuractivitesocieteDao.save(secteuractivitesociete);
return secteuractivitesociete;
}
}

 @Override 
public List< SecteurActiviteSociete>  findAll(){
 return secteuractivitesocieteDao.findAll();
}

 @Override 
public SecteurActiviteSociete findById(Long id){
 return secteuractivitesocieteDao.getOne(id);
}

 @Override 
public int delete(SecteurActiviteSociete secteuractivitesociete){
if(secteuractivitesociete== null){ 
  return -1; 
}else {
 secteuractivitesocieteDao.delete(secteuractivitesociete);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       secteuractivitesocieteDao.deleteById(id);
}
public void clone(SecteurActiviteSociete secteuractivitesociete,SecteurActiviteSociete secteuractivitesocieteClone){
if(secteuractivitesociete!= null && secteuractivitesocieteClone != null){
secteuractivitesocieteClone.setId(secteuractivitesociete.getId());
secteuractivitesocieteClone.setSecteurActivite(secteuractiviteService.clone(secteuractivitesociete.getSecteurActivite()));
secteuractivitesocieteClone.setSociete(societeService.clone(secteuractivitesociete.getSociete()));
}
}
public SecteurActiviteSociete clone(SecteurActiviteSociete secteuractivitesociete){
if(secteuractivitesociete== null){       return null ;
}else{SecteurActiviteSociete secteuractivitesocieteClone= new SecteurActiviteSociete();
 clone(secteuractivitesociete,secteuractivitesocieteClone);
return secteuractivitesocieteClone;
}
}
public List<SecteurActiviteSociete> clone(List<SecteurActiviteSociete>secteuractivitesocietes){
if(secteuractivitesocietes== null){
       return null ;
}else{List<SecteurActiviteSociete> secteuractivitesocietesClone = new ArrayList();
	 	 	 secteuractivitesocietes.forEach((secteuractivitesociete)->{secteuractivitesocietesClone.add(clone(secteuractivitesociete));
});return secteuractivitesocietesClone;
}
}
 @Override 
 public List< SecteurActiviteSociete>  findByCriteria(Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(idMin,idMax)).getResultList(); 
 }
private String constructQuery(Long idMin,Long idMax){
String query = "SELECT s FROM SecteurActiviteSociete s where 1=1 ";
query += SearchUtil.addConstraintMinMax("s", "id", idMin, idMax);

  return query; 
}
}
