package com.zsmart.base.dao;
import com.zsmart.base.bean.Societe;
import com.zsmart.base.bean.AssocieSociete;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface AssocieSocieteDao extends JpaRepository<AssocieSociete,Long> {


	 public AssocieSociete findBySociete(Societe societe);

	 public int deleteBySociete(Societe societe);

}
