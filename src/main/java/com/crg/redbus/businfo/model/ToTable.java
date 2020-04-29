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
@Table(name = "to_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ToTable.findAll", query = "SELECT t FROM ToTable t")
    , @NamedQuery(name = "ToTable.findById", query = "SELECT t FROM ToTable t WHERE t.id = :id")
    , @NamedQuery(name = "ToTable.findByDestination", query = "SELECT t FROM ToTable t WHERE t.destination = :destination")})
public class ToTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "destination")
    private String destination;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "toId")
    private Collection<PriceTable> priceTableCollection;
    @JoinColumn(name = "from_id", referencedColumnName = "id")
    @ManyToOne
    private FromTable fromId;

    public ToTable() {
    }

    public ToTable(Integer id) {
        this.id = id;
    }

    public ToTable(Integer id, String destination) {
        this.id = id;
        this.destination = destination;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @XmlTransient
    public Collection<PriceTable> getPriceTableCollection() {
        return priceTableCollection;
    }

    public void setPriceTableCollection(Collection<PriceTable> priceTableCollection) {
        this.priceTableCollection = priceTableCollection;
    }

    public FromTable getFromId() {
        return fromId;
    }

    public void setFromId(FromTable fromId) {
        this.fromId = fromId;
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
        if (!(object instanceof ToTable)) {
            return false;
        }
        ToTable other = (ToTable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.ToTable[ id=" + id + " ]";
    }
    
}
