package org.example.Users;

import org.example.Abstracts.WebUzytkownik;
import org.example.Enums.StatusOgloszenia;
import org.example.Oglosznenie;

public class Moderator extends WebUzytkownik {

	private String imie;
	private String nazwisko;
	private String email;
	private String numer_telefona;

	public Moderator(String login,
					 String password,
					 String imie,
					 String nazwisko,
					 String email,
					 String numer_telefona
	) {
		super(login, password);
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.email = email;
		this.numer_telefona = numer_telefona;
	}

	public void przegladanie_problemow() {
		// TODO - implement Moderator.przegladanie_problemow
		throw new UnsupportedOperationException();
	}

	public void zmiana_statusu_uzytkownikow(WebUzytkownik webUzytkownik, org.example.Enums.Status status) {
		webUzytkownik.setStatus(status);
	}

	public void zmiana_statusu_ogloszen(Oglosznenie oglosznenie, StatusOgloszenia statusOgloszenia) {
		oglosznenie.setStatusOgloszenia(statusOgloszenia);
	}

	public void przegladanie_uzytkownikow() {
		// TODO - implement Moderator.przegladanie_uzytkownikow
		throw new UnsupportedOperationException();
	}

	public void przegladanie_platnosc() {
		// TODO - implement Moderator.przegladanie_platnosc
		throw new UnsupportedOperationException();
	}

	public void zarzadzanie_platnosciami() {
		// TODO - implement Moderator.zarzadzanie_platnosciami
		throw new UnsupportedOperationException();
	}

	public void dodawanie_uzytkownika() {
		// TODO - implement Moderator.dodawanie_uzytkownika
		throw new UnsupportedOperationException();
	}

	public void usuwanie_uzytkownika() {
		// TODO - implement Moderator.usuwanie_uzytkownika
		throw new UnsupportedOperationException();
	}

}