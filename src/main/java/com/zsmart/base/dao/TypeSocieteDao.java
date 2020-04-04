package com.zsmart.base.dao;
import com.zsmart.base.bean.TypeSociete;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TypeSocieteDao extends JpaRepository<TypeSociete,Long> {




}
