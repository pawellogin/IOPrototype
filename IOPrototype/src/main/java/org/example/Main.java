package org.example;

import org.example.Enums.Status;
import org.example.Enums.StatusOgloszenia;
import org.example.Enums.TypOgloszenia;
import org.example.Users.Administrator;
import org.example.Users.Moderator;
import org.example.Users.Pracodawca;
import org.example.Users.Pracownik;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

import static org.example.DummyDataGenerator.*;

public class Main {

    public static void main(String[] args){

        List<Pracownik> pracownicy = new ArrayList<>();
        List<Pracodawca> pracodawcy = new ArrayList<>();
        List<Moderator> moderatorzy = new ArrayList<>();
        List<Administrator> administratorzy = new ArrayList<>();

        List<Oglosznenie> ogloszenia = new ArrayList<>();




        add_test_pracownicy(pracownicy);
        add_test_pracodawcy(pracodawcy);
        add_test_moderatorzy(moderatorzy);
        add_test_adminstratorzy(administratorzy);

        // add oglosznia

        generate_ogloszenia_by_pracodawca(pracodawcy.getFirst(), ogloszenia);
        generate_ogloszenia_by_pracownik(pracownicy.get(1), ogloszenia);


        // deactivate user
        pracodawcy.getFirst().setStatus(Status.nieaktywnyj);
        // try to ad ogloszanie by deactivated user
        generate_ogloszenia_by_pracodawca(pracodawcy.getFirst(), ogloszenia);
        // activate once again
        pracodawcy.getFirst().setStatus(Status.aktywnyj);




        // sort ogloszenie to only get the ones of type "szukam_wykonawcy"
        List<Oglosznenie> filteredOgloszenia = ogloszenia.stream()
                .filter(o -> o.getTyp_ogloszenia() == TypOgloszenia.szukam_wykonawcy)
                .collect(Collectors.toList());

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Only ogloszenia of type 'szukam_wykonawcy'filteredOgloszenia: " +filteredOgloszenia );

        // change the status of webUzytkownik Administator and Moderator

        administratorzy.getFirst().zmiana_statusu_uzytkownikow(pracownicy.getFirst(), Status.nieaktywnyj);

        System.out.println("Status of pracownik after being changed by admin : "+pracownicy.getFirst().getStatus());

        moderatorzy.getFirst().zmiana_statusu_uzytkownikow(pracownicy.getFirst(), Status.zablokowany);

        System.out.println("Status of pracownik after being changed by moderator : "+pracownicy.getFirst().getStatus());

        moderatorzy.getFirst().zmiana_statusu_uzytkownikow(pracownicy.getFirst(), Status.aktywnyj);



        // change the status of ogloszenie my administator and moderator

        administratorzy.getFirst().zmiana_statusu_ogloszen(ogloszenia.getFirst(), StatusOgloszenia.nieaktywne);

        System.out.println(
                "Status of ogloszenie after being changed by admin : " + ogloszenia.getFirst().getStatusOgloszenia()
        );

        moderatorzy.getFirst().zmiana_statusu_ogloszen(ogloszenia.getFirst(), StatusOgloszenia.zajete);

        System.out.println(
                "Status of ogloszenie after being changed by moderator : " + ogloszenia.getFirst().getStatusOgloszenia()
        );

        moderatorzy.getFirst().zmiana_statusu_ogloszen(ogloszenia.getFirst(), StatusOgloszenia.aktywne);

        // rate the users

        pracodawcy.getFirst().ocenUzytkownika(pracownicy.getFirst(),4,
                "Praca hydraulkik",
                "dobry hydraulik"
        );

        pracodawcy.getFirst().ocenUzytkownika(pracownicy.getFirst(),5,
                "Praca elektryk",
                "super elektryk"
        );

        // wypisz srednia ocena dla oceniionego

        System.out.println(
                "Srednia ocena dla " +pracownicy.getFirst().getId()+" "+ pracownicy.getFirst().getSredniaOcen()
        );

    }


}

