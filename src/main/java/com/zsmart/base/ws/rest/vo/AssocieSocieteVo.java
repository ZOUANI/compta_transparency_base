package com.zsmart.base.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class AssocieSocieteVo{

private String id ;
private String nom ;
private String prenom ;
private String cin ;
private String adresse ;
private String nombreAction;
private String nombreActionMin ;
private String nombreActionMax ;
private SocieteVo societeVo ;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getNom(){
    return nom;
}

public void setNom(String  nom){
     this.nom = nom;
}

public String  getPrenom(){
    return prenom;
}

public void setPrenom(String  prenom){
     this.prenom = prenom;
}

public String  getCin(){
    return cin;
}

public void setCin(String  cin){
     this.cin = cin;
}

public String  getAdresse(){
    return adresse;
}

public void setAdresse(String  adresse){
     this.adresse = adresse;
}

public String  getNombreAction(){
    return nombreAction;
}

public void setNombreAction(String  nombreAction){
     this.nombreAction = nombreAction;
}

public String  getNombreActionMin(){
    return nombreActionMin;
}

public void setNombreActionMin(String  nombreActionMin){
     this.nombreActionMin = nombreActionMin;
}

public String  getNombreActionMax(){
    return nombreActionMax;
}

public void setNombreActionMax(String  nombreActionMax){
     this.nombreActionMax = nombreActionMax;
}

public SocieteVo  getSocieteVo (){
    return societeVo ;
}

public void setSocieteVo (SocieteVo  societeVo ){
     this.societeVo  = societeVo ;
}




}