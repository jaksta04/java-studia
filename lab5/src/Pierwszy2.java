public class Pierwszy2 implements Pierwszy{
    @Override
    public void pustaMetoda() {
        System.out.println("Pierwszy2 pusta metoda");
    }
    public static void main(String[] args)
    {
        Pierwszy2 p = new Pierwszy2();
        p.pustaMetoda();
    }
}
