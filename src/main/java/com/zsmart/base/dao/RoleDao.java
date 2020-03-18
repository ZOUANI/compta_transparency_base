package com.zsmart.base.dao;
import com.zsmart.base.bean.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface RoleDao extends JpaRepository<Role,Long> {




}
