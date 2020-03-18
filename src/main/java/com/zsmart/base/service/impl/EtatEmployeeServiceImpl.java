
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.EtatEmployeeService ; 
import com.zsmart.base.dao.EtatEmployeeDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.EtatEmployee;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class EtatEmployeeServiceImpl implements EtatEmployeeService  {


 @Autowired 

 private EtatEmployeeDao etatemployeeDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public EtatEmployee  save (EtatEmployee etatemployee){

if(etatemployee== null){ 
 return null; 
}else {
 etatemployeeDao.save(etatemployee);
return etatemployee;
}
}

 @Override 
public List< EtatEmployee>  findAll(){
 return etatemployeeDao.findAll();
}

 @Override 
public EtatEmployee findById(Long id){
 return etatemployeeDao.getOne(id);
}

 @Override 
public int delete(EtatEmployee etatemployee){
if(etatemployee== null){ 
  return -1; 
}else {
 etatemployeeDao.delete(etatemployee);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       etatemployeeDao.deleteById(id);
}
public void clone(EtatEmployee etatemployee,EtatEmployee etatemployeeClone){
if(etatemployee!= null && etatemployeeClone != null){
etatemployeeClone.setId(etatemployee.getId());
etatemployeeClone.setLibelle(etatemployee.getLibelle());
}
}
public EtatEmployee clone(EtatEmployee etatemployee){
if(etatemployee== null){       return null ;
}else{EtatEmployee etatemployeeClone= new EtatEmployee();
etatemployeeClone.setId(etatemployee.getId());
etatemployeeClone.setLibelle(etatemployee.getLibelle());
return etatemployeeClone;
}
}
public List<EtatEmployee> clone(List<EtatEmployee>etatemployees){
if(etatemployees== null){
       return null ;
}else{List<EtatEmployee> etatemployeesClone = new ArrayList();
	 	 	 etatemployees.forEach((etatemployee)->{etatemployeesClone.add(clone(etatemployee));
});return etatemployeesClone;
}
}
 @Override 
 public List< EtatEmployee>  findByCriteria(String libelle,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,Long idMin,Long idMax){
String query = "SELECT e FROM EtatEmployee e where 1=1 ";
query += SearchUtil.addConstraint( "e", "libelle","=",libelle);
query += SearchUtil.addConstraintMinMax("e", "id", idMin, idMax);

  return query; 
}
}
