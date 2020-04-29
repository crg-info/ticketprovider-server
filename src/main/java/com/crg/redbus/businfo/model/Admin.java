/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crg.redbus.businfo.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author VIJAY
 */
@Entity
@Table(name = "admin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a")
    , @NamedQuery(name = "Admin.findById", query = "SELECT a FROM Admin a WHERE a.id = :id")
    , @NamedQuery(name = "Admin.findByAdminName", query = "SELECT a FROM Admin a WHERE a.adminName = :adminName")
    , @NamedQuery(name = "Admin.findByAdminBusses", query = "SELECT a FROM Admin a WHERE a.adminBusses = :adminBusses")
    , @NamedQuery(name = "Admin.findByTravelName", query = "SELECT a FROM Admin a WHERE a.travelName = :travelName")
    , @NamedQuery(name = "Admin.findByUserName", query = "SELECT a FROM Admin a WHERE a.userName = :userName")
    , @NamedQuery(name = "Admin.findByPassword", query = "SELECT a FROM Admin a WHERE a.password = :password")
    , @NamedQuery(name = "Admin.findByEmail", query = "SELECT a FROM Admin a WHERE a.email = :email")
    , @NamedQuery(name = "Admin.findByPhoneNumber", query = "SELECT a FROM Admin a WHERE a.phoneNumber = :phoneNumber")
    , @NamedQuery(name = "Admin.findByAddress", query = "SELECT a FROM Admin a WHERE a.address = :address")})
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "admin_Name")
    private String adminName;
    @Basic(optional = false)
    @Column(name = "admin_Busses")
    private int adminBusses;
    @Basic(optional = false)
    @Column(name = "Travel_Name")
    private String travelName;
    @Basic(optional = false)
    @Column(name = "user_name")
    private String userName;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "phone_number")
    private int phoneNumber;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;

    public Admin() {
    }

    public Admin(Integer id) {
        this.id = id;
    }

    public Admin(Integer id, String adminName, int adminBusses, String travelName, String userName, String password, String email, int phoneNumber, String address) {
        this.id = id;
        this.adminName = adminName;
        this.adminBusses = adminBusses;
        this.travelName = travelName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public int getAdminBusses() {
        return adminBusses;
    }

    public void setAdminBusses(int adminBusses) {
        this.adminBusses = adminBusses;
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Admin[ id=" + id + " ]";
    }
    
}
