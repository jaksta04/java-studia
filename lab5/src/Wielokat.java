import java.awt.*;

public class Wielokat extends Figura{
    private int wierzcholki;
    private int boki;
    private int suma_kat;
    public Wielokat(int wierzcholki, int boki, int suma_kat)
    {
        super(3,5,Color.GREEN);
        this.wierzcholki = wierzcholki;
        this.boki = boki;
        this.suma_kat = suma_kat;
    }
    public Wielokat(){}

    public int getWierzcholki() {
        return wierzcholki;
    }
    public void setWierzcholki(int wierzcholki)
    {
        this.wierzcholki = wierzcholki;
    }
    public int getBoki()
    {
        return boki;
    }
    public void setBoki(int boki)
    {
        this.boki = boki;
    }

    public int getSuma_kat() {
        return suma_kat;
    }

    public void setSuma_kat(int suma_kat) {
        this.suma_kat = suma_kat;
    }

    public void obliczajaca()
    {
        suma_kat = (boki -2)*180;
    }
}
