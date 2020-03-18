package com.zsmart.base.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.base.service.util.*;
import com.zsmart.base.bean.Societe; 
import com.zsmart.base.ws.rest.vo.SocieteVo; 

 @Component 
public class SocieteConverter extends AbstractConverter<Societe,SocieteVo>{ 

private boolean ville; 

 @Autowired
 private VilleConverter villeConverter ; 
private boolean gerant; 

 @Autowired
 private EmployeeConverter employeeConverter ; 
private boolean typeSociete; 

 @Autowired
 private TypeSocieteConverter typeSocieteConverter ; 
private boolean comptable; 

 @Autowired
 private ComptableConverter comptableConverter ; 
private boolean adherent; 

 @Autowired
 private AdherentConverter adherentConverter ; 
private boolean typeDeclarationTva; 

 @Autowired
 private TypeDeclarationTvaConverter typeDeclarationTvaConverter ; 
private boolean associeSocietes; 

 @Autowired
 private AssocieSocieteConverter associeSocieteConverter ; 

 @Override 
 public Societe toItem(SocieteVo vo) {
 if (vo == null) {
    return null;
      } else {
Societe item = new Societe();

 if(ville&& vo.getVilleVo() != null) {
 item.setVille(villeConverter.toItem(vo.getVilleVo()));
} 
 
 if(gerant&& vo.getGerantVo() != null) {
 item.setGerant(employeeConverter.toItem(vo.getGerantVo()));
} 
 
 if(typeSociete&& vo.getTypeSocieteVo() != null) {
 item.setTypeSociete(typeSocieteConverter.toItem(vo.getTypeSocieteVo()));
} 
 
 if(comptable&& vo.getComptableVo() != null) {
 item.setComptable(comptableConverter.toItem(vo.getComptableVo()));
} 
 
 if(adherent&& vo.getAdherentVo() != null) {
 item.setAdherent(adherentConverter.toItem(vo.getAdherentVo()));
} 
 
 if(typeDeclarationTva&& vo.getTypeDeclarationTvaVo() != null) {
 item.setTypeDeclarationTva(typeDeclarationTvaConverter.toItem(vo.getTypeDeclarationTvaVo()));
} 
 
 if (StringUtil.isNotEmpty(vo.getEnseigne())) {
 item.setEnseigne(vo.getEnseigne());
} 

 if (StringUtil.isNotEmpty(vo.getIdentifiantFiscal())) {
 item.setIdentifiantFiscal(vo.getIdentifiantFiscal());
} 

 if (StringUtil.isNotEmpty(vo.getRc())) {
 item.setRc(vo.getRc());
} 

 if (StringUtil.isNotEmpty(vo.getIce())) {
 item.setIce(vo.getIce());
} 

 if (StringUtil.isNotEmpty(vo.getLoginDgi())) {
 item.setLoginDgi(vo.getLoginDgi());
} 

 if (StringUtil.isNotEmpty(vo.getPaswordDgi())) {
 item.setPaswordDgi(vo.getPaswordDgi());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getCapitale() != null) {
 item.setCapitale(NumberUtil.toBigDecimal(vo.getCapitale()));
} 

 if (vo.getTotalAction() != null) {
 item.setTotalAction(NumberUtil.toBigDecimal(vo.getTotalAction()));
} 

 if (ListUtil.isNotEmpty(vo.getAssocieSocietesVo ()) && associeSocietes) {
 item.setAssocieSocietes(associeSocieteConverter.toItem(vo.getAssocieSocietesVo())); 
} 

return item;
 }
 }

  @Override 
 public SocieteVo toVo(Societe item) {
 if (item == null) {
    return null;
      } else {
SocieteVo vo = new SocieteVo();

 if(ville&& item.getVille() != null) {
 vo.setVilleVo(villeConverter.toVo(item.getVille()));
} 
 
 if(gerant&& item.getGerant() != null) {
 vo.setGerantVo(employeeConverter.toVo(item.getGerant()));
} 
 
 if(typeSociete&& item.getTypeSociete() != null) {
 vo.setTypeSocieteVo(typeSocieteConverter.toVo(item.getTypeSociete()));
} 
 
 if(comptable&& item.getComptable() != null) {
 vo.setComptableVo(comptableConverter.toVo(item.getComptable()));
} 
 
 if(adherent&& item.getAdherent() != null) {
 vo.setAdherentVo(adherentConverter.toVo(item.getAdherent()));
} 
 
 if(typeDeclarationTva&& item.getTypeDeclarationTva() != null) {
 vo.setTypeDeclarationTvaVo(typeDeclarationTvaConverter.toVo(item.getTypeDeclarationTva()));
} 
 
 if (StringUtil.isNotEmpty(item.getEnseigne())) {
 vo.setEnseigne(item.getEnseigne());
} 

 if (StringUtil.isNotEmpty(item.getIdentifiantFiscal())) {
 vo.setIdentifiantFiscal(item.getIdentifiantFiscal());
} 

 if (StringUtil.isNotEmpty(item.getRc())) {
 vo.setRc(item.getRc());
} 

 if (StringUtil.isNotEmpty(item.getIce())) {
 vo.setIce(item.getIce());
} 

 if (StringUtil.isNotEmpty(item.getLoginDgi())) {
 vo.setLoginDgi(item.getLoginDgi());
} 

 if (StringUtil.isNotEmpty(item.getPaswordDgi())) {
 vo.setPaswordDgi(item.getPaswordDgi());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getCapitale() != null) {
 vo.setCapitale(NumberUtil.toString(item.getCapitale()));
} 

 if (item.getTotalAction() != null) {
 vo.setTotalAction(NumberUtil.toString(item.getTotalAction()));
} 

 if(ListUtil.isNotEmpty(item.getAssocieSocietes()) && associeSocietes) {
 vo.setAssocieSocietesVo(associeSocieteConverter.toVo(item.getAssocieSocietes()));
} 

return vo;
 }
 }
public void init() { 

ville = true; 

gerant = true; 

typeSociete = true; 

comptable = true; 

adherent = true; 

typeDeclarationTva = true; 

associeSocietes = true; 
}
 } 
