package org.lessons.java.exceptions.books;

public class PagineException extends Exception {

	public PagineException() {
		super("Il numero delle pagine non può essere negativo!!!");
	}
}
