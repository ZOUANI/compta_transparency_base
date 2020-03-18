
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.CategorieServiceService ; 
import com.zsmart.base.dao.CategorieServiceDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.CategorieService;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.base.service.facade.ServiceProposeService ; 
import com.zsmart.base.bean.ServicePropose ; 

 @Service  

 public class CategorieServiceServiceImpl implements CategorieServiceService  {


 @Autowired 

 private CategorieServiceDao categorieserviceDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private ServiceProposeService serviceproposeService; 

 @Override 
public CategorieService  save (CategorieService categorieservice){

if(categorieservice== null){ 
 return null; 
}else {
 categorieserviceDao.save(categorieservice);
return categorieservice;
}
}

 @Override 
public CategorieService  saveWithServiceProposes (CategorieService categorieservice){

if(categorieservice== null){ 
        return null; 
}else {
   if(categorieservice.getServiceProposes().isEmpty()){
            return null;
        }else{
            for (ServicePropose servicepropose : categorieservice.getServiceProposes()) {
servicepropose.setCategorieService(categorieservice);
 serviceproposeService.save(  servicepropose);          
            }
            }
categorieserviceDao.save(categorieservice);
return categorieservice;
}
}

 @Override 
public List< CategorieService>  findAll(){
 return categorieserviceDao.findAll();
}

 @Override 
public CategorieService findById(Long id){
 return categorieserviceDao.getOne(id);
}

 @Override 
public int delete(CategorieService categorieservice){
if(categorieservice== null){ 
  return -1; 
}else {
 categorieserviceDao.delete(categorieservice);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       categorieserviceDao.deleteById(id);
}
public void clone(CategorieService categorieservice,CategorieService categorieserviceClone){
if(categorieservice!= null && categorieserviceClone != null){
categorieserviceClone.setId(categorieservice.getId());
categorieserviceClone.setLibelle(categorieservice.getLibelle());
categorieserviceClone.setServiceProposes(serviceproposeService.clone(categorieservice.getServiceProposes()));
}
}
public CategorieService clone(CategorieService categorieservice){
if(categorieservice== null){       return null ;
}else{CategorieService categorieserviceClone= new CategorieService();
categorieserviceClone.setId(categorieservice.getId());
categorieserviceClone.setLibelle(categorieservice.getLibelle());
categorieserviceClone.setServiceProposes(serviceproposeService.clone(categorieservice.getServiceProposes()));
return categorieserviceClone;
}
}
public List<CategorieService> clone(List<CategorieService>categorieservices){
if(categorieservices== null){
       return null ;
}else{List<CategorieService> categorieservicesClone = new ArrayList();
	 	 	 categorieservices.forEach((categorieservice)->{categorieservicesClone.add(clone(categorieservice));
});return categorieservicesClone;
}
}
 @Override 
 public List< CategorieService>  findByCriteria(String libelle,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,Long idMin,Long idMax){
String query = "SELECT c FROM CategorieService c where 1=1 ";
query += SearchUtil.addConstraint( "c", "libelle","=",libelle);
query += SearchUtil.addConstraintMinMax("c", "id", idMin, idMax);

  return query; 
}
}
