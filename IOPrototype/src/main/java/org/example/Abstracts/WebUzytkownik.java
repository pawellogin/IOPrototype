package org.example.Abstracts;

import org.example.Enums.Status;

public abstract class WebUzytkownik {

	private static int idCounter = 0;
	private String id;
	private String login;
	private String password;
	private org.example.Enums.Status Status;

	public WebUzytkownik(String login, String password){
		this.login = login;
		this.password = password;
		this.Status = org.example.Enums.Status.nieaktywnyj;
	}


	private synchronized String generateId() {
		return String.format("%06d", ++idCounter);
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

}