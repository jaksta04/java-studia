public class Main {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Balladyna","Słowacki",1845);
        Ksiazka k2 = new Ksiazka("Krzyzacy", "Sienkiewicz",1872);
        Ksiazka k3 = new Ksiazka("rok1984","Orwell",1984);
        Ksiazka k4 = new Ksiazka("Nad niemnem","Orzeszkowa",1870);
        Ksiazka k5 = new Ksiazka("HUj i huj","Słowacki",1234);
        Ksiazka k6 = new Ksiazka("fas","Orwell",1234);

        Biblioteka b1 = new Biblioteka();

        b1.addKsiazka(k1);
        b1.addKsiazka(k2);
        b1.addKsiazka(k3);
        b1.addKsiazka(k4);
        b1.addKsiazka(k5);
        b1.addKsiazka(k6);

        b1.showAll();

        b1.wydaniaKsiazek();
    }
}