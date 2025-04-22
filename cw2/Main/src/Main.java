public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ga","lebek","rwqw@wp.pl");

        Obecnosc ob1 = new Obecnosc("08.12.2024","Fizyka","o");
        Obecnosc ob3 = new Obecnosc("05.05.2023","Rosyjski","o");
        Obecnosc ob4 = new Obecnosc("14.09.2021","Polski","o");
        Obecnosc ob5 = new Obecnosc("13.09.2022","Fizyka","n");


        student1.dodaj_obecnosc(ob3);
        student1.dodaj_obecnosc(ob4);
        student1.dodaj_obecnosc(ob5);
        student1.dodaj_obecnosc(ob1);

        Obecnosc ob2 = new Obecnosc("06.11.2024","Bilogia","nu");

        student1.dodaj_obecnosc(ob2);

        System.out.println(student1.toString());

        student1.zawsze_obecny();
    }
}