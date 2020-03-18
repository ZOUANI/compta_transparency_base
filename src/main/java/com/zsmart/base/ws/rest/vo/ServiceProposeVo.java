package com.zsmart.base.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class ServiceProposeVo{

private String id ;
private String libelle ;
private String prix;
private String prixMin ;
private String prixMax ;
private String description ;
private String lien ;
private CategorieServiceVo categorieServiceVo ;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getLibelle(){
    return libelle;
}

public void setLibelle(String  libelle){
     this.libelle = libelle;
}

public String  getPrix(){
    return prix;
}

public void setPrix(String  prix){
     this.prix = prix;
}

public String  getPrixMin(){
    return prixMin;
}

public void setPrixMin(String  prixMin){
     this.prixMin = prixMin;
}

public String  getPrixMax(){
    return prixMax;
}

public void setPrixMax(String  prixMax){
     this.prixMax = prixMax;
}

public String  getDescription(){
    return description;
}

public void setDescription(String  description){
     this.description = description;
}

public String  getLien(){
    return lien;
}

public void setLien(String  lien){
     this.lien = lien;
}

public CategorieServiceVo  getCategorieServiceVo (){
    return categorieServiceVo ;
}

public void setCategorieServiceVo (CategorieServiceVo  categorieServiceVo ){
     this.categorieServiceVo  = categorieServiceVo ;
}




}