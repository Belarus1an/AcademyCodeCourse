package week3OOP;

import java.util.List;

public class Firma {

    private String nazwa;
    private String siedziba;
    private int liczbaPracownikow;
    private List<Worker> work;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getSiedziba() {
        return siedziba;
    }

    public void setSiedziba(String siedziba) {
        this.siedziba = siedziba;
    }

    public int getLiczbaPracownikow() {
        return liczbaPracownikow;
    }

    public void setLiczbaPracownikow(int liczbaPracownikow) {
        this.liczbaPracownikow = liczbaPracownikow;
    }

    public List<Worker> getWork() {
        return work;
    }

    public void setWork(List<Worker> work) {
        this.work = work;
    }
}
