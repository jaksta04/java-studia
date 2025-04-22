import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random gen = new Random();
        int value;
        value = gen.nextInt(10,20);
        int tab[][] = new int[value][value];
        int liczba;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < value; i++)
        {
            for(int k = 0; k < value; k++)
            {
                if(i == k)
                {
                    liczba = gen.nextInt(2) == 0 ? -1 : 1;
                    tab[i][k] = liczba;
                }
                else if(i == value-k-1)
                {
                    liczba = gen.nextInt(2) == 0 ? -1 : 1;
                    tab[i][k] = liczba;
                }
                else
                {
                liczba = gen.nextInt(-20,20);
                tab[i][k] = liczba;}

            }
        }
        for(int i = 0; i < value; i++)
        {
            for(int k = 0; k < value; k++)
            {
                System.out.printf("%4d",tab[i][k]);
            }
            System.out.println("\n");
        }
    }
}