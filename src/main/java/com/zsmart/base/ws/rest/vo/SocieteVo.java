package com.zsmart.base.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class SocieteVo{

private String id ;
private String enseigne ;
private String identifiantFiscal ;
private String rc ;
private String ice ;
private String capitale;
private String capitaleMin ;
private String capitaleMax ;
private String totalAction;
private String totalActionMin ;
private String totalActionMax ;
private String loginDgi ;
private String paswordDgi ;
private VilleVo villeVo ;
private EmployeeVo gerantVo ;
private TypeSocieteVo typeSocieteVo ;
private ComptableVo comptableVo ;
private AdherentVo adherentVo ;
private TypeDeclarationTvaVo typeDeclarationTvaVo ;
private List<AssocieSocieteVo>associeSocietesVo;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getEnseigne(){
    return enseigne;
}

public void setEnseigne(String  enseigne){
     this.enseigne = enseigne;
}

public String  getIdentifiantFiscal(){
    return identifiantFiscal;
}

public void setIdentifiantFiscal(String  identifiantFiscal){
     this.identifiantFiscal = identifiantFiscal;
}

public String  getRc(){
    return rc;
}

public void setRc(String  rc){
     this.rc = rc;
}

public String  getIce(){
    return ice;
}

public void setIce(String  ice){
     this.ice = ice;
}

public String  getCapitale(){
    return capitale;
}

public void setCapitale(String  capitale){
     this.capitale = capitale;
}

public String  getCapitaleMin(){
    return capitaleMin;
}

public void setCapitaleMin(String  capitaleMin){
     this.capitaleMin = capitaleMin;
}

public String  getCapitaleMax(){
    return capitaleMax;
}

public void setCapitaleMax(String  capitaleMax){
     this.capitaleMax = capitaleMax;
}

public String  getTotalAction(){
    return totalAction;
}

public void setTotalAction(String  totalAction){
     this.totalAction = totalAction;
}

public String  getTotalActionMin(){
    return totalActionMin;
}

public void setTotalActionMin(String  totalActionMin){
     this.totalActionMin = totalActionMin;
}

public String  getTotalActionMax(){
    return totalActionMax;
}

public void setTotalActionMax(String  totalActionMax){
     this.totalActionMax = totalActionMax;
}

public String  getLoginDgi(){
    return loginDgi;
}

public void setLoginDgi(String  loginDgi){
     this.loginDgi = loginDgi;
}

public String  getPaswordDgi(){
    return paswordDgi;
}

public void setPaswordDgi(String  paswordDgi){
     this.paswordDgi = paswordDgi;
}

public VilleVo  getVilleVo (){
    return villeVo ;
}

public void setVilleVo (VilleVo  villeVo ){
     this.villeVo  = villeVo ;
}

public EmployeeVo  getGerantVo (){
    return gerantVo ;
}

public void setGerantVo (EmployeeVo  gerantVo ){
     this.gerantVo  = gerantVo ;
}

public TypeSocieteVo  getTypeSocieteVo (){
    return typeSocieteVo ;
}

public void setTypeSocieteVo (TypeSocieteVo  typeSocieteVo ){
     this.typeSocieteVo  = typeSocieteVo ;
}

public ComptableVo  getComptableVo (){
    return comptableVo ;
}

public void setComptableVo (ComptableVo  comptableVo ){
     this.comptableVo  = comptableVo ;
}

public AdherentVo  getAdherentVo (){
    return adherentVo ;
}

public void setAdherentVo (AdherentVo  adherentVo ){
     this.adherentVo  = adherentVo ;
}

public TypeDeclarationTvaVo  getTypeDeclarationTvaVo (){
    return typeDeclarationTvaVo ;
}

public void setTypeDeclarationTvaVo (TypeDeclarationTvaVo  typeDeclarationTvaVo ){
     this.typeDeclarationTvaVo  = typeDeclarationTvaVo ;
}

public List<AssocieSocieteVo> getAssocieSocietesVo(){
    return associeSocietesVo;
}

public void setAssocieSocietesVo(List<AssocieSocieteVo> associeSocietesVo){
     this.associeSocietesVo = associeSocietesVo;
}




}