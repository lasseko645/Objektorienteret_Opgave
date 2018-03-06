package com.ushulabubko645.brugerklasser;

public abstract class SystemPersonUndefined {

    //alle bruger skal have disse data til rådighed lige meget hvilken type af bruger de er
    private String userName;
    private String password;
    private String userid /*dette bliver CPR NR.*/;

    //denne variable skal bruges i all supklasserne men den bliver defineret i disse klasser
    private int adminAdgangsEvne;


}
