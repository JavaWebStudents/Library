package com.zime.maven.entity;

import java.util.Date;

public class Borrow {
    private Integer bwId;

    private String bwIsbn;

    private String bwUsername;

    private Date bwOuttime;

    private Date bwEndtime;
    
    private Info info;
    
    private User user;

    public Integer getBwId() {
        return bwId;
    }

    public void setBwId(Integer bwId) {
        this.bwId = bwId;
    }

    public String getBwIsbn() {
        return bwIsbn;
    }

    public void setBwIsbn(String bwIsbn) {
        this.bwIsbn = bwIsbn == null ? null : bwIsbn.trim();
    }

    public String getBwUsername() {
        return bwUsername;
    }

    public void setBwUsername(String bwUsername) {
        this.bwUsername = bwUsername == null ? null : bwUsername.trim();
    }

    public Date getBwOuttime() {
        return bwOuttime;
    }

    public void setBwOuttime(Date bwOuttime) {
        this.bwOuttime = bwOuttime;
    }

    public Date getBwEndtime() {
        return bwEndtime;
    }

    public void setBwEndtime(Date bwEndtime) {
        this.bwEndtime = bwEndtime;
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
		return "Borrow [bwId=" + bwId + ", bwIsbn=" + bwIsbn + ", bwUsername=" + bwUsername + ", bwOuttime=" + bwOuttime
				+ ", bwEndtime=" + bwEndtime + "]";
	}

	
	
	public Borrow(Integer bwId, String bwIsbn, String bwUsername, Date bwOuttime, Date bwEndtime, Info info,
			User user) {
		super();
		this.bwId = bwId;
		this.bwIsbn = bwIsbn;
		this.bwUsername = bwUsername;
		this.bwOuttime = bwOuttime;
		this.bwEndtime = bwEndtime;
		this.info = info;
		this.user = user;
	}

	public Borrow() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}