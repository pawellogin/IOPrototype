package org.example;

import org.example.Enums.Kategoria;
import org.example.Enums.StatusOgloszenia;
import org.example.Enums.TypOgloszenia;

import java.time.LocalDateTime;
import java.util.List;

import static java.time.LocalDateTime.now;
import static org.example.Enums.StatusOgloszenia.aktywne;

public class Oglosznenie {

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


	public Oglosznenie(String tytul,
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

	@Override
	public String toString() {
		return "Ogloszenie{" + "\n" +
				"  id_ogloszenia='" + id_ogloszenia + '\'' + "\n" +
				"  tytul='" + tytul + '\'' + "\n" +
				"  opis='" + opis + '\'' + "\n" +
				"  data_waznosci=" + data_waznosci + "\n" +
				"  StatusOgloszenia=" + StatusOgloszenia + "\n" +
				"  typ_ogloszenia=" + typ_ogloszenia + "\n" +
				"  data_publikacji=" + data_publikacji + "\n" +
				"  kategorie=" + kategorie + "\n" +
				"  id_uzytkownika='" + id_uzytkownika + '\'' + "\n" +
				'}';
	}


	public static int getIdCounter() {
		return idCounter;
	}

	public String getId_ogloszenia() {
		return id_ogloszenia;
	}

	public String getTytul() {
		return tytul;
	}

	public String getOpis() {
		return opis;
	}

	public LocalDateTime getData_waznosci() {
		return data_waznosci;
	}

	public org.example.Enums.StatusOgloszenia getStatusOgloszenia() {
		return StatusOgloszenia;
	}

	public TypOgloszenia getTyp_ogloszenia() {
		return typ_ogloszenia;
	}

	public LocalDateTime getData_publikacji() {
		return data_publikacji;
	}

	public List<Kategoria> getKategorie() {
		return kategorie;
	}

	public String getId_uzytkownika() {
		return id_uzytkownika;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public void setData_waznosci(LocalDateTime data_waznosci) {
		this.data_waznosci = data_waznosci;
	}

	public void setStatusOgloszenia(org.example.Enums.StatusOgloszenia statusOgloszenia) {
		StatusOgloszenia = statusOgloszenia;
	}

	public void setTyp_ogloszenia(TypOgloszenia typ_ogloszenia) {
		this.typ_ogloszenia = typ_ogloszenia;
	}

	public void setData_publikacji(LocalDateTime data_publikacji) {
		this.data_publikacji = data_publikacji;
	}

	public void setKategorie(List<Kategoria> kategorie) {
		this.kategorie = kategorie;
	}

	public void setId_uzytkownika(String id_uzytkownika) {
		this.id_uzytkownika = id_uzytkownika;
	}


}