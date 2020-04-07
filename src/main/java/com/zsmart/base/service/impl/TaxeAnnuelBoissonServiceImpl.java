
package com.zsmart.base.service.impl ;
import com.zsmart.base.service.facade.TaxeAnnuelBoissonService ; 
import com.zsmart.base.dao.TaxeAnnuelBoissonDao ;
import com.zsmart.base.service.util.SearchUtil;
import com.zsmart.base.bean.TaxeAnnuelBoisson;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.base.bean.TauxBoisson; 
import com.zsmart.base.service.facade.TauxBoissonService ; 
import com.zsmart.base.service.facade.TaxeTrimBoissonService ; 
import com.zsmart.base.bean.TaxeTrimBoisson ; 

 @Service  

 public class TaxeAnnuelBoissonServiceImpl implements TaxeAnnuelBoissonService  {


 @Autowired 

 private TaxeAnnuelBoissonDao taxeannuelboissonDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private TaxeTrimBoissonService taxetrimboissonService; 

 @Autowired 

 private TauxBoissonService tauxboissonService; 

 @Override 
public TaxeAnnuelBoisson  save (TaxeAnnuelBoisson taxeannuelboisson){

if(taxeannuelboisson== null){ 
 return null; 
}else {
 taxeannuelboissonDao.save(taxeannuelboisson);
return taxeannuelboisson;
}
}

 @Override 
public TaxeAnnuelBoisson  saveWithTaxeTrimBoissons (TaxeAnnuelBoisson taxeannuelboisson){

if(taxeannuelboisson== null){ 
        return null; 
}else {
   if(taxeannuelboisson.getTaxeTrimBoissons().isEmpty()){
            return null;
        }else{
taxeannuelboissonDao.save(taxeannuelboisson);
            for (TaxeTrimBoisson taxetrimboisson : taxeannuelboisson.getTaxeTrimBoissons()) {
taxetrimboisson.setTaxeAnnuelBoisson(taxeannuelboisson);
 taxetrimboissonService.save(  taxetrimboisson);          
            }
return taxeannuelboisson;
}
}
            }

 @Override 
public List< TaxeAnnuelBoisson>  findAll(){
 return taxeannuelboissonDao.findAll();
}

 @Override 
public TaxeAnnuelBoisson findById(Long id){
 return taxeannuelboissonDao.getOne(id);
}

 @Override 
public int delete(TaxeAnnuelBoisson taxeannuelboisson){
if(taxeannuelboisson== null){ 
  return -1; 
}else {
 taxeannuelboissonDao.delete(taxeannuelboisson);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       taxeannuelboissonDao.deleteById(id);
}
public void clone(TaxeAnnuelBoisson taxeannuelboisson,TaxeAnnuelBoisson taxeannuelboissonClone){
if(taxeannuelboisson!= null && taxeannuelboissonClone != null){
taxeannuelboissonClone.setId(taxeannuelboisson.getId());
taxeannuelboissonClone.setReferenceLocale(taxeannuelboisson.getReferenceLocale());
taxeannuelboissonClone.setReferenceRedevable(taxeannuelboisson.getReferenceRedevable());
taxeannuelboissonClone.setAnnee(taxeannuelboisson.getAnnee());
taxeannuelboissonClone.setDatePresentation(taxeannuelboisson.getDatePresentation());
taxeannuelboissonClone.setMontantTotal(taxeannuelboisson.getMontantTotal());
taxeannuelboissonClone.setMontantBase(taxeannuelboisson.getMontantBase());
taxeannuelboissonClone.setMontantRetard(taxeannuelboisson.getMontantRetard());
taxeannuelboissonClone.setMontantMajoration(taxeannuelboisson.getMontantMajoration());
taxeannuelboissonClone.setMontantPenalite(taxeannuelboisson.getMontantPenalite());
taxeannuelboissonClone.setNomberMoisRetard(taxeannuelboisson.getNomberMoisRetard());
taxeannuelboissonClone.setDateValidation(taxeannuelboisson.getDateValidation());
taxeannuelboissonClone.setDateSoumission(taxeannuelboisson.getDateSoumission());
taxeannuelboissonClone.setDateAffectationComptable(taxeannuelboisson.getDateAffectationComptable());
taxeannuelboissonClone.setDateFinalisation(taxeannuelboisson.getDateFinalisation());
taxeannuelboissonClone.setDateSaisie(taxeannuelboisson.getDateSaisie());
taxeannuelboissonClone.setTauxSejour(tauxboissonService.clone(taxeannuelboisson.getTauxSejour()));
taxeannuelboissonClone.setTaxeTrimBoissons(taxetrimboissonService.clone(taxeannuelboisson.getTaxeTrimBoissons()));
}
}
public TaxeAnnuelBoisson clone(TaxeAnnuelBoisson taxeannuelboisson){
if(taxeannuelboisson== null){       return null ;
}else{TaxeAnnuelBoisson taxeannuelboissonClone= new TaxeAnnuelBoisson();
 clone(taxeannuelboisson,taxeannuelboissonClone);
return taxeannuelboissonClone;
}
}
public List<TaxeAnnuelBoisson> clone(List<TaxeAnnuelBoisson>taxeannuelboissons){
if(taxeannuelboissons== null){
       return null ;
}else{List<TaxeAnnuelBoisson> taxeannuelboissonsClone = new ArrayList();
	 	 	 taxeannuelboissons.forEach((taxeannuelboisson)->{taxeannuelboissonsClone.add(clone(taxeannuelboisson));
});return taxeannuelboissonsClone;
}
}
 @Override 
 public List< TaxeAnnuelBoisson>  findByCriteria(String referenceLocale,String referenceRedevable,long serialVersionUIDMin,long serialVersionUIDMax,Long idMin,Long idMax,Integer anneeMin,Integer anneeMax,Date datePresentationMin,Date datePresentationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseMin,BigDecimal montantBaseMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax){
 return entityManager.createQuery(constructQuery(referenceLocale,referenceRedevable,serialVersionUIDMin,serialVersionUIDMax,idMin,idMax,anneeMin,anneeMax,datePresentationMin,datePresentationMax,montantTotalMin,montantTotalMax,montantBaseMin,montantBaseMax,montantRetardMin,montantRetardMax,montantMajorationMin,montantMajorationMax,montantPenaliteMin,montantPenaliteMax,nomberMoisRetardMin,nomberMoisRetardMax,dateValidationMin,dateValidationMax,dateSoumissionMin,dateSoumissionMax,dateAffectationComptableMin,dateAffectationComptableMax,dateFinalisationMin,dateFinalisationMax,dateSaisieMin,dateSaisieMax)).getResultList(); 
 }
private String constructQuery(String referenceLocale,String referenceRedevable,long serialVersionUIDMin,long serialVersionUIDMax,Long idMin,Long idMax,Integer anneeMin,Integer anneeMax,Date datePresentationMin,Date datePresentationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseMin,BigDecimal montantBaseMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax){
String query = "SELECT t FROM TaxeAnnuelBoisson t where 1=1 ";
query += SearchUtil.addConstraint( "t", "referenceLocale","=",referenceLocale);
query += SearchUtil.addConstraint( "t", "referenceRedevable","=",referenceRedevable);
query += SearchUtil.addConstraintMinMax("t", "serialVersionUID", serialVersionUIDMin, serialVersionUIDMax);
query += SearchUtil.addConstraintMinMax("t", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("t", "annee", anneeMin, anneeMax);
query += SearchUtil.addConstraintMinMaxDate("t"," datePresentation", datePresentationMin, datePresentationMax);
query += SearchUtil.addConstraintMinMax("t", "montantTotal", montantTotalMin, montantTotalMax);
query += SearchUtil.addConstraintMinMax("t", "montantBase", montantBaseMin, montantBaseMax);
query += SearchUtil.addConstraintMinMax("t", "montantRetard", montantRetardMin, montantRetardMax);
query += SearchUtil.addConstraintMinMax("t", "montantMajoration", montantMajorationMin, montantMajorationMax);
query += SearchUtil.addConstraintMinMax("t", "montantPenalite", montantPenaliteMin, montantPenaliteMax);
query += SearchUtil.addConstraintMinMax("t", "nomberMoisRetard", nomberMoisRetardMin, nomberMoisRetardMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateValidation", dateValidationMin, dateValidationMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateSoumission", dateSoumissionMin, dateSoumissionMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateAffectationComptable", dateAffectationComptableMin, dateAffectationComptableMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateFinalisation", dateFinalisationMin, dateFinalisationMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateSaisie", dateSaisieMin, dateSaisieMax);

  return query; 
}
}
