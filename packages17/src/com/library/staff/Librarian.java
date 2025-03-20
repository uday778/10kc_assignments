package com.library.staff;

public class Librarian {
	private String librarianName;
	private int yearsOfExperience;
	
	public void setLibrarianName(String librarianName) {
		this.librarianName=librarianName;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience=yearsOfExperience;
	}
	
	public String getLiBrarianName() {
		return librarianName;
	}
	public int getYearsOdExperience() {
		return yearsOfExperience;
	}
	
	public void showLibrarianInfo() {
		System.out.println("librarianName: "+librarianName);
		System.out.println("yearsOfExperience: "+yearsOfExperience);
	}
	
	
	
}
