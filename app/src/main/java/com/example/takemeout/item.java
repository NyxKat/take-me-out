package com.example.takemeout;

public class item {
    int background;
    String TitlosMagaziou;
    String OdosMagaziou;

    public item(){

    }

    public item(int background, String titlosMagaziou, String odosMagaziou) {
        this.background = background;
        TitlosMagaziou = titlosMagaziou;
        OdosMagaziou = odosMagaziou;
    }

    public int getBackground() {
        return background;
    }

    public String getTitlosMagaziou() {
        return TitlosMagaziou;
    }

    public String getOdosMagaziou() {
        return OdosMagaziou;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setTitlosMagaziou(String titlosMagaziou) {
        TitlosMagaziou = titlosMagaziou;
    }

    public void setOdosMagaziou(String odosMagaziou) {
        OdosMagaziou = odosMagaziou;
    }
}
