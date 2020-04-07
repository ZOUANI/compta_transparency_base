package com.zsmart.base.dao;
import com.zsmart.base.bean.TauxBoisson;
import com.zsmart.base.bean.TaxeAnnuelBoisson;
import com.zsmart.base.bean.TaxeTrimBoisson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TaxeTrimBoissonDao extends JpaRepository<TaxeTrimBoisson,Long> {


	 public TaxeTrimBoisson findByTauxBoisson(TauxBoisson tauxBoisson);
	 public TaxeTrimBoisson findByTaxeAnnuelBoisson(TaxeAnnuelBoisson taxeAnnuelBoisson);

	 public int deleteByTauxBoisson(TauxBoisson tauxBoisson);
	 public int deleteByTaxeAnnuelBoisson(TaxeAnnuelBoisson taxeAnnuelBoisson);

}
