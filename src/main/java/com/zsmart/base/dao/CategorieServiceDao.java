package com.zsmart.base.dao;
import com.zsmart.base.bean.CategorieService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface CategorieServiceDao extends JpaRepository<CategorieService,Long> {




}
