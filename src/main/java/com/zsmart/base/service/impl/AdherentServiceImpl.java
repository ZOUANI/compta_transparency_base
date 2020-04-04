
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.AdherentService ; 
import com.zsmart.base.dao.AdherentDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.Adherent;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.base.service.facade.SocieteService ; 
import com.zsmart.base.bean.Societe ; 

 @Service  

 public class AdherentServiceImpl implements AdherentService  {


 @Autowired 

 private AdherentDao adherentDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private SocieteService societeService; 

 @Override 
public Adherent  save (Adherent adherent){

if(adherent== null){ 
 return null; 
}else {
 adherentDao.save(adherent);
return adherent;
}
}

 @Override 
public Adherent  saveWithSocietes (Adherent adherent){

if(adherent== null){ 
        return null; 
}else {
   if(adherent.getSocietes().isEmpty()){
            return null;
        }else{
adherentDao.save(adherent);
            for (Societe societe : adherent.getSocietes()) {
societe.setAdherent(adherent);
 societeService.save(  societe);          
            }
return adherent;
}
}
            }

 @Override 
public List< Adherent>  findAll(){
 return adherentDao.findAll();
}

 @Override 
public Adherent findById(Long id){
 return adherentDao.getOne(id);
}

 @Override 
public int delete(Adherent adherent){
if(adherent== null){ 
  return -1; 
}else {
 adherentDao.delete(adherent);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       adherentDao.deleteById(id);
}
public void clone(Adherent adherent,Adherent adherentClone){
if(adherent!= null && adherentClone != null){
adherentClone.setId(adherent.getId());
adherentClone.setNom(adherent.getNom());
adherentClone.setEmail(adherent.getEmail());
adherentClone.setTel(adherent.getTel());
adherentClone.setLogin(adherent.getLogin());
adherentClone.setPassword(adherent.getPassword());
adherentClone.setSocietes(societeService.clone(adherent.getSocietes()));
}
}
public Adherent clone(Adherent adherent){
if(adherent== null){       return null ;
}else{Adherent adherentClone= new Adherent();
 clone(adherent,adherentClone);
return adherentClone;
}
}
public List<Adherent> clone(List<Adherent>adherents){
if(adherents== null){
       return null ;
}else{List<Adherent> adherentsClone = new ArrayList();
	 	 	 adherents.forEach((adherent)->{adherentsClone.add(clone(adherent));
});return adherentsClone;
}
}
 @Override 
 public List< Adherent>  findByCriteria(String nom,String email,String tel,String login,String password,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(nom,email,tel,login,password,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String nom,String email,String tel,String login,String password,Long idMin,Long idMax){
String query = "SELECT a FROM Adherent a where 1=1 ";
query += SearchUtil.addConstraint( "a", "nom","=",nom);
query += SearchUtil.addConstraint( "a", "email","=",email);
query += SearchUtil.addConstraint( "a", "tel","=",tel);
query += SearchUtil.addConstraint( "a", "login","=",login);
query += SearchUtil.addConstraint( "a", "password","=",password);
query += SearchUtil.addConstraintMinMax("a", "id", idMin, idMax);

  return query; 
}
}
