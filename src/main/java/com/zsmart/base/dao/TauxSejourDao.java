package com.zsmart.base.dao;
import com.zsmart.base.bean.TauxSejour;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TauxSejourDao extends JpaRepository<TauxSejour,Long> {




}
