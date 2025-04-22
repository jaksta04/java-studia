import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //zad1 obiekt = new zad1();
        //System.out.println(obiekt.napis);

        //Uczen ucz1 = new Uczen("Kuba S",20,4);
        //Uczen ucz2 = new Uczen("Michal S",41,2);
        //Uczen ucz3 = new Uczen("Wiktor S",32,3);
        //Uczen ucz4 = new Uczen("Sylwia S",13,6);
        //System.out.println(ucz1.imie_i_nazwisko+" "+ucz1.wiek+" "+ucz3.srednia);
        //System.out.println(ucz2.imie_i_nazwisko+" "+ucz2.wiek+" "+ucz3.srednia);
        //System.out.println(ucz3.imie_i_nazwisko+" "+ucz3.wiek+" "+ucz3.srednia);
        func6(19);

    }
    public static void func()
    {
        for(int i=0;i<55;i++)
        {
            System.out.println(i+"\n");
        }
    }

    public static void func2()
    {
        for(int i=5;i<81;i++)
        {
            System.out.println(i+" ");
            i+=14;
        }
    }

    public static void func3()
    {
        int i=5;
        do{
            System.out.println(i);
            i=i+15;
        }while(i<81);
    }

    public static void func4()
    {
        int i=5;
        while(i<=80)
        {
            System.out.println(i);
            i+=15;
        }
    }

    public static void func5()
    {
        for(int i=11;i<=111;i++)
        {
            if(i % 13 == 0)
            {
                System.out.println(i+" ");
            }
        }
    }

    public static void func6(int n)
    {
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++)
        {
            b+=a;
            a=b-a;

        }
        System.out.println(a);

    }
}
