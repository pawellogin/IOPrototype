package org.example;

import org.example.Enums.Status;
import org.example.Enums.TypOgloszenia;
import org.example.Users.Administrator;
import org.example.Users.Moderator;
import org.example.Users.Pracodawca;
import org.example.Users.Pracownik;

import java.util.Collections;
import java.util.List;

import static org.example.Enums.Kategoria.elektryka;
import static org.example.Enums.Kategoria.hydraulika;

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

    public static void add_test_pracodawcy(List<Pracodawca> list){
        Pracodawca pracodawca = new Pracodawca(
                "login",
                "password",
                "Jan",
                "Kowalski",
                "jan.kowalski@example.com",
                "123456789",
                "12345678901",
                "Sp. z o.o",
                "65432109874543210981654321",
                "opis pracodawcy"
        );
        list.add(pracodawca);

        pracodawca = new Pracodawca(
                "new_login",
                "new_password",
                "Adam",
                "Nowak",
                "adam.nowak@example.com",
                "987654321",
                "10987654321",
                "New Company Ltd.",
                "12345678901234567890123456",
                "New employer description"
        );
        list.add(pracodawca);
    }

    public static void add_test_moderatorzy(List<Moderator> list){
        Moderator moderator = new Moderator(
                "login",
                "password",
                "Jan",
                "Kowalski",
                "jan.kowalski@example.com",
                "123456789"
        );

        list.add(moderator);

        moderator = new Moderator(
                "new_login",
                "new_password",
                "Adam",
                "Nowak",
                "adam.nowak@example.com",
                "987654321"
        );


        list.add(moderator);

    }

    public static void add_test_adminstratorzy(List<Administrator> list){
        Administrator administrator = new Administrator(
                "login",
                "password",
                "Jan",
                "Kowalski",
                "jan.kowalski@example.com",
                "123456789"
        );

        list.add(administrator);

        administrator = new Administrator(
                "new_login",
                "new_password",
                "Adam",
                "Nowak",
                "adam.nowak@example.com",
                "987654321"
        );


        list.add(administrator);

    }


    public static void generate_ogloszenia_by_pracodawca(Pracodawca pracodawca, List<Oglosznenie> ogloszenia){
        if(pracodawca.getStatus() == Status.nieaktywnyj) {
            System.out.println("UŻYTKOWNIK NIE JEST AKTYWNY!!! : id = "+pracodawca.getId());
        }

        Oglosznenie oglosznenie = new Oglosznenie(
                "Potrzebny elektryk",
                "Potrzebuję ekeltryka do naprawy gniazdka",
                TypOgloszenia.szukam_wykonawcy,
                Collections.singletonList(elektryka),
                pracodawca.getId()
        );

        ogloszenia.add(oglosznenie);

        oglosznenie = new Oglosznenie(
                "Potrzebny hydraulik",
                "Potrzebuję hydraulka do naprawy kranu ",
                TypOgloszenia.szukam_wykonawcy,
                Collections.singletonList(hydraulika),
                pracodawca.getId()
        );

        ogloszenia.add(oglosznenie);

    }

    public static void generate_ogloszenia_by_pracownik(Pracownik pracownik, List<Oglosznenie> ogloszenia){
        if(pracownik.getStatus() == Status.nieaktywnyj) {
            System.out.println("UŻYTKOWNIK NIE JEST AKTYWNY!!! : id = " + pracownik.getId());
        }

        Oglosznenie oglosznenie = new Oglosznenie(
                "Szukam pracy jako elektryk",
                "Jestem dobrym elektrym, zajme sie wszystkim",
                TypOgloszenia.szukam_pracy,
                Collections.singletonList(elektryka),
                pracownik.getId()
        );

        ogloszenia.add(oglosznenie);

        oglosznenie = new Oglosznenie(
                "Szukam pracy jako hydraulik",
                "Jestem dobrym hydraulikiem, zajme sie wszystkim",
                TypOgloszenia.szukam_pracy,
                Collections.singletonList(hydraulika),
                pracownik.getId()
        );

        ogloszenia.add(oglosznenie);

    }


}
