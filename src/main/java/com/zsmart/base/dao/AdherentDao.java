package com.zsmart.base.dao;
import com.zsmart.base.bean.Adherent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface AdherentDao extends JpaRepository<Adherent,Long> {




}
