package com.zime.maven.entity;

public class Bm {
    private Integer bmId;

    private String bmName;

    public Integer getBmId() {
        return bmId;
    }

    public void setBmId(Integer bmId) {
        this.bmId = bmId;
    }

    public String getBmName() {
        return bmName;
    }

    public void setBmName(String bmName) {
        this.bmName = bmName == null ? null : bmName.trim();
    }

	@Override
	public String toString() {
		return "Bm [bmId=" + bmId + ", bmName=" + bmName + "]";
	}

	public Bm(Integer bmId, String bmName) {
		super();
		this.bmId = bmId;
		this.bmName = bmName;
	}

	public Bm() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}