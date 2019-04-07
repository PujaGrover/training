package com.hcsc.di.innerbeans;

public class Parent {
	private String parentName;
	private int parentAge;
	private String company;
	private Child kid1;
	private Child kid2;
	private Child kid3;

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public int getParentAge() {
		return parentAge;
	}

	public void setParentAge(int parentAge) {
		this.parentAge = parentAge;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Child getKid1() {
		return kid1;
	}

	public void setKid1(Child kid1) {
		this.kid1 = kid1;
	}

	public Child getKid2() {
		return kid2;
	}

	public void setKid2(Child kid2) {
		this.kid2 = kid2;
	}

	public Child getKid3() {
		return kid3;
	}

	public void setKid3(Child kid3) {
		this.kid3 = kid3;
	}

	public String toString() {
		return "Parent Details :\n\nParent Name : " + parentName
				+ "\nParent Age : " + parentAge + "\nWorks in " + company
				+ "\n\n Child Details Are :\n\n" + kid1 + "\n" + kid2 + "\n"
				+ kid3;
	}

}
