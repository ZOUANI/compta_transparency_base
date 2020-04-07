package com.zsmart.base.dao;
import com.zsmart.base.bean.TauxBoisson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TauxBoissonDao extends JpaRepository<TauxBoisson,Long> {




}
