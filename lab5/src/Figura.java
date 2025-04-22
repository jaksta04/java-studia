import java.awt.*;

public class Figura {
    protected int pole;
    protected int obowd;
    private Color color;
    public static void main(String[] args)
    {

    }
    public Figura(){}
    public Figura(int pole, int obowd, Color color) {
        this.pole = pole;
        this.obowd = obowd;
        this.color = color;
    }
    protected void rysuj()
    {}
    protected void usun(){}
    protected void przeusn(){}
    protected String podajParametry(){return null;}
    public int getPole()
    {
        return pole;
    }
    public void setPole(int pole)
    {
        this.pole = pole;
    }
    public int getObwod()
    {
        return obowd;
    }
    public void setObwod(int obowd)
    {
        this.obowd = obowd;
    }
    public void setColor(Color color)
    {
        this.color = color;
    }
    void wypisz()
    {
        System.out.println("Pole: " + pole);
        System.out.println("Obowd: " + obowd);
        System.out.println("Color: " + color);
    }
}
