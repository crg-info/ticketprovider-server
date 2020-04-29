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
@Table(name = "bus_list")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BusList.findAll", query = "SELECT b FROM BusList b")
    , @NamedQuery(name = "BusList.findById", query = "SELECT b FROM BusList b WHERE b.id = :id")
    , @NamedQuery(name = "BusList.findByBusServiceNumber", query = "SELECT b FROM BusList b WHERE b.busServiceNumber = :busServiceNumber")
    , @NamedQuery(name = "BusList.findByBusStatus", query = "SELECT b FROM BusList b WHERE b.busStatus = :busStatus")
    , @NamedQuery(name = "BusList.findByBusStartPoint", query = "SELECT b FROM BusList b WHERE b.busStartPoint = :busStartPoint")
    , @NamedQuery(name = "BusList.findByBusEndPoint", query = "SELECT b FROM BusList b WHERE b.busEndPoint = :busEndPoint")
    , @NamedQuery(name = "BusList.findByBusSeatsAvialble", query = "SELECT b FROM BusList b WHERE b.busSeatsAvialble = :busSeatsAvialble")})
public class BusList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "bus_service_number")
    private String busServiceNumber;
    @Basic(optional = false)
    @Column(name = "bus_status")
    private String busStatus;
    @Basic(optional = false)
    @Column(name = "bus_start_point")
    private String busStartPoint;
    @Basic(optional = false)
    @Column(name = "bus_end_point")
    private String busEndPoint;
    @Basic(optional = false)
    @Column(name = "bus_seats_avialble")
    private int busSeatsAvialble;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "busId")
    private Collection<PriceTable> priceTableCollection;
    @JoinColumn(name = "bus_actype", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BusTypes busActype;
    @JoinColumn(name = "bus_seat_type", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BusTypes busSeatType;
    @JoinColumn(name = "bus_travel_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TravelList busTravelId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "busId")
    private Collection<FromTable> fromTableCollection;

    public BusList() {
    }

    public BusList(Integer id) {
        this.id = id;
    }

    public BusList(Integer id, String busServiceNumber, String busStatus, String busStartPoint, String busEndPoint, int busSeatsAvialble) {
        this.id = id;
        this.busServiceNumber = busServiceNumber;
        this.busStatus = busStatus;
        this.busStartPoint = busStartPoint;
        this.busEndPoint = busEndPoint;
        this.busSeatsAvialble = busSeatsAvialble;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusServiceNumber() {
        return busServiceNumber;
    }

    public void setBusServiceNumber(String busServiceNumber) {
        this.busServiceNumber = busServiceNumber;
    }

    public String getBusStatus() {
        return busStatus;
    }

    public void setBusStatus(String busStatus) {
        this.busStatus = busStatus;
    }

    public String getBusStartPoint() {
        return busStartPoint;
    }

    public void setBusStartPoint(String busStartPoint) {
        this.busStartPoint = busStartPoint;
    }

    public String getBusEndPoint() {
        return busEndPoint;
    }

    public void setBusEndPoint(String busEndPoint) {
        this.busEndPoint = busEndPoint;
    }

    public int getBusSeatsAvialble() {
        return busSeatsAvialble;
    }

    public void setBusSeatsAvialble(int busSeatsAvialble) {
        this.busSeatsAvialble = busSeatsAvialble;
    }

    @XmlTransient
    public Collection<PriceTable> getPriceTableCollection() {
        return priceTableCollection;
    }

    public void setPriceTableCollection(Collection<PriceTable> priceTableCollection) {
        this.priceTableCollection = priceTableCollection;
    }

    public BusTypes getBusActype() {
        return busActype;
    }

    public void setBusActype(BusTypes busActype) {
        this.busActype = busActype;
    }

    public BusTypes getBusSeatType() {
        return busSeatType;
    }

    public void setBusSeatType(BusTypes busSeatType) {
        this.busSeatType = busSeatType;
    }

    public TravelList getBusTravelId() {
        return busTravelId;
    }

    public void setBusTravelId(TravelList busTravelId) {
        this.busTravelId = busTravelId;
    }

    @XmlTransient
    public Collection<FromTable> getFromTableCollection() {
        return fromTableCollection;
    }

    public void setFromTableCollection(Collection<FromTable> fromTableCollection) {
        this.fromTableCollection = fromTableCollection;
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
        if (!(object instanceof BusList)) {
            return false;
        }
        BusList other = (BusList) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.BusList[ id=" + id + " ]";
    }
    
}
