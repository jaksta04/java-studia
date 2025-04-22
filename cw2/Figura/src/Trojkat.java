public class Trojkat extends Figura {
    private String name;
    private int a;
    private int b;
    private int c;

    public boolean czy_da_sie(int a, int b, int c)
    {
        return a + b > c && a + c > b && b + c > a;
    }

    public Trojkat(int pole, int obwod, int a, int b, int c) {
        super(pole, obwod);
        czy_da_sie(a, b, c);
        if(czy_da_sie(a, b, c) == false)
        {
            throw new IllegalArgumentException("i huj");
        }
        this.name = "Trojkat";
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show()
    {
        super.show();
        System.out.println("bok a: " + a);
        System.out.println("bok b: " + b);
        System.out.println("bok c: " + c);
    }
}
