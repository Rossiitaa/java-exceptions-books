package org.lessons.java.exceptions.books;

public class Libro {

	private String titolo;
	private String autore;
	private String editore;
	private String valida = "";
	private int numeroPagine;

	public Libro(String titolo, String autore, String editore, int numeroPagine)
			throws PagineException, VuotiException {
		super();

		validatePagine(numeroPagine);
		this.numeroPagine = numeroPagine;

		validateVuoti(titolo, "titolo");
		this.titolo = titolo;

		validateVuoti(autore, "autore");
		this.autore = autore;

		validateVuoti(editore, "editore");
		this.editore = editore;

		validateFinale();

	}

	public void validatePagine(int n) {
		if (n < 0)
			valida += " Numero Negativo";
	}

	public void validateVuoti(String s, String n) {
		if (s.trim().length() < 1)
			valida += "Campo " + n + " vuoto";
	}

	public void validateFinale() throws VuotiException {
		if (valida.length() > 0) {
			throw new VuotiException(valida);
		}
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) throws VuotiException {
		validateVuoti(titolo, "titolo");
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws VuotiException {
		validateVuoti(autore, "autore");
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) throws VuotiException {
		validateVuoti(editore, "editore");
		this.editore = editore;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) throws PagineException {
		validatePagine(numeroPagine);

		this.numeroPagine = numeroPagine;
	}

}
