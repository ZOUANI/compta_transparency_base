package com.zsmart.base.dao;
import com.zsmart.base.bean.Ville;
import com.zsmart.base.bean.Employee;
import com.zsmart.base.bean.TypeSociete;
import com.zsmart.base.bean.Comptable;
import com.zsmart.base.bean.Adherent;
import com.zsmart.base.bean.TypeDeclarationTva;
import com.zsmart.base.bean.Societe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface SocieteDao extends JpaRepository<Societe,Long> {


	 public Societe findByVille(Ville ville);
	 public Societe findByGerant(Employee gerant);
	 public Societe findByTypeSociete(TypeSociete typeSociete);
	 public Societe findByComptable(Comptable comptable);
	 public Societe findByAdherent(Adherent adherent);
	 public Societe findByTypeDeclarationTva(TypeDeclarationTva typeDeclarationTva);

	 public int deleteByVille(Ville ville);
	 public int deleteByGerant(Employee gerant);
	 public int deleteByTypeSociete(TypeSociete typeSociete);
	 public int deleteByComptable(Comptable comptable);
	 public int deleteByAdherent(Adherent adherent);
	 public int deleteByTypeDeclarationTva(TypeDeclarationTva typeDeclarationTva);

}
