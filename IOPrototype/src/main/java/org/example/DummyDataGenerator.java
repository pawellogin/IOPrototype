package org.example;

import org.example.Users.Pracownik;

import java.util.List;

public class DummyDataGenerator {
    public static void add_test_pracownicy(List<Pracownik> list){
        Pracownik pracownik = new Pracownik(
                "login",
                "password",
                "Jan",
                "Kowalski",
                "jan.kowalski@example.com",
                "123456789",
                "12345678901",
                "12345678901234567890123456",
                "Opis pracownika"
        );

        list.add(pracownik);

        pracownik = new Pracownik(
                "new_login",
                "new_password",
                "Adam",
                "Nowak",
                "adam.nowak@example.com",
                "987654321",
                "10987654321",
                "65432109876543210987654321",
                "New employee description"
        );

        list.add(pracownik);

    }
}
