/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crg.sms.studentprofile.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "sms_student_profile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SmsStudentProfile.findAll", query = "SELECT s FROM SmsStudentProfile s")
    , @NamedQuery(name = "SmsStudentProfile.findByStudentAdmissionNo", query = "SELECT s FROM SmsStudentProfile s WHERE s.studentAdmissionNo = :studentAdmissionNo")
    , @NamedQuery(name = "SmsStudentProfile.findByJoiningDate", query = "SELECT s FROM SmsStudentProfile s WHERE s.joiningDate = :joiningDate")
    , @NamedQuery(name = "SmsStudentProfile.findByFristName", query = "SELECT s FROM SmsStudentProfile s WHERE s.fristName = :fristName")
    , @NamedQuery(name = "SmsStudentProfile.findByMiddleName", query = "SELECT s FROM SmsStudentProfile s WHERE s.middleName = :middleName")
    , @NamedQuery(name = "SmsStudentProfile.findByLastName", query = "SELECT s FROM SmsStudentProfile s WHERE s.lastName = :lastName")
    , @NamedQuery(name = "SmsStudentProfile.findByDisplyName", query = "SELECT s FROM SmsStudentProfile s WHERE s.displyName = :displyName")
    , @NamedQuery(name = "SmsStudentProfile.findByDateOfBirth", query = "SELECT s FROM SmsStudentProfile s WHERE s.dateOfBirth = :dateOfBirth")
    , @NamedQuery(name = "SmsStudentProfile.findByGender", query = "SELECT s FROM SmsStudentProfile s WHERE s.gender = :gender")
    , @NamedQuery(name = "SmsStudentProfile.findByBloodGroup", query = "SELECT s FROM SmsStudentProfile s WHERE s.bloodGroup = :bloodGroup")
    , @NamedQuery(name = "SmsStudentProfile.findByBirthplace", query = "SELECT s FROM SmsStudentProfile s WHERE s.birthplace = :birthplace")
    , @NamedQuery(name = "SmsStudentProfile.findByNationality", query = "SELECT s FROM SmsStudentProfile s WHERE s.nationality = :nationality")
    , @NamedQuery(name = "SmsStudentProfile.findByMothertongue", query = "SELECT s FROM SmsStudentProfile s WHERE s.mothertongue = :mothertongue")
    , @NamedQuery(name = "SmsStudentProfile.findByCategory", query = "SELECT s FROM SmsStudentProfile s WHERE s.category = :category")
    , @NamedQuery(name = "SmsStudentProfile.findByReligion", query = "SELECT s FROM SmsStudentProfile s WHERE s.religion = :religion")
    , @NamedQuery(name = "SmsStudentProfile.findByMobile", query = "SELECT s FROM SmsStudentProfile s WHERE s.mobile = :mobile")
    , @NamedQuery(name = "SmsStudentProfile.findByEmail", query = "SELECT s FROM SmsStudentProfile s WHERE s.email = :email")
    , @NamedQuery(name = "SmsStudentProfile.findByJoinClass", query = "SELECT s FROM SmsStudentProfile s WHERE s.joinClass = :joinClass")
    , @NamedQuery(name = "SmsStudentProfile.findByBatch", query = "SELECT s FROM SmsStudentProfile s WHERE s.batch = :batch")
    , @NamedQuery(name = "SmsStudentProfile.findByRollnumber", query = "SELECT s FROM SmsStudentProfile s WHERE s.rollnumber = :rollnumber")
    , @NamedQuery(name = "SmsStudentProfile.findByProfilePhotoName", query = "SELECT s FROM SmsStudentProfile s WHERE s.profilePhotoName = :profilePhotoName")
    , @NamedQuery(name = "SmsStudentProfile.findByUsername", query = "SELECT s FROM SmsStudentProfile s WHERE s.username = :username")})
