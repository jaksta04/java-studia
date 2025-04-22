public class Main {
    public static void main(String[] args) {
        zad4 z = new zad4();
        String tekst = z.z1();
        System.out.println(z.z2(tekst));
        System.out.println(z.z3(z.z2(tekst)));
        System.out.println(z.z4(tekst));

    }
}