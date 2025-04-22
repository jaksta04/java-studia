public class Owoc {
    String nazwa;
    String kolor;
    double masa;
    String krajPochodzenia;
    public Owoc(){}
    public Owoc(String nazwa, String krajPochodzenia)
    {
        this.nazwa=nazwa;
        this.krajPochodzenia=krajPochodzenia;
    }
    public void podajMase(double masa)
    {
        this.masa=masa;
    }
}
