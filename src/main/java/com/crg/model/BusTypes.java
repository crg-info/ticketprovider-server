/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crg.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author VIJAY
 */
@Entity
@Table(name = "bus_types")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BusTypes.findAll", query = "SELECT b FROM BusTypes b")
    , @NamedQuery(name = "BusTypes.findById", query = "SELECT b FROM BusTypes b WHERE b.id = :id")
    , @NamedQuery(name = "BusTypes.findByBusType", query = "SELECT b FROM BusTypes b WHERE b.busType = :busType")})
public class BusTypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "bus_type")
    private String busType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "busActype")
    private Collection<BusList> busListCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "busSeatType")
    private Collection<BusList> busListCollection1;

    public BusTypes() {
    }

    public BusTypes(Integer id) {
        this.id = id;
    }

    public BusTypes(Integer id, String busType) {
        this.id = id;
        this.busType = busType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    @XmlTransient
    public Collection<BusList> getBusListCollection() {
        return busListCollection;
    }

    public void setBusListCollection(Collection<BusList> busListCollection) {
        this.busListCollection = busListCollection;
    }

    @XmlTransient
    public Collection<BusList> getBusListCollection1() {
        return busListCollection1;
    }

    public void setBusListCollection1(Collection<BusList> busListCollection1) {
        this.busListCollection1 = busListCollection1;
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
        if (!(object instanceof BusTypes)) {
            return false;
        }
        BusTypes other = (BusTypes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.BusTypes[ id=" + id + " ]";
    }
    
}
