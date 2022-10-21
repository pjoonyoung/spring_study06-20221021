package com.joonyoung.test;

public class Family {
	public String father;
	public String mather;
	public String sister;
	public String brother;
	
	public Family() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Family(String father, String mather, String sister, String brother) {
		super();
		this.father = father;
		this.mather = mather;
		this.sister = sister;
		this.brother = brother;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getMather() {
		return mather;
	}

	public void setMather(String mather) {
		this.mather = mather;
	}

	public String getSister() {
		return sister;
	}

	public void setSister(String sister) {
		this.sister = sister;
	}

	public String getBrother() {
		return brother;
	}

	public void setBrother(String brother) {
		this.brother = brother;
	}
	
	
}
