package org.example.Users;

import org.example.Abstracts.WebUzytkownik;

public class Pracodawca extends WebUzytkownik {

	private String pracodawca_id;
	private String imie;
	private String nazwisko;
	private String email;
	private int pesel;
	private String numer_telefona;
	private String organizacja;
	private String numer_konta;
	private String opis;
	private Boolean subskrypcja_profilu;

	public Pracodawca(String login, String password) {
		super(login, password);
	}

	public void stworzenia_ogloszenia() {
		// TODO - implement Pracodawca.stworzenia_ogloszenia
		throw new UnsupportedOperationException();
	}

	public void przegladanie_ogloszen() {
		// TODO - implement Pracodawca.przegladanie_ogloszen
		throw new UnsupportedOperationException();
	}

	public void oceniania_ogloszenia() {
		// TODO - implement Pracodawca.oceniania_ogloszenia
		throw new UnsupportedOperationException();
	}

	public void przegladanie_kategorij() {
		// TODO - implement Pracodawca.przegladanie_kategorij
		throw new UnsupportedOperationException();
	}

	public void napisz_powiadomenia() {
		// TODO - implement Pracodawca.napisz_powiadomenia
		throw new UnsupportedOperationException();
	}

	public void otrzymania_powiadomenia() {
		// TODO - implement Pracodawca.otrzymania_powiadomenia
		throw new UnsupportedOperationException();
	}

	public void pobiezanie_cv() {
		// TODO - implement Pracodawca.pobiezanie_cv
		throw new UnsupportedOperationException();
	}

	public void napisz_problem() {
		// TODO - implement Pracodawca.napisz_problem
		throw new UnsupportedOperationException();
	}

}