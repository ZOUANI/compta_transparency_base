package com.zsmart.base.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class AdminVo{

private String id ;
private String login ;
private String nom ;
private String phone ;
private String password ;
private String blocked ;
private String nbrCnx;
private String nbrCnxMin ;
private String nbrCnxMax ;
private String prenom ;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getLogin(){
    return login;
}

public void setLogin(String  login){
     this.login = login;
}

public String  getNom(){
    return nom;
}

public void setNom(String  nom){
     this.nom = nom;
}

public String  getPhone(){
    return phone;
}

public void setPhone(String  phone){
     this.phone = phone;
}

public String  getPassword(){
    return password;
}

public void setPassword(String  password){
     this.password = password;
}

public String  getBlocked(){
    return blocked;
}

public void setBlocked(String  blocked){
     this.blocked = blocked;
}

public String  getNbrCnx(){
    return nbrCnx;
}

public void setNbrCnx(String  nbrCnx){
     this.nbrCnx = nbrCnx;
}

public String  getNbrCnxMin(){
    return nbrCnxMin;
}

public void setNbrCnxMin(String  nbrCnxMin){
     this.nbrCnxMin = nbrCnxMin;
}

public String  getNbrCnxMax(){
    return nbrCnxMax;
}

public void setNbrCnxMax(String  nbrCnxMax){
     this.nbrCnxMax = nbrCnxMax;
}

public String  getPrenom(){
    return prenom;
}

public void setPrenom(String  prenom){
     this.prenom = prenom;
}




}