package org.example;

public class Ocena {

	private static int idCounter = 0;
	private String id_oceny;
	private int Ocena;
	private String Tytul;
	private String Opis;

	public Ocena(int ocena, String tytul, String opis) {
		if(ocena > 5 || ocena < 0 ) {
			throw new IllegalArgumentException("Ocena need to be between 0-5");
		}
		this.Ocena = ocena;
		id_oceny = generateId();
		Tytul = tytul;
		Opis = opis;
	}
	private synchronized String generateId() {
		return String.format("%06d", ++idCounter);
	}

	public int getOcena() {
		return Ocena;
	}

	public void setOcena(int ocena) {
		Ocena = ocena;
	}

	public String getTytul() {
		return Tytul;
	}

	public void setTytul(String tytul) {
		Tytul = tytul;
	}

	public String getOpis() {
		return Opis;
	}

	public void setOpis(String opis) {
		Opis = opis;
	}
}