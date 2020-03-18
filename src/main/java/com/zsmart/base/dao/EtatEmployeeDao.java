package com.zsmart.base.dao;
import com.zsmart.base.bean.EtatEmployee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface EtatEmployeeDao extends JpaRepository<EtatEmployee,Long> {




}
