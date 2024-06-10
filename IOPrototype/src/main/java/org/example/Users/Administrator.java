package org.example.Users;

import org.example.Abstracts.WebUzytkownik;

public class Administrator extends WebUzytkownik {

	private String administrator_id;
	private String imie;
	private String nazwisko;
	private String email;
	private String numer_telefona;

	public Administrator(String login, String password) {
		super(login, password);
	}

	public void zmiana_statusu_uzytkownikow() {
		// TODO - implement Administrator.zmiana_statusu_uzytkownikow
		throw new UnsupportedOperationException();
	}

	public void zmiana_statusu_ogloszen() {
		// TODO - implement Administrator.zmiana_statusu_ogloszen
		throw new UnsupportedOperationException();
	}

	public void przegladanie_uzytkownikow() {
		// TODO - implement Administrator.przegladanie_uzytkownikow
		throw new UnsupportedOperationException();
	}

	public void edytowanie_uzytkownikow() {
		// TODO - implement Administrator.edytowanie_uzytkownikow
		throw new UnsupportedOperationException();
	}

	public void edytowanie_ogloszen() {
		// TODO - implement Administrator.edytowanie_ogloszen
		throw new UnsupportedOperationException();
	}

	public void edytowanie_kategorij() {
		// TODO - implement Administrator.edytowanie_kategorij
		throw new UnsupportedOperationException();
	}

}