
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.SocieteService ; 
import com.zsmart.base.dao.SocieteDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.Societe;
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
import com.zsmart.base.bean.Employee; 
import com.zsmart.base.service.facade.EmployeeService ; 
import com.zsmart.base.bean.TypeSociete; 
import com.zsmart.base.service.facade.TypeSocieteService ; 
import com.zsmart.base.bean.Comptable; 
import com.zsmart.base.service.facade.ComptableService ; 
import com.zsmart.base.bean.Adherent; 
import com.zsmart.base.service.facade.AdherentService ; 
import com.zsmart.base.bean.TypeDeclarationTva; 
import com.zsmart.base.service.facade.TypeDeclarationTvaService ; 
import com.zsmart.base.service.facade.AssocieSocieteService ; 
import com.zsmart.base.bean.AssocieSociete ; 

 @Service  

 public class SocieteServiceImpl implements SocieteService  {


 @Autowired 

 private SocieteDao societeDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private AssocieSocieteService associesocieteService; 

 @Autowired 

 private VilleService villeService; 

 @Autowired 

 private EmployeeService employeeService; 

 @Autowired 

 private TypeSocieteService typesocieteService; 

 @Autowired 

 private ComptableService comptableService; 

 @Autowired 

 private AdherentService adherentService; 

 @Autowired 

 private TypeDeclarationTvaService typedeclarationtvaService; 

 @Override 
public Societe  save (Societe societe){

if(societe== null){ 
 return null; 
}else {
 societeDao.save(societe);
return societe;
}
}

 @Override 
public Societe  saveWithAssocieSocietes (Societe societe){

if(societe== null){ 
        return null; 
}else {
   if(societe.getAssocieSocietes().isEmpty()){
            return null;
        }else{
societeDao.save(societe);
            for (AssocieSociete associesociete : societe.getAssocieSocietes()) {
associesociete.setSociete(societe);
 associesocieteService.save(  associesociete);          
            }
return societe;
}
}
            }

 @Override 
public List< Societe>  findAll(){
 return societeDao.findAll();
}

 @Override 
public Societe findById(Long id){
 return societeDao.getOne(id);
}

 @Override 
public int delete(Societe societe){
if(societe== null){ 
  return -1; 
}else {
 societeDao.delete(societe);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       societeDao.deleteById(id);
}
public void clone(Societe societe,Societe societeClone){
if(societe!= null && societeClone != null){
societeClone.setId(societe.getId());
societeClone.setEnseigne(societe.getEnseigne());
societeClone.setIdentifiantFiscal(societe.getIdentifiantFiscal());
societeClone.setRc(societe.getRc());
societeClone.setIce(societe.getIce());
societeClone.setCapitale(societe.getCapitale());
societeClone.setTotalAction(societe.getTotalAction());
societeClone.setLoginDgi(societe.getLoginDgi());
societeClone.setPaswordDgi(societe.getPaswordDgi());
societeClone.setVille(villeService.clone(societe.getVille()));
societeClone.setGerant(employeeService.clone(societe.getGerant()));
societeClone.setTypeSociete(typesocieteService.clone(societe.getTypeSociete()));
societeClone.setComptable(comptableService.clone(societe.getComptable()));
societeClone.setAdherent(adherentService.clone(societe.getAdherent()));
societeClone.setTypeDeclarationTva(typedeclarationtvaService.clone(societe.getTypeDeclarationTva()));
societeClone.setAssocieSocietes(associesocieteService.clone(societe.getAssocieSocietes()));
}
}
public Societe clone(Societe societe){
if(societe== null){       return null ;
}else{Societe societeClone= new Societe();
 clone(societe,societeClone);
return societeClone;
}
}
public List<Societe> clone(List<Societe>societes){
if(societes== null){
       return null ;
}else{List<Societe> societesClone = new ArrayList();
	 	 	 societes.forEach((societe)->{societesClone.add(clone(societe));
});return societesClone;
}
}
 @Override 
 public List< Societe>  findByCriteria(String enseigne,String identifiantFiscal,String rc,String ice,String loginDgi,String paswordDgi,Long idMin,Long idMax,BigDecimal capitaleMin,BigDecimal capitaleMax,BigDecimal totalActionMin,BigDecimal totalActionMax){
 return entityManager.createQuery(constructQuery(enseigne,identifiantFiscal,rc,ice,loginDgi,paswordDgi,idMin,idMax,capitaleMin,capitaleMax,totalActionMin,totalActionMax)).getResultList(); 
 }
private String constructQuery(String enseigne,String identifiantFiscal,String rc,String ice,String loginDgi,String paswordDgi,Long idMin,Long idMax,BigDecimal capitaleMin,BigDecimal capitaleMax,BigDecimal totalActionMin,BigDecimal totalActionMax){
String query = "SELECT s FROM Societe s where 1=1 ";
query += SearchUtil.addConstraint( "s", "enseigne","=",enseigne);
query += SearchUtil.addConstraint( "s", "identifiantFiscal","=",identifiantFiscal);
query += SearchUtil.addConstraint( "s", "rc","=",rc);
query += SearchUtil.addConstraint( "s", "ice","=",ice);
query += SearchUtil.addConstraint( "s", "loginDgi","=",loginDgi);
query += SearchUtil.addConstraint( "s", "paswordDgi","=",paswordDgi);
query += SearchUtil.addConstraintMinMax("s", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("s", "capitale", capitaleMin, capitaleMax);
query += SearchUtil.addConstraintMinMax("s", "totalAction", totalActionMin, totalActionMax);

  return query; 
}
}
