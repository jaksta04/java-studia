import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int jeden;
    private static int dwa;
    private static int dzialanie;
    public static void main(String[] args) {
        double wynik=0;
        try {
            System.out.println("Program kalkulator! \n");
            System.out.println("Podaj pierwsza liczbe: \n");
            Scanner scaner = new Scanner(System.in);
            jeden = scaner.nextInt();
            System.out.println(
                    "           1 - dodawanie \n" +
                            "           2 - odejmowanie \n" +
                            "           3 - mnozenie \n" +
                            "           4 - dzielenie \n" +
                            "           5 - pierwiastek \n" +
                            "           6 - potega \n");
            dzialanie = scaner.nextInt();

            System.out.println("Podaj druga liczbe: \n");
            dwa = scaner.nextInt();
        }catch (ArithmeticException e)
        {
            System.out.println("Arithmetic exception");
            System.out.println("Nie dziel przez 0");
        }
        catch (InputMismatchException e)
        {
            System.out.println("InputMismatchException");
        }

        if(dzialanie == 1)
        {
            wynik = jeden+dwa;
        } else if (dzialanie == 2)
        {
            wynik = jeden-dwa;
        } else if (dzialanie == 3)
        {
            wynik = jeden*dwa;
        } else if (dzialanie == 4)
        {
            wynik = jeden/dwa;
        } else if (dzialanie == 5)
        {
            wynik = Math.sqrt(jeden);
        } else if (dzialanie == 6)
        {
            wynik = Math.pow(jeden, dwa);
        }
        System.out.println("Wynik = "+wynik+"\n");
    }

}