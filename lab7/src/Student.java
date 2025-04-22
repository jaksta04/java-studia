import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Obecnosc> obecnosci;
    public Student(String imie, String nazwisko, String email)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.obecnosci = new ArrayList<>();
    }
    public String getImie()
    {
        return imie;
    }
    public void setImie(String imie)
    {
        this.imie = imie;
    }
    public String getNazwisko()
    {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return email;
    }
    public void dodajObecnosc(Obecnosc ob)
    {
        obecnosci.add(ob);
    }
    public ArrayList<Obecnosc> z()
    {
        return obecnosci;
    }
    public void show(ArrayList<Obecnosc> obecnosci)
    {
        for(Obecnosc ob : obecnosci)
        {
            System.out.println(ob.toString());
        }
    }
    public void czy_zawsze_obecny(ArrayList<Obecnosc> obecnosci)
    {
        ArrayList<String> przedmioty = new ArrayList<>();
        boolean zawsze_obecny = true;
        for(Obecnosc ob : obecnosci)
        {
            if(przedmioty.contains(ob.przedmiot))
            {
                continue;
            }
            else przedmioty.add(ob.przedmiot);
        }
        for(String przedmiot : przedmioty)
        {
            if(pr)
        }

    }


    public static void main(String[] args)
    {
        String imie,nazwisko,email;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imie studenta: ");
        imie = scan.nextLine();
        System.out.println("Podaj nazwisko: ");
        nazwisko = scan.nextLine();
        System.out.println("Podaj email: ");
        email = scan.nextLine();
        Student student1 = new Student(imie, nazwisko, email);

        Obecnosc obecnosc1 = new Obecnosc("26/11/2024","Matematyka","nu");
        Obecnosc obecnosc2 = new Obecnosc("18/10/2024","Historia","o");


        student1.dodajObecnosc(obecnosc1);
        student1.dodajObecnosc(obecnosc2);

        student1.show(student1.z());


    }




}
