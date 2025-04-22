public class Obecnosc {
    public String data;
    public String przedmiot;
    public String typ_obecnosci;
    public Obecnosc() {}
    public Obecnosc(String data, String przedmiot, String typ_obecnosci)
    {
        this.data = data;
        this.przedmiot = przedmiot;
        this.typ_obecnosci = typ_obecnosci;
    }
    public String toString()
    {
        return "Obecność { data: " + data + ", " +
                "przedmiot: " + przedmiot+ ", typ_obecnosci: " + typ_obecnosci + "}";
    }
}
