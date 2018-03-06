package com.ushulabubko645.kursusklasser;

public class Lokale {

    private String navn;
    private int number;

    public Lokale(String navn, int nummer) {
        this.navn = navn;
        this.number = nummer;

    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
