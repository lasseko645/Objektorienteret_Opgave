package com.ushulabubko645.kursusklasser;

public class Kursus {

    private String kursusNavn ;
    private KursusType kursustype ;
    private Afslutning afslutning;
    private Afslutningstype afslutningstype;
    private String underviser;
    private String lokale;
    private Tidsplan tidsplan;
    private int maxAntalStuderende;
    private int nuværendeAntalStuderende;

    public Kursus(String kursusNavn) {
        this.kursusNavn = kursusNavn;
    }

    public String getKursusNavn() {

        if (kursusNavn != null && kursustype != null) {
            return kursusNavn;
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

    public String getLokale() {
        return lokale;
    }

    public void setLokale(String lokale) {
        this.lokale = lokale;
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
