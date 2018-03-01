package com.ushulabubko645;

import com.ushulabubko645.kursusklasser.*;

public class MainTest {

    public static void main(String[] args) {

        //en lille hilsen til brugeren når programmet launcher
        System.out.println("-------------------------------------------------------------------" +
                "\n welkommen til systemet, lortet virker stadig." +
                "\n-------------------------------------------------------------------");

        // jeg laver nu et par kurser som man kan gøre brug af
        Kursus parkour = new Kursus("Parkour Studie");
        parkour.setKursustype(KursusType.fusiske_kursus);
        parkour.setAfslutning(Afslutning.ingen_afslutning);
        parkour.setAfslutningstype(Afslutningstype.ingen_prøve);
        parkour.setLokale("104 og udenfor");
        parkour.setMaxAntalStuderende(20);
        parkour.setTidsplan(Tidsplan.mandag_08_30_til_12_40);

        System.out.println("kurser i systemet so far: " + "\n"
                            + parkour.getKursusNavn());
    }

}
