package com.zsmart.base.dao;
import com.zsmart.base.bean.Ville;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface VilleDao extends JpaRepository<Ville,Long> {




}
