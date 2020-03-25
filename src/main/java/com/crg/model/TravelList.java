/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crg.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author VIJAY
 */
@Entity
@Table(name = "travel_list")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TravelList.findAll", query = "SELECT t FROM TravelList t")
    , @NamedQuery(name = "TravelList.findById", query = "SELECT t FROM TravelList t WHERE t.id = :id")
    , @NamedQuery(name = "TravelList.findByTravelName", query = "SELECT t FROM TravelList t WHERE t.travelName = :travelName")
    , @NamedQuery(name = "TravelList.findByTravelAdminName", query = "SELECT t FROM TravelList t WHERE t.travelAdminName = :travelAdminName")
    , @NamedQuery(name = "TravelList.findByTravelAdminContact", query = "SELECT t FROM TravelList t WHERE t.travelAdminContact = :travelAdminContact")
    , @NamedQuery(name = "TravelList.findByTravelAdminMail", query = "SELECT t FROM TravelList t WHERE t.travelAdminMail = :travelAdminMail")
    , @NamedQuery(name = "TravelList.findByTravelAddress", query = "SELECT t FROM TravelList t WHERE t.travelAddress = :travelAddress")
    , @NamedQuery(name = "TravelList.findByTravelStatus", query = "SELECT t FROM TravelList t WHERE t.travelStatus = :travelStatus")
    , @NamedQuery(name = "TravelList.findByTravelCreatedDate", query = "SELECT t FROM TravelList t WHERE t.travelCreatedDate = :travelCreatedDate")
    , @NamedQuery(name = "TravelList.findByTravelExpireDate", query = "SELECT t FROM TravelList t WHERE t.travelExpireDate = :travelExpireDate")})
public class TravelList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "travel_name")
    private String travelName;
    @Basic(optional = false)
    @Column(name = "travel_admin_name")
    private String travelAdminName;
    @Basic(optional = false)
    @Column(name = "travel_admin_contact")
    private String travelAdminContact;
    @Basic(optional = false)
    @Column(name = "travel_admin_mail")
    private String travelAdminMail;
    @Basic(optional = false)
    @Column(name = "travel_address")
    private String travelAddress;
    @Basic(optional = false)
    @Column(name = "travel_status")
    private String travelStatus;
    @Basic(optional = false)
    @Column(name = "travel_created_date")
    @Temporal(TemporalType.DATE)
    private Date travelCreatedDate;
    @Column(name = "travel_expire_date")
    @Temporal(TemporalType.DATE)
    private Date travelExpireDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "busTravelId")
    private Collection<BusList> busListCollection;

    public TravelList() {
    }

    public TravelList(Integer id) {
        this.id = id;
    }

    public TravelList(Integer id, String travelName, String travelAdminName, String travelAdminContact, String travelAdminMail, String travelAddress, String travelStatus, Date travelCreatedDate) {
        this.id = id;
        this.travelName = travelName;
        this.travelAdminName = travelAdminName;
        this.travelAdminContact = travelAdminContact;
        this.travelAdminMail = travelAdminMail;
        this.travelAddress = travelAddress;
        this.travelStatus = travelStatus;
        this.travelCreatedDate = travelCreatedDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName;
    }

    public String getTravelAdminName() {
        return travelAdminName;
    }

    public void setTravelAdminName(String travelAdminName) {
        this.travelAdminName = travelAdminName;
    }

    public String getTravelAdminContact() {
        return travelAdminContact;
    }

    public void setTravelAdminContact(String travelAdminContact) {
        this.travelAdminContact = travelAdminContact;
    }

    public String getTravelAdminMail() {
        return travelAdminMail;
    }

    public void setTravelAdminMail(String travelAdminMail) {
        this.travelAdminMail = travelAdminMail;
    }

    public String getTravelAddress() {
        return travelAddress;
    }

    public void setTravelAddress(String travelAddress) {
        this.travelAddress = travelAddress;
    }

    public String getTravelStatus() {
        return travelStatus;
    }

    public void setTravelStatus(String travelStatus) {
        this.travelStatus = travelStatus;
    }

    public Date getTravelCreatedDate() {
        return travelCreatedDate;
    }

    public void setTravelCreatedDate(Date travelCreatedDate) {
        this.travelCreatedDate = travelCreatedDate;
    }

    public Date getTravelExpireDate() {
        return travelExpireDate;
    }

    public void setTravelExpireDate(Date travelExpireDate) {
        this.travelExpireDate = travelExpireDate;
    }

    @XmlTransient
    public Collection<BusList> getBusListCollection() {
        return busListCollection;
    }

    public void setBusListCollection(Collection<BusList> busListCollection) {
        this.busListCollection = busListCollection;
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
        if (!(object instanceof TravelList)) {
            return false;
        }
        TravelList other = (TravelList) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.TravelList[ id=" + id + " ]";
    }
    
}
