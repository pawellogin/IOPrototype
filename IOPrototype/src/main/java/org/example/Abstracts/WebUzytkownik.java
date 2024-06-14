package org.example.Abstracts;

import org.example.Enums.Status;
import org.example.Ocena;
import org.example.Oglosznenie;

import java.util.ArrayList;
import java.util.List;

public abstract class WebUzytkownik {

	private static int idCounter = 0;
	private String id;
	private String login;
	private String password;
	private org.example.Enums.Status Status;
	private List<Oglosznenie> ulubione_ogloszenia;
	private List<Ocena> oceny;

	public WebUzytkownik(String login, String password){
		this.login = login;
		this.id = generateId();
		this.password = password;
		this.Status = org.example.Enums.Status.aktywnyj;
		this.oceny = new ArrayList<>();
	}


	private synchronized String generateId() {
		return String.format("%06d", ++idCounter);
	}

	public void ocenUzytkownika(WebUzytkownik webUzytkownik, int ocena, String tytulOceny, String opisOceny){
		Ocena nowaOcena = new Ocena(ocena, tytulOceny, opisOceny);

		webUzytkownik.getOceny().add(nowaOcena);
	}

	public double getSredniaOcen(){
		double sumaOcen = 0;

		for(int i = 0; i < oceny.size(); i++) {
			sumaOcen += oceny.get(i).getOcena();
		}

		return sumaOcen/oceny.size();
	}

	public void zarejestruj_sie() {
		// TODO - implement WebUzytkownik.zarejestruj_sie
		throw new UnsupportedOperationException();
	}

	public void zaloguj_sie() {
		// TODO - implement WebUzytkownik.zaloguj_sie
		throw new UnsupportedOperationException();
	}

	public void zapomnialem_haslo() {
		// TODO - implement WebUzytkownik.zapomnialem_haslo
		throw new UnsupportedOperationException();
	}

	public static int getIdCounter() {
		return idCounter;
	}

	public String getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public org.example.Enums.Status getStatus() {
		return Status;
	}

	public static void setIdCounter(int idCounter) {
		WebUzytkownik.idCounter = idCounter;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setStatus(org.example.Enums.Status status) {
		Status = status;
	}

	public List<Ocena> getOceny() {
		return oceny;
	}

	public void setOceny(List<Ocena> oceny) {
		this.oceny = oceny;
	}

	public List<Oglosznenie> getUlubione_ogloszenia() {
		return ulubione_ogloszenia;
	}


	public void add_ogloszenie_to_ulubione(Oglosznenie oglosznenie){
		this.ulubione_ogloszenia.add(oglosznenie);
	}
}