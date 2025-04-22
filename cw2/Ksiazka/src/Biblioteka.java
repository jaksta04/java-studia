import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Biblioteka {
    private ArrayList<Ksiazka> ksiazki;

    public Biblioteka() {
        ksiazki = new ArrayList<Ksiazka>();
    }

    public void addKsiazka(Ksiazka ksiazka)
    {
        ksiazki.add(ksiazka);
    }

    public void removeBook(String tytul)
    {
        for( Ksiazka ksiazka: ksiazki)
        {
            if(ksiazka.getTytul().equals(tytul))
            {
                ksiazki.remove(ksiazka);
            }
        }
    }

    public void ksiazkiAutora(String autor)
    {
        ArrayList<String> ksiazkiAutora = new ArrayList<>();

        for( Ksiazka ksiazka: ksiazki)
        {
            if(ksiazka.getAutor().equals(autor))
            {
                ksiazkiAutora.add(ksiazka.getTytul());
            }
        }

        for( String ksiazka: ksiazkiAutora)
        {
            System.out.println(ksiazka);
        }
    }
    public void wydaniaKsiazek()
    {
        ArrayList<Integer> daty = new ArrayList<>();

        for( Ksiazka ksiazka: ksiazki)
        {
            daty.add(ksiazka.getRok_wydania());
        }
        Collections.sort(daty);
        HashSet<Integer> zbior = new HashSet<>(daty);

        for(int k : zbior)
        {
            System.out.println(k);
        }
    }

    public void showAll()
    {
        for(Ksiazka ksiazka: ksiazki)
        {
            System.out.println("Tytul: " + ksiazka.getTytul()+ " Autor: " + ksiazka.getAutor() + " Data wydania: "  + ksiazka.getRok_wydania() );
        }
    }


}
