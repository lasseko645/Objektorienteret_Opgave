package com.ushulabubko645;

public class Kursus {

    private String kursusNavn ;
    private KursusType kursustype ;
    private Afslutning afslutning;
    private Afslutningstype afslutningstype;
    private String underviser;
    private String lokale;
    private Tidsplan tidsplan;

    public Kursus(String kursusNavn, KursusType kursustype, Afslutning afslutning, Afslutningstype afslutningstype, String underviser, String lokale, Tidsplan tidsplan) {
        this.kursusNavn = kursusNavn;
        this.kursustype = kursustype;
        this.afslutning = afslutning;
        this.afslutningstype = afslutningstype;
        this.underviser = underviser;
        this.lokale = lokale;
        this.tidsplan = tidsplan;
    }




}
