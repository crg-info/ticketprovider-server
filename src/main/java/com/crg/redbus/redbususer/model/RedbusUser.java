/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crg.redbus.redbususer.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author VIJAY
 */
@Entity
@Table(name = "redbus_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RedbusUser.findAll", query = "SELECT r FROM RedbusUser r")
    , @NamedQuery(name = "RedbusUser.findById", query = "SELECT r FROM RedbusUser r WHERE r.id = :id")
    , @NamedQuery(name = "RedbusUser.findByUserName", query = "SELECT r FROM RedbusUser r WHERE r.userName = :userName")
    , @NamedQuery(name = "RedbusUser.findByDob", query = "SELECT r FROM RedbusUser r WHERE r.dob = :dob")
    , @NamedQuery(name = "RedbusUser.findByGender", query = "SELECT r FROM RedbusUser r WHERE r.gender = :gender")
    , @NamedQuery(name = "RedbusUser.findByEmail", query = "SELECT r FROM RedbusUser r WHERE r.email = :email")
    , @NamedQuery(name = "RedbusUser.findByPhoneNumber", query = "SELECT r FROM RedbusUser r WHERE r.phoneNumber = :phoneNumber")
    , @NamedQuery(name = "RedbusUser.findByUserStatus", query = "SELECT r FROM RedbusUser r WHERE r.userStatus = :userStatus")})
public class RedbusUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "user_name")
    private String userName;
    @Basic(optional = false)
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "phone_number")
    private String phoneNumber;
    @Basic(optional = false)
    @Column(name = "user_status")
    private String userStatus;

    public RedbusUser() {
    }

    public RedbusUser(Integer id) {
        this.id = id;
    }

    public RedbusUser(Integer id, String userName, Date dob, String gender, String email, String phoneNumber, String userStatus) {
        this.id = id;
        this.userName = userName;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userStatus = userStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
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
        if (!(object instanceof RedbusUser)) {
            return false;
        }
        RedbusUser other = (RedbusUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.RedbusUser[ id=" + id + " ]";
    }

	
    
}
