import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args)
    {
        System.out.println("n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int tab[] = new int[n];
        int value;
        for(int i = 0; i < n; i++)
        {
            System.out.println("value: ");
            value = scan.nextInt();
            tab[i] = value;
        }
        int max;
        int min;
        int sum;
        max = tab[0];
        min = tab[0];
        sum = tab[0];
        for(int i = 1; i < n; i++)
        {
            if(tab[i] > max)
            {
                max = tab[i];
            }
            else if (tab[i] < min)
            {
                min = tab[i];
            }
            sum += tab[i];
        }

        System.out.println("Max: " + max+"\n");
        System.out.println("Min: " + min+"\n");
        System.out.println("Sum: " + sum+"\n");
    }
}
