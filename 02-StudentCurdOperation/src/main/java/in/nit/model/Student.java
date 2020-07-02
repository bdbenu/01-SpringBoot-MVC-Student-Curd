package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(name = "STUDENT_ID")
	private Integer stdId;
	@Column(name = "STUDENT_NAME")
	private String stdName;
	@Column(name = "STUDENT_EMAIL")
	private String stdEmail;
	@Column(name = "STUDENT_MOBILE")
	private String stdMobile;
	@Column(name = "USERNAME")
	private String stdUsername;
	@Column(name = "PASSWORD")
	private String stdPassword;
	@Column(name = "GENDER")
	private String stdGender;
	
	

}
