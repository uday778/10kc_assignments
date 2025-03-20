package com.library.books;

public class Library {
	private String libraryName;
	private int totalBooks;
	
	public void setLibraryName(String libraryName) {
		this.libraryName=libraryName;
		
	}
	public void setTotalBooks(int totalBooks) {
		this.totalBooks=totalBooks;
	}
	public int getTotalBooks(int totalBooks) {
		return totalBooks;
	}
	public String getLibraryName(int totalBooks) {
		return libraryName;
	}
	public void showLibraryDetails() {
		System.out.println("libraryName: "+libraryName);
		System.out.println("totalBooks"+totalBooks);
	}
}
