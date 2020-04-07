/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.base.bean;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author hzouani6
 */
@Entity
public class Societe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Ville ville;
    private String enseigne;
    private String identifiantFiscal;
    private String rc;
    private String ice;
    @Column(precision = 16, scale = 4)
    private BigDecimal capitale;
    @Column(precision = 16, scale = 4)
    private BigDecimal totalAction;
    @ManyToOne
    private Employee gerant;

    @ManyToOne
    private TypeSociete typeSociete;

    private String loginDgi;
    private String paswordDgi;

    @ManyToOne
    private Comptable comptable;

    @ManyToOne
    private Adherent adherent;

    @ManyToOne
    private TypeDeclarationTva typeDeclarationTva;

    @OneToMany(mappedBy = "societe")
    private List<AssocieSociete> associeSocietes = new ArrayList<AssocieSociete>();

    public TypeSociete getTypeSociete() {
        return typeSociete;
    }

    public void setTypeSociete(TypeSociete typeSociete) {
        this.typeSociete = typeSociete;
    }

    public String getEnseigne() {
        return enseigne;
    }

    public void setEnseigne(String enseigne) {
        this.enseigne = enseigne;
    }

    public List<AssocieSociete> getAssocieSocietes() {
        return associeSocietes;
    }

    public void setAssocieSocietes(List<AssocieSociete> associeSocietes) {
        this.associeSocietes = associeSocietes;
    }

    public BigDecimal getTotalAction() {
        return totalAction;
    }

    public void setTotalAction(BigDecimal totalAction) {
        this.totalAction = totalAction;
    }

    public BigDecimal getCapitale() {
        return capitale;
    }

    public void setCapitale(BigDecimal capitale) {
        this.capitale = capitale;
    }

    public Employee getGerant() {
        if (gerant == null) {
            gerant = new Employee();
        }
        return gerant;
    }

    public void setGerant(Employee gerant) {
        this.gerant = gerant;
    }

    public Adherent getAdherent() {
        if (adherent == null) {
            adherent = new Adherent();
        }
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public String getIdentifiantFiscal() {
        return identifiantFiscal;
    }

    public void setIdentifiantFiscal(String identifiantFiscal) {
        this.identifiantFiscal = identifiantFiscal;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getLoginDgi() {
        return loginDgi;
    }

    public void setLoginDgi(String loginDgi) {
        this.loginDgi = loginDgi;
    }

    public String getPaswordDgi() {
        return paswordDgi;
    }

    public void setPaswordDgi(String paswordDgi) {
        this.paswordDgi = paswordDgi;
    }

    public Comptable getComptable() {
        return comptable;
    }

    public void setComptable(Comptable comptable) {
        this.comptable = comptable;
    }

    public TypeDeclarationTva getTypeDeclarationTva() {
        return typeDeclarationTva;
    }

    public void setTypeDeclarationTva(TypeDeclarationTva typeDeclarationTva) {
        this.typeDeclarationTva = typeDeclarationTva;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Societe)) {
            return false;
        }
        Societe other = (Societe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return enseigne;
    }

}
