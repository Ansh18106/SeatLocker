package com.example.SeatLocker.entities;

import com.example.SeatLocker.entities.enums.UserType;
import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userID;
	@Column(name = "Username")
	private String userName;
	@Column(name = "Password")
	private String password;
	@Column(name = "Email")
	private String email;
	@Column(name = "user_type")
	@Enumerated(EnumType.STRING)
	private UserType userType;
	public Long getUserId() {
		return userID;
	}
	public void setUserId(Long userId) {
		this.userID = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userID + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", userType=" + userType + "]";
	}
	
}
