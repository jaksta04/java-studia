public class Ksiazka {
    private String tytul;
    private String autor;
    private int rok_wydania;

    public Ksiazka(String tytul, String autor, int rok_wydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.rok_wydania = rok_wydania;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public int getRok_wydania() {
        return rok_wydania;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setRok_wydania(int rok_wydania) {
        this.rok_wydania = rok_wydania;
    }


}
