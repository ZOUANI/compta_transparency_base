package com.zsmart.base.dao;
import com.zsmart.base.bean.Ville;
import com.zsmart.base.bean.Comptable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface ComptableDao extends JpaRepository<Comptable,Long> {


	 public Comptable findByVille(Ville ville);

	 public int deleteByVille(Ville ville);

}
