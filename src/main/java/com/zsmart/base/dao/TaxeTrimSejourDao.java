package com.zsmart.base.dao;
import com.zsmart.base.bean.TauxSejour;
import com.zsmart.base.bean.TaxeAnnuelSejour;
import com.zsmart.base.bean.TaxeTrimSejour;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TaxeTrimSejourDao extends JpaRepository<TaxeTrimSejour,Long> {


	 public TaxeTrimSejour findByTauxSejour(TauxSejour tauxSejour);
	 public TaxeTrimSejour findByTaxeAnnuelSejour(TaxeAnnuelSejour taxeAnnuelSejour);

	 public int deleteByTauxSejour(TauxSejour tauxSejour);
	 public int deleteByTaxeAnnuelSejour(TaxeAnnuelSejour taxeAnnuelSejour);

}
