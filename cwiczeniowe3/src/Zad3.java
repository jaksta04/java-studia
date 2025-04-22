import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Zad3 {

    public static void sortowanie(ArrayList<String> wyrazy)
    {
        wyrazy.sort((s1,s2)-> Integer.compare(s1.length(),s2.length()));
    }
    public static void main(String[] args)
    {
        ArrayList<String> wyrazy = new ArrayList<>();
        wyrazy.add("Jestem");
        wyrazy.add("Kuba");
        wyrazy.add("mam");
        wyrazy.add("sie");
        wyrazy.add("dobrze");
        wyrazy.add("Pozdrawiam");

        sortowanie(wyrazy);

        for(String i : wyrazy)
        {
            System.out.println(i);
        }
    }
}
