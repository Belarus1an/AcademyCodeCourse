package week3OOP;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String imie;
    private String nazwisko;
    private int pensja;
    private int  wiek;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {

        if (imie.length() >= 5 && imie.charAt(0) != imie.toUpperCase().charAt(0)){
            System.out.println("Nie");
        } else
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

}
