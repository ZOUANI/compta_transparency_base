package com.zsmart.base.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.base.bean.TypeDeclarationTva;
public interface TypeDeclarationTvaService {

public TypeDeclarationTva save(TypeDeclarationTva typedeclarationtva); 
public List<TypeDeclarationTva>  findAll();
public TypeDeclarationTva findById(Long id);
public int delete(TypeDeclarationTva typedeclarationtva);
public void  deleteById(Long id);
public void clone(TypeDeclarationTva typedeclarationtva,TypeDeclarationTva typedeclarationtvaClone);
public TypeDeclarationTva clone(TypeDeclarationTva typedeclarationtva);
public List<TypeDeclarationTva> clone(List<TypeDeclarationTva>typedeclarationtvas);
 public List<TypeDeclarationTva>  findByCriteria(String libelle,Long idMin,Long idMax);

}
