
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Zad2 {

    public static void sortowanie(ArrayList<Integer> liczby)
    {
        Collections.sort(liczby , new Comparator<Integer>()
        {
            public int compare(Integer a, Integer b)
            {
                return a - b;
            }

        });
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> liczby = new ArrayList();
        int n;
        System.out.println("Ile liczb mam dodac? ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for(int i = 0; i < n; i++)
        {
            System.out.println("Podaj liczbe: ");
            liczby.add(scan.nextInt());
        }

        sortowanie(liczby);
        liczby.forEach(liczba -> System.out.println(liczba));

    }

}
