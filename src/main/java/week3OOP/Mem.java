package week3OOP;

public class Mem {

    private String nazwa;
    private String url;
    private String opis;
    private boolean like;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if (url.startsWith("www.")){
            this.url = url;
        } else
            setOpis("Nie");

    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public boolean getLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }
}
