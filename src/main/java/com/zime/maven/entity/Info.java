package com.zime.maven.entity;

public class Info {
    private Integer bId;

    private String bName;

    private String bIsbn;

    private String bPrice;

    private String bAuthor;

    private String bPublish;

    private Integer bNum;

    private Integer bBm;
    
    private Bm bm;
    
    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public String getbIsbn() {
        return bIsbn;
    }

    public void setbIsbn(String bIsbn) {
        this.bIsbn = bIsbn == null ? null : bIsbn.trim();
    }

    public String getbPrice() {
		return bPrice;
	}

	public void setbPrice(String bPrice) {
		this.bPrice = bPrice;
	}

	public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor == null ? null : bAuthor.trim();
    }

    public String getbPublish() {
        return bPublish;
    }

    public void setbPublish(String bPublish) {
        this.bPublish = bPublish == null ? null : bPublish.trim();
    }

    public Integer getbNum() {
        return bNum;
    }

    public void setbNum(Integer bNum) {
        this.bNum = bNum;
    }

    public Integer getbBm() {
        return bBm;
    }

    public void setbBm(Integer bBm) {
        this.bBm = bBm;
    }

	public Bm getBm() {
		return bm;
	}

	public void setBm(Bm bm) {
		this.bm = bm;
	}

	@Override
	public String toString() {
		return "Info [bId=" + bId + ", bName=" + bName + ", bIsbn=" + bIsbn + ", bPrice=" + bPrice + ", bAuthor="
				+ bAuthor + ", bPublish=" + bPublish + ", bNum=" + bNum + ", bBm=" + bBm + ", bm=" + bm + "]";
	}

	public Info(Integer bId, String bName, String bIsbn, String bPrice, String bAuthor, String bPublish, Integer bNum,
			Integer bBm) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bIsbn = bIsbn;
		this.bPrice = bPrice;
		this.bAuthor = bAuthor;
		this.bPublish = bPublish;
		this.bNum = bNum;
		this.bBm = bBm;
	}

	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}