package week3OOP.blok;

import java.util.List;

public class Post {

    private String tytul;
    private String zawartosc;
    private String autor;

    public Post(String tytul, String zawartosc) {
        this.tytul = tytul;
        this.zawartosc = zawartosc;
    }

    public Post(String tytul, String zawartosc, String autor) {
        this.tytul = tytul;
        this.zawartosc = zawartosc;
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getZawartosc() {
        return zawartosc;
    }

    public void setZawartosc(String zawartosc) {
        this.zawartosc = zawartosc;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static void findAll(List<Post> bloks){

        for (Post value: bloks){
            System.out.println(value.getTytul() + " - " + value.getZawartosc() + " | " + value.getAutor());
        }
    }
}
