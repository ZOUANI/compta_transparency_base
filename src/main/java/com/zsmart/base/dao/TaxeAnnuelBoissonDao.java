package com.zsmart.base.dao;
import com.zsmart.base.bean.TauxBoisson;
import com.zsmart.base.bean.TaxeAnnuelBoisson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TaxeAnnuelBoissonDao extends JpaRepository<TaxeAnnuelBoisson,Long> {


	 public TaxeAnnuelBoisson findByTauxSejour(TauxBoisson tauxSejour);

	 public int deleteByTauxSejour(TauxBoisson tauxSejour);

}
