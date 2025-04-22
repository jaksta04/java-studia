
import java.util.ArrayList;
import java.util.HashSet;

public class Student {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Obecnosc> obecnosci;

    public boolean czy_poprawne_imie(String imie)
    {
        if(imie.matches(".*\\d.*"))
        {
            return false;
        }
        else if(imie.length() <= 2 && imie.length() > 15)
        {
            return false;
        } else if (Character.isLowerCase(imie.charAt(0)))
        {
            return false;
        } else return true;
    }

    public Student(String imie, String nazwisko, String email)
    {
        if(czy_poprawne_imie(imie) == true)
        {
            this.imie = imie;
        }else {
            System.out.println("Imie bledne");
        }
        this.nazwisko = nazwisko;
        this.email = email;

        this.obecnosci = new ArrayList<>();
    }
    public String getImie()
    {
        return imie;
    }
    public String getNazwisko()
    {
        return nazwisko;
    }
    public String getEmail()
    {
        return email;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void dodaj_obecnosc(Obecnosc obecnosc)
    {
        obecnosci.add(obecnosc);
    }

    public String toString()
    {
        for(Obecnosc obecnosc : obecnosci)
        {
            System.out.println("Obecnosc: Przedmiot: " + obecnosc.getPrzedmiot()+" Data: "+obecnosc.getData_godzina()+" typ obecnosci: "+ obecnosc.getTyp_obecnosci());
        }
        return imie + " " + nazwisko + " " + email + " " +"ilosc obecnosci: "+ obecnosci.size();
    }

    public void zawsze_obecny()
    {
        ArrayList<String> zawsze_obecny = new ArrayList<>();

        for(Obecnosc obecnosc : obecnosci)
        {
            if(obecnosc.getTyp_obecnosci() == "o")
            {
                zawsze_obecny.add(obecnosc.getPrzedmiot());
            }
        }

        HashSet<String> zbior = new HashSet<>(zawsze_obecny);


        for(String element : zbior)
        {
            System.out.println(element);
        }

    }




}
