package org.example.Users;

import org.example.Abstracts.WebUzytkownik;
import org.example.Enums.TypOgloszenia;
import org.example.Oglosznenie;

import java.util.Collections;
import java.util.List;

import static org.example.Enums.Kategoria.elektryka;

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

	public void stworzenia_ogloszenia(List<Oglosznenie> ogloszenia) {

		Oglosznenie oglosznenie = new Oglosznenie(
				"Potrzebny elektryk",
				"Potrzebuję ekeltryka do naprawy gniazdka",
				TypOgloszenia.szukam_wykonawcy,
				Collections.singletonList(elektryka),
				this.getId()
		);

		ogloszenia.add(oglosznenie);
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

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getNumer_telefona() {
		return numer_telefona;
	}

	public void setNumer_telefona(String numer_telefona) {
		this.numer_telefona = numer_telefona;
	}

	public String getOrganizacja() {
		return organizacja;
	}

	public void setOrganizacja(String organizacja) {
		this.organizacja = organizacja;
	}

	public String getNumer_konta() {
		return numer_konta;
	}

	public void setNumer_konta(String numer_konta) {
		this.numer_konta = numer_konta;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Boolean getSubskrypcja_profilu() {
		return subskrypcja_profilu;
	}

	public void setSubskrypcja_profilu(Boolean subskrypcja_profilu) {
		this.subskrypcja_profilu = subskrypcja_profilu;
	}
}