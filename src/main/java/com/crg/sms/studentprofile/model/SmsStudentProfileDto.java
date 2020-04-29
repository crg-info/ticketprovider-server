package com.crg.sms.studentprofile.model;

import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlTransient;

public class SmsStudentProfileDto {

	 private Integer studentAdmissionNo;
	    
	    private Date joiningDate;
	   
	    private String fristName;
	   
	    private String middleName;
	   
	    private String lastName;
	   
	    private String displyName;
	   
	    private Date dateOfBirth;
	    
	    private String gender;
	   
	    private String bloodGroup;
	   
	    private String birthplace;
	   
	    private String nationality;
	    
	    private String mothertongue;
	    
	    private String category;
	   
	    private String religion;
	    
	    private String mobile;
	    
	    private String email;
	   
	    private String joinClass;
	   
	    private String batch;
	   
	    private int rollnumber;
	   
	    private String profilePhotoName;
	   
	    private String username;
	   
	    private Collection<SmsParentProfile> smsParentProfileCollection;
	   
	    private SmsAddress smsAddress;
	    
	    private SmsAddress smsAddress1;
	   
	    private SmsOrganisationBranchs smsOrganisationBranchs;
	   
	    private SmsOrganisationInfo smsOrganisationInfo;
	   
	    private SmsPreviousEducation smsPreviousEducation;

	    
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

	   
}
