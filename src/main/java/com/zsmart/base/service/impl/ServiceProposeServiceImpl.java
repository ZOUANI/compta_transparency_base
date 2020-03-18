
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.ServiceProposeService ; 
import com.zsmart.base.dao.ServiceProposeDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.ServicePropose;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.base.bean.CategorieService; 
import com.zsmart.base.service.facade.CategorieServiceService ; 

 @Service  

 public class ServiceProposeServiceImpl implements ServiceProposeService  {


 @Autowired 

 private ServiceProposeDao serviceproposeDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private CategorieServiceService categorieserviceService; 

 @Override 
public ServicePropose  save (ServicePropose servicepropose){

if(servicepropose== null){ 
 return null; 
}else {
 serviceproposeDao.save(servicepropose);
return servicepropose;
}
}

 @Override 
public List< ServicePropose>  findAll(){
 return serviceproposeDao.findAll();
}

 @Override 
public ServicePropose findById(Long id){
 return serviceproposeDao.getOne(id);
}

 @Override 
public int delete(ServicePropose servicepropose){
if(servicepropose== null){ 
  return -1; 
}else {
 serviceproposeDao.delete(servicepropose);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       serviceproposeDao.deleteById(id);
}
public void clone(ServicePropose servicepropose,ServicePropose serviceproposeClone){
if(servicepropose!= null && serviceproposeClone != null){
serviceproposeClone.setId(servicepropose.getId());
serviceproposeClone.setLibelle(servicepropose.getLibelle());
serviceproposeClone.setPrix(servicepropose.getPrix());
serviceproposeClone.setDescription(servicepropose.getDescription());
serviceproposeClone.setLien(servicepropose.getLien());
serviceproposeClone.setCategorieService(categorieserviceService.clone(servicepropose.getCategorieService()));
}
}
public ServicePropose clone(ServicePropose servicepropose){
if(servicepropose== null){       return null ;
}else{ServicePropose serviceproposeClone= new ServicePropose();
serviceproposeClone.setId(servicepropose.getId());
serviceproposeClone.setLibelle(servicepropose.getLibelle());
serviceproposeClone.setPrix(servicepropose.getPrix());
serviceproposeClone.setDescription(servicepropose.getDescription());
serviceproposeClone.setLien(servicepropose.getLien());
serviceproposeClone.setCategorieService(categorieserviceService.clone(servicepropose.getCategorieService()));
return serviceproposeClone;
}
}
public List<ServicePropose> clone(List<ServicePropose>serviceproposes){
if(serviceproposes== null){
       return null ;
}else{List<ServicePropose> serviceproposesClone = new ArrayList();
	 	 	 serviceproposes.forEach((servicepropose)->{serviceproposesClone.add(clone(servicepropose));
});return serviceproposesClone;
}
}
 @Override 
 public List< ServicePropose>  findByCriteria(String libelle,String description,String lien,Long idMin,Long idMax,BigDecimal prixMin,BigDecimal prixMax){
 return entityManager.createQuery(constructQuery(libelle,description,lien,idMin,idMax,prixMin,prixMax)).getResultList(); 
 }
private String constructQuery(String libelle,String description,String lien,Long idMin,Long idMax,BigDecimal prixMin,BigDecimal prixMax){
String query = "SELECT s FROM ServicePropose s where 1=1 ";
query += SearchUtil.addConstraint( "s", "libelle","=",libelle);
query += SearchUtil.addConstraint( "s", "description","=",description);
query += SearchUtil.addConstraint( "s", "lien","=",lien);
query += SearchUtil.addConstraintMinMax("s", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("s", "prix", prixMin, prixMax);

  return query; 
}
}
