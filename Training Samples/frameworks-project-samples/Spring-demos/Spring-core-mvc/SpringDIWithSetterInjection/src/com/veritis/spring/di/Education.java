package com.veritis.spring.di;

public class Education {
	String degree;
	String university;
	String majorin;
	int grade;

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getMajorin() {
		return majorin;
	}

	public void setMajorin(String majorin) {
		this.majorin = majorin;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String toString(){
		return "Eductional Details :\n"+degree+"\n"+university+"\n"+majorin+"\n"+grade;
	}

}
