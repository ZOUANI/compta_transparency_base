package com.zsmart.base.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class ComptableVo{

private String id ;
private String nom ;
private String email ;
private String tel ;
private String login ;
private String password ;
private VilleVo villeVo ;



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

public String  getEmail(){
    return email;
}

public void setEmail(String  email){
     this.email = email;
}

public String  getTel(){
    return tel;
}

public void setTel(String  tel){
     this.tel = tel;
}

public String  getLogin(){
    return login;
}

public void setLogin(String  login){
     this.login = login;
}

public String  getPassword(){
    return password;
}

public void setPassword(String  password){
     this.password = password;
}

public VilleVo  getVilleVo (){
    return villeVo ;
}

public void setVilleVo (VilleVo  villeVo ){
     this.villeVo  = villeVo ;
}




}