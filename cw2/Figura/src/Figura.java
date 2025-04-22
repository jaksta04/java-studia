public class Figura {
    private String name;
    private int pole;
    private int obwod;

    public Figura(int pole, int obwod)
    {
        this.name = "Figura";
        this.pole = pole;
        this.obwod = obwod;
    }
    public Figura(){}

    public int getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public int getObwod() {
        return obwod;
    }

    public void setObwod(int obwod) {
        this.obwod = obwod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show()
    {
        System.out.println("Nazwa: " + getName());
        System.out.println("Pole: " + pole);
        System.out.println("Obwod: " + obwod);
    }
}
