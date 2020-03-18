package com.zsmart.base.dao;
import com.zsmart.base.bean.CategorieService;
import com.zsmart.base.bean.ServicePropose;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface ServiceProposeDao extends JpaRepository<ServicePropose,Long> {


	 public ServicePropose findByCategorieService(CategorieService categorieService);

	 public int deleteByCategorieService(CategorieService categorieService);

}
