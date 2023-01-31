package org.lessons.java.exceptions.books;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int numLib, numeroPagine;
		String titolo = "we", autore, editore;
		Scanner s = new Scanner(System.in);

		System.out.print("Inserisci il tuo libro ");
		numLib = Integer.parseInt(s.nextLine());
		Libro[] libri = new Libro[numLib];

		for (int i = 0; i < libri.length; i++) {
			System.out.print("Inserisci il titolo del libro ");
			titolo = s.nextLine();
			System.out.print("Inserisci il numero di pagine ");
			numeroPagine = Integer.parseInt(s.nextLine());

			System.out.print("Inserisci l'autore del libro ");
			autore = s.nextLine();
			System.out.print("Inserisci l'editore del libro ");
			editore = s.nextLine();

			try {
				libri[i] = new Libro(titolo, autore, editore, numeroPagine);
			} catch (Exception e) {
				System.out.println("Attenzione: " + e.getMessage());
				return;
			}

			s.close();
		}

		for (int i = 0; i < libri.length; i++) {
			System.out.println("Il libro che hai scelto: " + libri[i].getTitolo() + " " + libri[i].getNumeroPagine()
					+ " " + libri[i].getAutore() + " " + libri[i].getEditore());
		}

	}
}
