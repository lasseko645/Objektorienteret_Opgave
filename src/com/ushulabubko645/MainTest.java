package com.ushulabubko645;

import com.ushulabubko645.kursusklasser.*;

public class MainTest {

    public static void main(String[] args) {

        //en lille hilsen til brugeren når programmet launcher
        System.out.println("-------------------------------------------------------------------" +
                "\n welkommen til systemet, lortet virker stadig." +
                "\n-------------------------------------------------------------------");

        //med en inspiration fra andres opgave har jeg valgt at lave et par lokaler efter at jeg har redesignet måden jeg lavede lokaler i mit system på.
        Lokale na104 = new Lokale("Næstved", 104);
        Lokale na208 = new Lokale("Næstved", 208);

        // jeg laver nu et par kurser som man kan gøre brug af
        Kursus parkour = new Kursus("Parkour Studie");
        parkour.setKursustype(KursusType.fusiske_kursus);
        parkour.setAfslutning(Afslutning.ingen_afslutning);
        parkour.setAfslutningstype(Afslutningstype.ingen_prøve);
        parkour.setLokale(na104);
        parkour.setMaxAntalStuderende(20);
        parkour.setTidsplan(Tidsplan.mandag_08_30_til_12_40);

        //for the sake of testing i will make a couple of courses
        Kursus dansk = new Kursus("Dansk b-niveau");
        dansk.setKursustype(KursusType.boligt_kursus);
        dansk.setAfslutning(Afslutning.externt_oprettet_afslutningsresultat);
        dansk.setAfslutningstype(Afslutningstype.muntlig_prøve_og_skriftlig_prøve);
        dansk.setLokale(na208);
        dansk.setMaxAntalStuderende(24);
        dansk.setTidsplan(Tidsplan.onsdag_13_10_til_16_00);

        //det sidste test kursus
        Kursus billedekunstskab = new Kursus("BilledeKunstSkab");
        billedekunstskab.setKursustype(KursusType.værksteds_kursus);
        billedekunstskab.setAfslutning(Afslutning.ungdomskole_register_afslutning);
        billedekunstskab.setAfslutningstype(Afslutningstype.muntlig_prøve);
        billedekunstskab.setLokale(na104);
        billedekunstskab.setMaxAntalStuderende(15);
        billedekunstskab.setTidsplan(Tidsplan.tirsdag_08_30_til_12_40);




//det her er udelukkende en test, denne besked ville være til brug eventually for når man prøver at oprette et kursus eller for at se alle de kurser som der existere
        System.out.println("der er " + KursusListe.kursusListe.size() + " kurser i systemet so far: " + "\n"
                            + parkour.getKursusNavn() + "\n"
                            + dansk.getKursusNavn() + "\n"
                            + billedekunstskab.getKursusNavn());
    }

}
