package com.zsmart.base.dao;
import com.zsmart.base.bean.TauxSejour;
import com.zsmart.base.bean.TaxeAnnuelSejour;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TaxeAnnuelSejourDao extends JpaRepository<TaxeAnnuelSejour,Long> {


	 public TaxeAnnuelSejour findByTauxSejour(TauxSejour tauxSejour);

	 public int deleteByTauxSejour(TauxSejour tauxSejour);

}
