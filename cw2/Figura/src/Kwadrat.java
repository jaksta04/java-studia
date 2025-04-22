public class Kwadrat extends Figura{
    private String name;
    private int a;

    public Kwadrat(int pole, int kwadrat, int a)
    {
        super(pole, kwadrat);
        this.name = "Kwadrat";
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
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
        System.out.println("Kwadrat o boku: " + a);
    }
}
