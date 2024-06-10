package org.example;

import java.time.LocalDateTime;

public class Oglosznenia {


	private String id_ogloszenia;
	private String tytul;
	private String opis;
	private LocalDateTime data_waznosci;
	private int StatusOgloszenia;
	private String typ_ogloszenia;
	private LocalDateTime data_publikacji;


	public Oglosznenia(String id_ogloszenia,
					   String tytul,
					   String opis,
					   LocalDateTime data_waznosci,
					   int statusOgloszenia,
					   String typ_ogloszenia,
					   LocalDateTime data_publikacji
	) {
		this.id_ogloszenia = id_ogloszenia;
		this.tytul = tytul;
		this.opis = opis;
		this.data_waznosci = data_waznosci;
		StatusOgloszenia = statusOgloszenia;
		this.typ_ogloszenia = typ_ogloszenia;
		this.data_publikacji = data_publikacji;
	}
}