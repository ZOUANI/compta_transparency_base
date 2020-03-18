package com.zsmart.base.dao;
import com.zsmart.base.bean.SecteurActivite;
import com.zsmart.base.bean.Societe;
import com.zsmart.base.bean.SecteurActiviteSociete;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface SecteurActiviteSocieteDao extends JpaRepository<SecteurActiviteSociete,Long> {


	 public SecteurActiviteSociete findBySecteurActivite(SecteurActivite secteurActivite);
	 public SecteurActiviteSociete findBySociete(Societe societe);

	 public int deleteBySecteurActivite(SecteurActivite secteurActivite);
	 public int deleteBySociete(Societe societe);

}
