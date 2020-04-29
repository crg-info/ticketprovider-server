/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crg.redbus.businfo.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "from_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FromTable.findAll", query = "SELECT f FROM FromTable f")
    , @NamedQuery(name = "FromTable.findById", query = "SELECT f FROM FromTable f WHERE f.id = :id")
    , @NamedQuery(name = "FromTable.findByStartFrom", query = "SELECT f FROM FromTable f WHERE f.startFrom = :startFrom")})
public class FromTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "start_from")
    private String startFrom;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fromId")
    private Collection<PriceTable> priceTableCollection;
    @OneToMany(mappedBy = "fromId")
    private Collection<ToTable> toTableCollection;
    @JoinColumn(name = "bus_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BusList busId;

    public FromTable() {
    }

    public FromTable(Integer id) {
        this.id = id;
    }

    public FromTable(Integer id, String startFrom) {
        this.id = id;
        this.startFrom = startFrom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartFrom() {
        return startFrom;
    }

    public void setStartFrom(String startFrom) {
        this.startFrom = startFrom;
    }

    @XmlTransient
    public Collection<PriceTable> getPriceTableCollection() {
        return priceTableCollection;
    }

    public void setPriceTableCollection(Collection<PriceTable> priceTableCollection) {
        this.priceTableCollection = priceTableCollection;
    }

    @XmlTransient
    public Collection<ToTable> getToTableCollection() {
        return toTableCollection;
    }

    public void setToTableCollection(Collection<ToTable> toTableCollection) {
        this.toTableCollection = toTableCollection;
    }

    public BusList getBusId() {
        return busId;
    }

    public void setBusId(BusList busId) {
        this.busId = busId;
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
        if (!(object instanceof FromTable)) {
            return false;
        }
        FromTable other = (FromTable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.FromTable[ id=" + id + " ]";
    }
    
}
