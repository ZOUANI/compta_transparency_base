package com.zsmart.base.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class SecteurActiviteSocieteVo{

private String id ;
private SecteurActiviteVo secteurActiviteVo ;
private SocieteVo societeVo ;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public SecteurActiviteVo  getSecteurActiviteVo (){
    return secteurActiviteVo ;
}

public void setSecteurActiviteVo (SecteurActiviteVo  secteurActiviteVo ){
     this.secteurActiviteVo  = secteurActiviteVo ;
}

public SocieteVo  getSocieteVo (){
    return societeVo ;
}

public void setSocieteVo (SocieteVo  societeVo ){
     this.societeVo  = societeVo ;
}




}