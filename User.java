package com.amdocs.casaquest.model;

public class User  {

	    protected String userId;
	    protected String name;
	    protected String phoneNumber;
	    protected String email;
	    protected String password;
	    protected String userType; // "Owner" or "Tenant"
	    
		public User(String userId, String name, String phoneNumber, String email, String password, String userType) {
			super();
			this.userId = userId;
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.password = password;
			this.userType = userType;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUserType() {
			return userType;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
}
