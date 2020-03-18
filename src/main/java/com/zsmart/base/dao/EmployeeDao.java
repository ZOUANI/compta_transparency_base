package com.zsmart.base.dao;
import com.zsmart.base.bean.Societe;
import com.zsmart.base.bean.EtatEmployee;
import com.zsmart.base.bean.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface EmployeeDao extends JpaRepository<Employee,Long> {


	 public Employee findBySociete(Societe societe);
	 public Employee findByEtatEmployee(EtatEmployee etatEmployee);

	 public int deleteBySociete(Societe societe);
	 public int deleteByEtatEmployee(EtatEmployee etatEmployee);

}
