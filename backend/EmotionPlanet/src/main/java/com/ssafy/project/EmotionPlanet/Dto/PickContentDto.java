package com.ssafy.project.EmotionPlanet.Dto;

public class PickContentDto {

    private int no;
    private int pickNo;
    private String apiId;
    private String name;
    private String descr;
    private String author;
    private int year;
    private String postImgLink;
    private int type;

    public PickContentDto() {
    }

    public PickContentDto(int no, int pickNo, String apiId, String name, String descr, String author, int year, String postImgLink, int type) {
        this.no = no;
        this.pickNo = pickNo;
        this.apiId = apiId;
        this.name = name;
        this.descr = descr;
        this.author = author;
        this.year = year;
        this.postImgLink = postImgLink;
        this.type = type;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getPickNo() {
        return pickNo;
    }

    public void setPickNo(int pickNo) {
        this.pickNo = pickNo;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPostImgLink() {
        return postImgLink;
    }

    public void setPostImgLink(String postImgLink) {
        this.postImgLink = postImgLink;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

//	private int no;
//	private int pickNo;
//	private int apiNo;
//	private String name;
//	private String descr;
//	private String author;
//	private int year;
//	private int type;
//	public int getNo() {
//		return no;
//	}
//	public void setNo(int no) {
//		this.no = no;
//	}
//	public int getListNo() {
//		return pickNo;
//	}
//	public void setListNo(int pickNo) {
//		this.pickNo = pickNo;
//	}
//	public int getApiNo() {
//		return apiNo;
//	}
//	public void setApiNo(int apiNo) {
//		this.apiNo = apiNo;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDescr() {
//		return descr;
//	}
//	public void setDescr(String descr) {
//		this.descr = descr;
//	}
//	public String getAuthor() {
//		return author;
//	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//	public int getYear() {
//		return year;
//	}
//	public void setYear(int year) {
//		this.year = year;
//	}
//	public int getType() {
//		return type;
//	}
//	public void setType(int type) {
//		this.type = type;
//	}
//	public PickContentDto() {}
//	public PickContentDto(int no, int pickNo, int apiNo, String name, String descr, String author, int year, int type) {
//		super();
//		this.no = no;
//		this.pickNo = pickNo;
//		this.apiNo = apiNo;
//		this.name = name;
//		this.descr = descr;
//		this.author = author;
//		this.year = year;
//		this.type = type;
//	}
//	@Override
//	public String toString() {
//		return "ContentDto [no=" + no + ", pickNo=" + pickNo + ", apiNo=" + apiNo + ", name=" + name + ", descr="
//				+ descr + ", author=" + author + ", year=" + year + ", type=" + type + "]";
//	}
//}
//>>>>>>> 193100556e19fef710dc760d0845d4e85e570120
