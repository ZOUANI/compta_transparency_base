
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.TypeSocieteService ; 
import com.zsmart.base.dao.TypeSocieteDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.TypeSociete;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class TypeSocieteServiceImpl implements TypeSocieteService  {


 @Autowired 

 private TypeSocieteDao typesocieteDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public TypeSociete  save (TypeSociete typesociete){

if(typesociete== null){ 
 return null; 
}else {
 typesocieteDao.save(typesociete);
return typesociete;
}
}

 @Override 
public List< TypeSociete>  findAll(){
 return typesocieteDao.findAll();
}

 @Override 
public TypeSociete findById(Long id){
 return typesocieteDao.getOne(id);
}

 @Override 
public int delete(TypeSociete typesociete){
if(typesociete== null){ 
  return -1; 
}else {
 typesocieteDao.delete(typesociete);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       typesocieteDao.deleteById(id);
}
public void clone(TypeSociete typesociete,TypeSociete typesocieteClone){
if(typesociete!= null && typesocieteClone != null){
typesocieteClone.setId(typesociete.getId());
typesocieteClone.setLibelle(typesociete.getLibelle());
}
}
public TypeSociete clone(TypeSociete typesociete){
if(typesociete== null){       return null ;
}else{TypeSociete typesocieteClone= new TypeSociete();
typesocieteClone.setId(typesociete.getId());
typesocieteClone.setLibelle(typesociete.getLibelle());
return typesocieteClone;
}
}
public List<TypeSociete> clone(List<TypeSociete>typesocietes){
if(typesocietes== null){
       return null ;
}else{List<TypeSociete> typesocietesClone = new ArrayList();
	 	 	 typesocietes.forEach((typesociete)->{typesocietesClone.add(clone(typesociete));
});return typesocietesClone;
}
}
 @Override 
 public List< TypeSociete>  findByCriteria(String libelle,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,Long idMin,Long idMax){
String query = "SELECT t FROM TypeSociete t where 1=1 ";
query += SearchUtil.addConstraint( "t", "libelle","=",libelle);
query += SearchUtil.addConstraintMinMax("t", "id", idMin, idMax);

  return query; 
}
}
