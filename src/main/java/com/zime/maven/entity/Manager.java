package com.zime.maven.entity;

public class Manager {
    private Integer mId;

    private String mName;

    private String mUsername;

    private String mPassword;

    private String mGender;

    private String mPhone;

    private Integer mLevel;
    
    private Level level;
    
    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername == null ? null : mUsername.trim();
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword == null ? null : mPassword.trim();
    }

    public String getmGender() {
        return mGender;
    }

    public void setmGender(String mGender) {
        this.mGender = mGender == null ? null : mGender.trim();
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone == null ? null : mPhone.trim();
    }

    public Integer getmLevel() {
        return mLevel;
    }

    public void setmLevel(Integer mLevel) {
        this.mLevel = mLevel;
    }

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Manager [mId=" + mId + ", mName=" + mName + ", mUsername=" + mUsername + ", mPassword=" + mPassword
				+ ", mGender=" + mGender + ", mPhone=" + mPhone + ", mLevel=" + mLevel + ", level=" + level + "]";
	}

	public Manager(Integer mId, String mName, String mUsername, String mPassword, String mGender, String mPhone,
			Integer mLevel) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.mUsername = mUsername;
		this.mPassword = mPassword;
		this.mGender = mGender;
		this.mPhone = mPhone;
		this.mLevel = mLevel;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}