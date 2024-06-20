package GramPanchayat.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Voter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private  int id;
	private  String date_of_birth;
	private String  Firstname;
	private String Middlename;
	private String Lastname;
	private String Gender;
	private String adharcard;
	private String Address;
	private int mobilenumber;
	
	public Voter(int id, String date_of_birth, String firstname, String middlename, String lastname, String gender,
			String adharcard, String address, int mobilenumber) {
		super();
		this.id = id;
		this.date_of_birth = date_of_birth;
		Firstname = firstname;
		Middlename = middlename;
		Lastname = lastname;
		Gender = gender;
		this.adharcard = adharcard;
		Address = address;
		this.mobilenumber = mobilenumber;
	}
	public Voter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getMiddlename() {
		return Middlename;
	}
	public void setMiddlename(String middlename) {
		Middlename = middlename;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAdharcard() {
		return adharcard;
	}
	public void setAdharcard(String adharcard) {
		this.adharcard = adharcard;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	 
	
	 

}
