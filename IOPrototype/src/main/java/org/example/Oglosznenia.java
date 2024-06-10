package org.example;

import org.example.Enums.StatusOgloszenia;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;
import static org.example.Enums.StatusOgloszenia.aktywne;

public class Oglosznenia {

	private static int idCounter = 0;
	private String id_ogloszenia;
	private String tytul;
	private String opis;
	private LocalDateTime data_waznosci;
	private org.example.Enums.StatusOgloszenia StatusOgloszenia;
	private String typ_ogloszenia;
	private LocalDateTime data_publikacji;


	public Oglosznenia(String tytul,
					   String opis,
					   String typ_ogloszenia
	) {
		this.id_ogloszenia = generateId();
		this.tytul = tytul;
		this.opis = opis;
		this.data_waznosci = now().plusWeeks(1);
		this.StatusOgloszenia = aktywne;
		this.typ_ogloszenia = typ_ogloszenia;
		this.data_publikacji = now();
	}

	private synchronized String generateId() {
		return String.format("%06d", ++idCounter);
	}
}