package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.TaxeTrimBoisson;
import com.zsmart.base.bean.TauxBoisson; 
import com.zsmart.base.bean.TaxeAnnuelBoisson; 
public interface TaxeTrimBoissonService {

public TaxeTrimBoisson save(TaxeTrimBoisson taxetrimboisson); 
public List<TaxeTrimBoisson>  findAll();
public TaxeTrimBoisson findById(Long id);
public int delete(TaxeTrimBoisson taxetrimboisson);
public void  deleteById(Long id);
public void clone(TaxeTrimBoisson taxetrimboisson,TaxeTrimBoisson taxetrimboissonClone);
public TaxeTrimBoisson clone(TaxeTrimBoisson taxetrimboisson);
public List<TaxeTrimBoisson> clone(List<TaxeTrimBoisson>taxetrimboissons);
 public List<TaxeTrimBoisson>  findByCriteria(String referenceLocale,String referenceRedevable,long serialVersionUIDMin,long serialVersionUIDMax,Long idMin,Long idMax,Integer numeroTrimMin,Integer numeroTrimMax,Integer anneeMin,Integer anneeMax,Date datePresentationMin,Date datePresentationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseMin,BigDecimal montantBaseMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax);

}
