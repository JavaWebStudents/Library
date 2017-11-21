package com.zime.maven.entity;

public class User {
    private Integer uId;

    private String uName;

    private String uUsername;

    private String uPassword;

    private String uGender;

    private Integer uNum;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuGender() {
        return uGender;
    }

    public void setuGender(String uGender) {
        this.uGender = uGender == null ? null : uGender.trim();
    }

    public Integer getuNum() {
        return uNum;
    }

    public void setuNum(Integer uNum) {
        this.uNum = uNum;
    }

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uUsername=" + uUsername + ", uPassword=" + uPassword
				+ ", uGender=" + uGender + ", uNum=" + uNum + "]";
	}

	public User(Integer uId, String uName, String uUsername, String uPassword, String uGender, Integer uNum) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uUsername = uUsername;
		this.uPassword = uPassword;
		this.uGender = uGender;
		this.uNum = uNum;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}