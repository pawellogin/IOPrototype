package org.example;

import org.example.Enums.Kategoria;
import org.example.Enums.StatusOgloszenia;
import org.example.Enums.TypOgloszenia;

import java.time.LocalDateTime;
import java.util.List;

import static java.time.LocalDateTime.now;
import static org.example.Enums.StatusOgloszenia.aktywne;

public class Oglosznenia {

	private static int idCounter = 0;
	private String id_ogloszenia;
	private String tytul;
	private String opis;
	private LocalDateTime data_waznosci;
	private org.example.Enums.StatusOgloszenia StatusOgloszenia;
	private TypOgloszenia typ_ogloszenia;
	private LocalDateTime data_publikacji;
	private List<Kategoria> kategorie;
	private String id_uzytkownika;


	public Oglosznenia(String tytul,
					   String opis,
					   TypOgloszenia typ_ogloszenia,
					   List<Kategoria> kategorie,
					   String id_uzytkownika

	) {
		this.id_ogloszenia = generateId();
		this.tytul = tytul;
		this.opis = opis;
		this.data_waznosci = now().plusWeeks(1);
		this.StatusOgloszenia = aktywne;
		this.typ_ogloszenia = typ_ogloszenia;
		this.kategorie = kategorie;
		this.data_publikacji = now();
		this.id_uzytkownika = id_uzytkownika;
	}

	private synchronized String generateId() {
		return String.format("%06d", ++idCounter);
	}
}