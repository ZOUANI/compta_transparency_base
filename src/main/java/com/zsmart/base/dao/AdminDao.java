package com.zsmart.base.dao;
import com.zsmart.base.bean.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface AdminDao extends JpaRepository<Admin,Long> {




}
