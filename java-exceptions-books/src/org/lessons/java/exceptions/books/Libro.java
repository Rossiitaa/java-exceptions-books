package org.lessons.java.exceptions.books;

public class Libro {

	private String titolo;
	private int numeroPagine;
	private String autore;
	private String editore;

	public Libro(String titolo, String autore, String editore, int numeroPagine) {
		super();
		this.titolo = titolo;
		this.numeroPagine = numeroPagine;
		this.autore = autore;
		this.editore = editore;

	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}
}
