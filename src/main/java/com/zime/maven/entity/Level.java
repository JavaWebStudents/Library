package com.zime.maven.entity;

public class Level {
    private Integer leId;

    private String leName;

    public Integer getLeId() {
        return leId;
    }

    public void setLeId(Integer leId) {
        this.leId = leId;
    }

    public String getLeName() {
        return leName;
    }

    public void setLeName(String leName) {
        this.leName = leName == null ? null : leName.trim();
    }

	@Override
	public String toString() {
		return "Level [leId=" + leId + ", leName=" + leName + "]";
	}

	public Level(Integer leId, String leName) {
		super();
		this.leId = leId;
		this.leName = leName;
	}

	public Level() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}