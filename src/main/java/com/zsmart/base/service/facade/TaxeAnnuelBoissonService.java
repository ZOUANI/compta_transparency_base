package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.TaxeAnnuelBoisson;
import com.zsmart.base.bean.TauxBoisson; 
public interface TaxeAnnuelBoissonService {

public TaxeAnnuelBoisson save(TaxeAnnuelBoisson taxeannuelboisson); 
public TaxeAnnuelBoisson  saveWithTaxeTrimBoissons (TaxeAnnuelBoisson taxeannuelboisson);public List<TaxeAnnuelBoisson>  findAll();
public TaxeAnnuelBoisson findById(Long id);
public int delete(TaxeAnnuelBoisson taxeannuelboisson);
public void  deleteById(Long id);
public void clone(TaxeAnnuelBoisson taxeannuelboisson,TaxeAnnuelBoisson taxeannuelboissonClone);
public TaxeAnnuelBoisson clone(TaxeAnnuelBoisson taxeannuelboisson);
public List<TaxeAnnuelBoisson> clone(List<TaxeAnnuelBoisson>taxeannuelboissons);
 public List<TaxeAnnuelBoisson>  findByCriteria(String referenceLocale,String referenceRedevable,long serialVersionUIDMin,long serialVersionUIDMax,Long idMin,Long idMax,Integer anneeMin,Integer anneeMax,Date datePresentationMin,Date datePresentationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseMin,BigDecimal montantBaseMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax);

}
