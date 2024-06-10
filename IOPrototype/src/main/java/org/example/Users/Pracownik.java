package org.example.Users;

import org.example.Abstracts.WebUzytkownik;

import java.io.File;

public class Pracownik extends WebUzytkownik {

	private String imie;
	private String nazwisko;
	private String email;
	private String numer_telefona;
	private String pesel;
	private String numer_konta;
	private String opis;
	private Boolean subskrypcja_profilu;
	private File cv;

	public Pracownik(String login,
					 String password,
					 String imie,
					 String nazwisko,
					 String email,
					 String numer_telefona,
					 String pesel,
					 String numer_konta,
					 String opis
	) {
		super(login, password);
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.email = email;
		this.numer_telefona = numer_telefona;
		this.pesel = pesel;
		this.numer_konta = numer_konta;
		this.opis = opis;
		this.subskrypcja_profilu = false;
		this.cv = null;
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