package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.TaxeAnnuelSejour;
import com.zsmart.base.bean.TauxSejour; 
public interface TaxeAnnuelSejourService {

public TaxeAnnuelSejour save(TaxeAnnuelSejour taxeannuelsejour); 
public TaxeAnnuelSejour  saveWithTaxeTrimSejours (TaxeAnnuelSejour taxeannuelsejour);public List<TaxeAnnuelSejour>  findAll();
public TaxeAnnuelSejour findById(Long id);
public int delete(TaxeAnnuelSejour taxeannuelsejour);
public void  deleteById(Long id);
public void clone(TaxeAnnuelSejour taxeannuelsejour,TaxeAnnuelSejour taxeannuelsejourClone);
public TaxeAnnuelSejour clone(TaxeAnnuelSejour taxeannuelsejour);
public List<TaxeAnnuelSejour> clone(List<TaxeAnnuelSejour>taxeannuelsejours);
 public List<TaxeAnnuelSejour>  findByCriteria(String referenceLocale,String referenceRedevable,long serialVersionUIDMin,long serialVersionUIDMax,Long idMin,Long idMax,Integer anneeMin,Integer anneeMax,Date datePresentationMin,Date datePresentationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseMin,BigDecimal montantBaseMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax);

}
