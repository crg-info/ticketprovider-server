/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crg.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author VIJAY
 */
@Entity
@Table(name = "price_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PriceTable.findAll", query = "SELECT p FROM PriceTable p")
    , @NamedQuery(name = "PriceTable.findById", query = "SELECT p FROM PriceTable p WHERE p.id = :id")
    , @NamedQuery(name = "PriceTable.findBySemiSleeper", query = "SELECT p FROM PriceTable p WHERE p.semiSleeper = :semiSleeper")
    , @NamedQuery(name = "PriceTable.findByDownSleeper", query = "SELECT p FROM PriceTable p WHERE p.downSleeper = :downSleeper")
    , @NamedQuery(name = "PriceTable.findByUpperSleeper", query = "SELECT p FROM PriceTable p WHERE p.upperSleeper = :upperSleeper")})
public class PriceTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "semi_sleeper")
    private Double semiSleeper;
    @Column(name = "down_sleeper")
    private Double downSleeper;
    @Column(name = "upper_sleeper")
    private Double upperSleeper;
    @JoinColumn(name = "bus_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BusList busId;
    @JoinColumn(name = "from_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private FromTable fromId;
    @JoinColumn(name = "to_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ToTable toId;

    public PriceTable() {
    }

    public PriceTable(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSemiSleeper() {
        return semiSleeper;
    }

    public void setSemiSleeper(Double semiSleeper) {
        this.semiSleeper = semiSleeper;
    }

    public Double getDownSleeper() {
        return downSleeper;
    }

    public void setDownSleeper(Double downSleeper) {
        this.downSleeper = downSleeper;
    }

    public Double getUpperSleeper() {
        return upperSleeper;
    }

    public void setUpperSleeper(Double upperSleeper) {
        this.upperSleeper = upperSleeper;
    }

    public BusList getBusId() {
        return busId;
    }

    public void setBusId(BusList busId) {
        this.busId = busId;
    }

    public FromTable getFromId() {
        return fromId;
    }

    public void setFromId(FromTable fromId) {
        this.fromId = fromId;
    }

    public ToTable getToId() {
        return toId;
    }

    public void setToId(ToTable toId) {
        this.toId = toId;
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
        if (!(object instanceof PriceTable)) {
            return false;
        }
        PriceTable other = (PriceTable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.PriceTable[ id=" + id + " ]";
    }
    
}
