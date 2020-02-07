package spring.boot.rest.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class StudentAddress {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "id",nullable = false)
	private Long id;
	
	@Column(name = "address1")
	private String address1;
	
	@Column(name = "address2")
	private String address2;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "mobileNo")
    private Long mobileNo;
    
	@Column(name = "email")
    private String email;
    
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,optional  = false)
    @JoinColumn(name = "student_id")
    private Student student;
    
	public StudentAddress() { 
		super();
		
	}

	public String getAddress1() {
		return address1;
	}

	public StudentAddress setAddress1(String address1) {
		this.address1 = address1;
		
		return this;
	}

	public String getAddress2() {
		return address2;
	}

	public StudentAddress setAddress2(String address2) {
		this.address2 = address2;
		
		return this;
	}

	public String getCity() {
		return city;
	}

	public StudentAddress setCity(String city) {
		this.city = city;
		
		return this;
	}

	public String getState() {
		return state;
	}

	public StudentAddress setState(String state) {
		this.state = state;
		
		return this;
	}

	public String getCountry() {
		return country;
	}

	public StudentAddress setCountry(String country) {
		this.country = country;
		
		return this;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public StudentAddress setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
		
		return this;
	}

	public String getEmail() {
		return email;
	}

	public StudentAddress setEmail(String email) {
		this.email = email;
		
		return this;
	}

	public Long getId() {
		return id;
	}

	public StudentAddress setId(Long id) {
		this.id = id;
		
		return this;
		
	}

	public Student getStudent() {
		return student;
	}

	public StudentAddress setStudent(Student student) {
		this.student = student;
		
		return this;
	}
	
	
	
	
}
