import java.awt.*;

public class Elipsa extends Figura{
    private int a;
    private int b;
    private int F1x;
    private int F1y;
    private int F2x;
    private int F2y;
    private double c;

    public Elipsa(int pole, int obwod, Color color,int a, int b, int F1x, int F1y, int F2x, int F2y)
    {
        super(pole, obwod, color);
        this.a = a;
        this.b = b;
        this.F1x = F1x;
        this.F1y = F1y;
        this.F2x = F2x;
        this.F2y = F2y;

    }
    public double obliczajaca()
    {
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        return c;
    }


    @Override
    protected void rysuj() {
        super.rysuj();
    }
    @Override
    protected void usun()
    {
        super.usun();
    }
}
