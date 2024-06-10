package org.example.Users;

import org.example.Abstracts.WebUzytkownik;

import java.io.File;

public class Pracownik extends WebUzytkownik {

	private static int idCounter = 0;
	private String pracownik_id;
	private String imie;
	private String nazwisko;
	private String email;
	private String numer_telefona;
	private int pesel;
	private String numer_konta;
	private String opis;
	private Boolean subskrypcja_profilu;
	private File cv;
	private File attribute;

	public Pracownik(String login, String password) {
		super(login, password);
		this.pracownik_id = generateId();
	}

	private synchronized String generateId() {
		return "PRAC" + (++idCounter);
	}

	public void stworzenia_ogloszenia() {
		// TODO - implement Pracownik.stworzenia_ogloszenia
		throw new UnsupportedOperationException();
	}

	public void przegladanie_ogloszen() {
		// TODO - implement Pracownik.przegladanie_ogloszen
		throw new UnsupportedOperationException();
	}

	public void oceniania_ogloszenia() {
		// TODO - implement Pracownik.oceniania_ogloszenia
		throw new UnsupportedOperationException();
	}

	public void przegladanie_kategorij() {
		// TODO - implement Pracownik.przegladanie_kategorij
		throw new UnsupportedOperationException();
	}

	public void napisz_powiadomenia() {
		// TODO - implement Pracownik.napisz_powiadomenia
		throw new UnsupportedOperationException();
	}

	public void otrzymania_powiadomenia() {
		// TODO - implement Pracownik.otrzymania_powiadomenia
		throw new UnsupportedOperationException();
	}

	public void wysylanie_CV() {
		// TODO - implement Pracownik.wysylanie_CV
		throw new UnsupportedOperationException();
	}

	public void napisz_problem() {
		// TODO - implement Pracownik.napisz_problem
		throw new UnsupportedOperationException();
	}

}