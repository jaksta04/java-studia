import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class zad3 {
    public void main()
    {
        int liczba=1;
        int n=0;
        int sum=0;
        int iloczyn=1;
        ArrayList<Integer> lista = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        while(Math.abs(sum) < 250 && Math.abs(iloczyn) < 3000000)
        {
            System.out.println("liczba: ");
            liczba=scan.nextInt();
            if(Math.abs(sum) < 250 && Math.abs(iloczyn) < 3000000) {
                lista.add(liczba);
                n++;
                sum += liczba;
                iloczyn *= liczba;
            }
        }
        Collections.sort(lista);
        for(Integer i : lista)
        {
            System.out.println(i);
        }
    }
}
