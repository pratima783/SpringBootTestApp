package com.src.model;

public class Student {
private String sudentId;
private String studentPassword;
private String stuentName;
private int studentAge;
private String studentAddress;
private long stuentMobile;

public Student(String sudentId, String studentPassword, String stuentName, String studentAddress, int studentAge,
		long stuentMobile) {
	super();
	this.sudentId = sudentId;
	this.studentPassword = studentPassword;
	this.stuentName = stuentName;
	this.studentAddress = studentAddress;
	this.studentAge = studentAge;
	this.stuentMobile = stuentMobile;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public String getSudentId() {
	return sudentId;
}
public void setSudentId(String sudentId) {
	this.sudentId = sudentId;
}
public String getStudentPassword() {
	return studentPassword;
}
public void setStudentPassword(String studentPassword) {
	this.studentPassword = studentPassword;
}
public String getStuentName() {
	return stuentName;
}
public void setStuentName(String stuentName) {
	this.stuentName = stuentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
public int getStudentAge() {
	return studentAge;
}
public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}
public long getStuentMobile() {
	return stuentMobile;
}
public void setStuentMobile(long stuentMobile) {
	this.stuentMobile = stuentMobile;
}
@Override
public String toString() {
	return "Student [sudentId=" + sudentId + ", studentPassword=" + studentPassword + ", stuentName=" + stuentName
			+ ", studentAddress=" + studentAddress + ", studentAge=" + studentAge + ", stuentMobile=" + stuentMobile
			+ "]";
}


}
