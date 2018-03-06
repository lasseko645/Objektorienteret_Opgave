package com.ushulabubko645.kursusklasser;

public class Kursus {

    private String kursusNavn ;
    private KursusType kursustype ;
    private Afslutning afslutning;
    private Afslutningstype afslutningstype;
    private String underviser;
    private Lokale lokale;
    private Tidsplan tidsplan;
    private int maxAntalStuderende;
    private int nuværendeAntalStuderende;

    public Kursus(String kursusNavn) {
        this.kursusNavn = kursusNavn;
        // jeg gør her brug af min metode til at automatist gemme den data som bliver skrevet ind, i mit array
        KursusListe.add(this);
    }

    public String getKursusNavn() {

        String error = "der er felj";

        if (kursusNavn != null && kursustype != null) {
            return kursusNavn;
        } else {
            return error;
        }
    }

    public void setKursusNavn(String kursusNavn) {
        this.kursusNavn = kursusNavn;
    }

    public KursusType getKursustype() {
        return kursustype;
    }

    public void setKursustype(KursusType kursustype) {
        this.kursustype = kursustype;
    }

    public Afslutning getAfslutning() {
        return afslutning;
    }

    public Lokale getLokale() {
        return lokale;
    }

    public void setLokale(Lokale lokale) {
        this.lokale = lokale;
    }

    public void setAfslutning(Afslutning afslutning) {
        this.afslutning = afslutning;
    }

    public Afslutningstype getAfslutningstype() {
        return afslutningstype;
    }

    public void setAfslutningstype(Afslutningstype afslutningstype) {
        this.afslutningstype = afslutningstype;
    }

    public String getUnderviser() {
        return underviser;
    }

    public void setUnderviser(String underviser) {
        this.underviser = underviser;
    }

    public Tidsplan getTidsplan() {
        return tidsplan;
    }

    public void setTidsplan(Tidsplan tidsplan) {
        this.tidsplan = tidsplan;
    }

    public int getMaxAntalStuderende() {
        return maxAntalStuderende;
    }

    public void setMaxAntalStuderende(int maxAntalStuderende) {
        this.maxAntalStuderende = maxAntalStuderende;
    }

    public int getNuværendeAntalStuderende() {
        return nuværendeAntalStuderende;
    }

    public void setNuværendeAntalStuderende(int nuværendeAntalStuderende) {
        this.nuværendeAntalStuderende = nuværendeAntalStuderende;
    }
}