public class SmsStudentProfile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "STUDENT_ADMISSION_NO")
    private Integer studentAdmissionNo;
    @Basic(optional = false)
    @Column(name = "JOINING_DATE")
    @Temporal(TemporalType.DATE)
    private Date joiningDate;
    @Basic(optional = false)
    @Column(name = "FRIST_NAME")
    private String fristName;
    @Column(name = "MIDDLE_NAME")
    private String middleName;
    @Basic(optional = false)
    @Column(name = "LAST_NAME")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "DISPLY_NAME")
    private String displyName;
    @Basic(optional = false)
    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Basic(optional = false)
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "BLOOD_GROUP")
    private String bloodGroup;
    @Basic(optional = false)
    @Column(name = "BIRTHPLACE")
    private String birthplace;
    @Basic(optional = false)
    @Column(name = "NATIONALITY")
    private String nationality;
    @Column(name = "MOTHERTONGUE")
    private String mothertongue;
    @Column(name = "CATEGORY")
    private String category;
    @Basic(optional = false)
    @Column(name = "RELIGION")
    private String religion;
    @Column(name = "MOBILE")
    private String mobile;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "JOIN_CLASS")
    private String joinClass;
    @Column(name = "BATCH")
    private String batch;
    @Basic(optional = false)
    @Column(name = "ROLLNUMBER")
    private int rollnumber;
    @Basic(optional = false)
    @Column(name = "PROFILE_PHOTO_NAME")
    private String profilePhotoName;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @ManyToMany(mappedBy = "smsStudentProfileCollection")
    private Collection<SmsParentProfile> smsParentProfileCollection;
    @JoinColumns({
        @JoinColumn(name = "PARMANENT_ADDRESSID", referencedColumnName = "ADDRESS_ID")
        , @JoinColumn(name = "PARMANENT_ADDRESSID", referencedColumnName = "ADDRESS_ID")})
    @ManyToOne
    private SmsAddress smsAddress;
    @JoinColumns({
        @JoinColumn(name = "PRESENT_ADDRESSID", referencedColumnName = "ADDRESS_ID")
        , @JoinColumn(name = "PRESENT_ADDRESSID", referencedColumnName = "ADDRESS_ID")})
    @ManyToOne
    private SmsAddress smsAddress1;
    @JoinColumns({
        @JoinColumn(name = "BRANCH", referencedColumnName = "BRANCH_ID")
        , @JoinColumn(name = "BRANCH", referencedColumnName = "BRANCH_ID")})
    @ManyToOne(optional = false)
    private SmsOrganisationBranchs smsOrganisationBranchs;
    @JoinColumns({
        @JoinColumn(name = "ORGID", referencedColumnName = "ORGANISATION_ID")
        , @JoinColumn(name = "ORGID", referencedColumnName = "ORGANISATION_ID")})
    @ManyToOne(optional = false)
    private SmsOrganisationInfo smsOrganisationInfo;
    @JoinColumns({
        @JoinColumn(name = "PREVIOUS_EDUCATION_ID", referencedColumnName = "PREVIOUS_EDUCATION_ID")
        , @JoinColumn(name = "PREVIOUS_EDUCATION_ID", referencedColumnName = "PREVIOUS_EDUCATION_ID")})
    @ManyToOne
    private SmsPreviousEducation smsPreviousEducation;

    public SmsStudentProfile() {
    }

    public SmsStudentProfile(Integer studentAdmissionNo) {
        this.studentAdmissionNo = studentAdmissionNo;
    }

    public SmsStudentProfile(Integer studentAdmissionNo, Date joiningDate, String fristName, String lastName, String displyName, Date dateOfBirth, String gender, String birthplace, String nationality, String religion, int rollnumber, String profilePhotoName, String username) {
        this.studentAdmissionNo = studentAdmissionNo;
        this.joiningDate = joiningDate;
        this.fristName = fristName;
        this.lastName = lastName;
        this.displyName = displyName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.birthplace = birthplace;
        this.nationality = nationality;
        this.religion = religion;
        this.rollnumber = rollnumber;
        this.profilePhotoName = profilePhotoName;
        this.username = username;
    }

    public Integer getStudentAdmissionNo() {
        return studentAdmissionNo;
    }

    public void setStudentAdmissionNo(Integer studentAdmissionNo) {
        this.studentAdmissionNo = studentAdmissionNo;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDisplyName() {
        return displyName;
    }

    public void setDisplyName(String displyName) {
        this.displyName = displyName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMothertongue() {
        return mothertongue;
    }

    public void setMothertongue(String mothertongue) {
        this.mothertongue = mothertongue;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJoinClass() {
        return joinClass;
    }

    public void setJoinClass(String joinClass) {
        this.joinClass = joinClass;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getProfilePhotoName() {
        return profilePhotoName;
    }

    public void setProfilePhotoName(String profilePhotoName) {
        this.profilePhotoName = profilePhotoName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @XmlTransient
    public Collection<SmsParentProfile> getSmsParentProfileCollection() {
        return smsParentProfileCollection;
    }

    public void setSmsParentProfileCollection(Collection<SmsParentProfile> smsParentProfileCollection) {
        this.smsParentProfileCollection = smsParentProfileCollection;
    }

    public SmsAddress getSmsAddress() {
        return smsAddress;
    }

    public void setSmsAddress(SmsAddress smsAddress) {
        this.smsAddress = smsAddress;
    }

    public SmsAddress getSmsAddress1() {
        return smsAddress1;
    }

    public void setSmsAddress1(SmsAddress smsAddress1) {
        this.smsAddress1 = smsAddress1;
    }

    public SmsOrganisationBranchs getSmsOrganisationBranchs() {
        return smsOrganisationBranchs;
    }

    public void setSmsOrganisationBranchs(SmsOrganisationBranchs smsOrganisationBranchs) {
        this.smsOrganisationBranchs = smsOrganisationBranchs;
    }

    public SmsOrganisationInfo getSmsOrganisationInfo() {
        return smsOrganisationInfo;
    }

    public void setSmsOrganisationInfo(SmsOrganisationInfo smsOrganisationInfo) {
        this.smsOrganisationInfo = smsOrganisationInfo;
    }

    public SmsPreviousEducation getSmsPreviousEducation() {
        return smsPreviousEducation;
    }

    public void setSmsPreviousEducation(SmsPreviousEducation smsPreviousEducation) {
        this.smsPreviousEducation = smsPreviousEducation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentAdmissionNo != null ? studentAdmissionNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SmsStudentProfile)) {
            return false;
        }
        SmsStudentProfile other = (SmsStudentProfile) object;
        if ((this.studentAdmissionNo == null && other.studentAdmissionNo != null) || (this.studentAdmissionNo != null && !this.studentAdmissionNo.equals(other.studentAdmissionNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.SmsStudentProfile[ studentAdmissionNo=" + studentAdmissionNo + " ]";
    }
    
}
