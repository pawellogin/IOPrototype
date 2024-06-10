package org.example.Users;

import org.example.Abstracts.WebUzytkownik;

public class Pracodawca extends WebUzytkownik {

	private String imie;
	private String nazwisko;
	private String email;
	private String pesel;
	private String numer_telefona;
	private String organizacja;
	private String numer_konta;
	private String opis;
	private Boolean subskrypcja_profilu;

	public Pracodawca(String login,
					  String password,
					  String imie,
					  String nazwisko,
					  String email,
					  String pesel,
					  String numer_telefona,
					  String organizacja,
					  String numer_konta,
					  String opis
	) {
		super(login, password);
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.email = email;
		this.pesel = pesel;
		this.numer_telefona = numer_telefona;
		this.organizacja = organizacja;
		this.numer_konta = numer_konta;
		this.opis = opis;
		this.subskrypcja_profilu = null;
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