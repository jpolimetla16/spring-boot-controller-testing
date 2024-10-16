package com.jp.user;

public class UserDetailsResponse {

	private Integer id;
	private String fullName;
	
	public UserDetailsResponse() {
		
	}

	public UserDetailsResponse(Integer id, String fullName) {
		this.id = id;
		this.fullName = fullName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
