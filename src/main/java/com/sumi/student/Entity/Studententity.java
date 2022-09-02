package com.sumi.student.Entity;

public class Studententity {
	private int RollNo;
	private String Name;
	private int contactno;
	private String city;
    private String Emailid;
	private int standard;
	public Studententity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Studententity(int rollNo, String name, int contactno, String city, String emailid, int standard) {
		super();
		RollNo = rollNo;
		Name = name;
		this.contactno = contactno;
		this.city = city;
		Emailid = emailid;
		this.standard = standard;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "Studententity [RollNo=" + RollNo + ", Name=" + Name + ", contactno=" + contactno + ", city=" + city
				+ ", Emailid=" + Emailid + ", standard=" + standard + "]";
	}

}
