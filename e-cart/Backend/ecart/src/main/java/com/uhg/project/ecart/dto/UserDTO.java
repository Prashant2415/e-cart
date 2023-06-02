package com.uhg.project.ecart.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("password")
public class UserDTO {

	private Long id;

    private String firstName;
    
    private String lastName;
    
    private String email;

	private long number;
    
    private String role;
    private String password;
    
//    public UserDTO(Long id, String firstName, String lastName, String email, long number, String password, String role) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		LastName = lastName;
//		this.email = email;
//		this.number = number;
//		this.password=password;
//		this.role = role;
//	}
    public UserDTO() {
    	
    }


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	} 

}
