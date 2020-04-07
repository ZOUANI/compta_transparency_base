package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.TaxeTrimSejour;
import com.zsmart.base.bean.TauxSejour; 
import com.zsmart.base.bean.TaxeAnnuelSejour; 
public interface TaxeTrimSejourService {

public TaxeTrimSejour save(TaxeTrimSejour taxetrimsejour); 
public List<TaxeTrimSejour>  findAll();
public TaxeTrimSejour findById(Long id);
public int delete(TaxeTrimSejour taxetrimsejour);
public void  deleteById(Long id);
public void clone(TaxeTrimSejour taxetrimsejour,TaxeTrimSejour taxetrimsejourClone);
public TaxeTrimSejour clone(TaxeTrimSejour taxetrimsejour);
public List<TaxeTrimSejour> clone(List<TaxeTrimSejour>taxetrimsejours);
 public List<TaxeTrimSejour>  findByCriteria(String referenceLocale,String referenceRedevable,long serialVersionUIDMin,long serialVersionUIDMax,Long idMin,Long idMax,Integer numeroTrimMin,Integer numeroTrimMax,Integer anneeMin,Integer anneeMax,Date datePresentationMin,Date datePresentationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseMin,BigDecimal montantBaseMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax);

}
