
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.TypeDeclarationTvaService ; 
import com.zsmart.base.dao.TypeDeclarationTvaDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.TypeDeclarationTva;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class TypeDeclarationTvaServiceImpl implements TypeDeclarationTvaService  {


 @Autowired 

 private TypeDeclarationTvaDao typedeclarationtvaDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public TypeDeclarationTva  save (TypeDeclarationTva typedeclarationtva){

if(typedeclarationtva== null){ 
 return null; 
}else {
 typedeclarationtvaDao.save(typedeclarationtva);
return typedeclarationtva;
}
}

 @Override 
public List< TypeDeclarationTva>  findAll(){
 return typedeclarationtvaDao.findAll();
}

 @Override 
public TypeDeclarationTva findById(Long id){
 return typedeclarationtvaDao.getOne(id);
}

 @Override 
public int delete(TypeDeclarationTva typedeclarationtva){
if(typedeclarationtva== null){ 
  return -1; 
}else {
 typedeclarationtvaDao.delete(typedeclarationtva);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       typedeclarationtvaDao.deleteById(id);
}
public void clone(TypeDeclarationTva typedeclarationtva,TypeDeclarationTva typedeclarationtvaClone){
if(typedeclarationtva!= null && typedeclarationtvaClone != null){
typedeclarationtvaClone.setId(typedeclarationtva.getId());
typedeclarationtvaClone.setLibelle(typedeclarationtva.getLibelle());
}
}
public TypeDeclarationTva clone(TypeDeclarationTva typedeclarationtva){
if(typedeclarationtva== null){       return null ;
}else{TypeDeclarationTva typedeclarationtvaClone= new TypeDeclarationTva();
typedeclarationtvaClone.setId(typedeclarationtva.getId());
typedeclarationtvaClone.setLibelle(typedeclarationtva.getLibelle());
return typedeclarationtvaClone;
}
}
public List<TypeDeclarationTva> clone(List<TypeDeclarationTva>typedeclarationtvas){
if(typedeclarationtvas== null){
       return null ;
}else{List<TypeDeclarationTva> typedeclarationtvasClone = new ArrayList();
	 	 	 typedeclarationtvas.forEach((typedeclarationtva)->{typedeclarationtvasClone.add(clone(typedeclarationtva));
});return typedeclarationtvasClone;
}
}
 @Override 
 public List< TypeDeclarationTva>  findByCriteria(String libelle,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,Long idMin,Long idMax){
String query = "SELECT t FROM TypeDeclarationTva t where 1=1 ";
query += SearchUtil.addConstraint( "t", "libelle","=",libelle);
query += SearchUtil.addConstraintMinMax("t", "id", idMin, idMax);

  return query; 
}
}
