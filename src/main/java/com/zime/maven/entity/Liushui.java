package com.zime.maven.entity;

import java.util.Date;

public class Liushui {
    private Integer lId;

    private String lIsbn;

    private String lUsername;

    private String lHandle;

    private Date lDatetime;
    
    private Info info;
    
    private User user; 

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public String getlIsbn() {
        return lIsbn;
    }

    public void setlIsbn(String lIsbn) {
        this.lIsbn = lIsbn == null ? null : lIsbn.trim();
    }

    public String getlUsername() {
        return lUsername;
    }

    public void setlUsername(String lUsername) {
        this.lUsername = lUsername == null ? null : lUsername.trim();
    }

    public String getlHandle() {
        return lHandle;
    }

    public void setlHandle(String lHandle) {
        this.lHandle = lHandle == null ? null : lHandle.trim();
    }

    public Date getlDatetime() {
        return lDatetime;
    }

    public void setlDatetime(Date lDatetime) {
        this.lDatetime = lDatetime;
    }

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Liushui [lId=" + lId + ", lIsbn=" + lIsbn + ", lUsername=" + lUsername + ", lHandle=" + lHandle
				+ ", lDatetime=" + lDatetime + "]";
	}

	public Liushui(Integer lId, String lIsbn, String lUsername, String lHandle, Date lDatetime, Info info, User user) {
		super();
		this.lId = lId;
		this.lIsbn = lIsbn;
		this.lUsername = lUsername;
		this.lHandle = lHandle;
		this.lDatetime = lDatetime;
		this.info = info;
		this.user = user;
	}

	public Liushui() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}