import java.util.Scanner;

public class zad2
{
    public void main() {
        int liczba = 1;
        Scanner scan = new Scanner(System.in);
        int n=0;
        int sum=0;
        int iloczyn=1;
        while (liczba != 0)
        {
            System.out.println("Liczba: ");
            liczba = scan.nextInt();
            if(liczba != 0) {
                n++;
                sum += liczba;
                iloczyn = iloczyn * liczba;
            }
        }
        System.out.println("Ilosc liczb: "+n);
        System.out.println("Suma: "+sum);
        System.out.println("Iloczyn: "+iloczyn);
    }
}
