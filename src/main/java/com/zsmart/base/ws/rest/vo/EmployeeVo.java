package com.zsmart.base.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class EmployeeVo{

private String id ;
private String nom ;
private String prenom ;
private String cin ;
private String adresse ;
private String salaire;
private String salaireMin ;
private String salaireMax ;
private String prime;
private String primeMin ;
private String primeMax ;
private SocieteVo societeVo ;
private EtatEmployeeVo etatEmployeeVo ;



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

public String  getSalaire(){
    return salaire;
}

public void setSalaire(String  salaire){
     this.salaire = salaire;
}

public String  getSalaireMin(){
    return salaireMin;
}

public void setSalaireMin(String  salaireMin){
     this.salaireMin = salaireMin;
}

public String  getSalaireMax(){
    return salaireMax;
}

public void setSalaireMax(String  salaireMax){
     this.salaireMax = salaireMax;
}

public String  getPrime(){
    return prime;
}

public void setPrime(String  prime){
     this.prime = prime;
}

public String  getPrimeMin(){
    return primeMin;
}

public void setPrimeMin(String  primeMin){
     this.primeMin = primeMin;
}

public String  getPrimeMax(){
    return primeMax;
}

public void setPrimeMax(String  primeMax){
     this.primeMax = primeMax;
}

public SocieteVo  getSocieteVo (){
    return societeVo ;
}

public void setSocieteVo (SocieteVo  societeVo ){
     this.societeVo  = societeVo ;
}

public EtatEmployeeVo  getEtatEmployeeVo (){
    return etatEmployeeVo ;
}

public void setEtatEmployeeVo (EtatEmployeeVo  etatEmployeeVo ){
     this.etatEmployeeVo  = etatEmployeeVo ;
}




}