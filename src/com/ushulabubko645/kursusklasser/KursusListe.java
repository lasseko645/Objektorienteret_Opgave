package com.ushulabubko645.kursusklasser;

import java.util.ArrayList;

public class KursusListe {

    //jeg adder en arrayliste til at holde på data fra kususerne som er i systemet
    public static ArrayList<Kursus> kursusListe = new ArrayList<Kursus>();

    //jeg adder her en metode som skal kunne automatisk kaste data ind i mit array når den bliver kaldt
    public static void add(Kursus k) {
        kursusListe.add(k);
    }

    public static ArrayList<Kursus> getKursusListe() {

        return kursusListe;

    }

}
