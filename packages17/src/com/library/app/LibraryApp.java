package com.library.app;

import com.library.books.Library;
import com.library.staff.Librarian;

public class LibraryApp {
	public static void main(String[] args) {
		Library library=new Library();
		Librarian librarian=new Librarian();
		
		library.setLibraryName("Central Library");
		library.setTotalBooks(10000);
		library.showLibraryDetails();
		
		System.out.println("________");
		
		librarian.setLibrarianName("Uday Kumar");
		librarian.setYearsOfExperience(10);
		librarian.showLibrarianInfo();
    }
}
