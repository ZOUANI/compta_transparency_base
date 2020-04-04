package com.zsmart.base.dao;
import com.zsmart.base.bean.SecteurActivite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface SecteurActiviteDao extends JpaRepository<SecteurActivite,Long> {




}
