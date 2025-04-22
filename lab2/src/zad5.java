import java.util.Scanner;

public class zad5 {
    public static void main(String[] args)
    {
        z6();
    }
    public static void z5()
    {
        int number;
        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        char[] znaki = new char[number/2];
        int count = 0;
        while(number != 0)
        {
            if(number % 2 != 0)
            {
                znaki[count] = '1';
            }
            else znaki[count] = '0';

            number = number / 2;
            count++;



        }

        for(int i = 0; i < count; i++)
        {
            System.out.print(znaki[count - i-1]);
        }
    }

    public static void z6()
    {
        String binary;
        System.out.print("Enter string of 0 or 1\n");
        System.out.print("Enter binary: \n");
        Scanner scan = new Scanner(System.in);
        binary = scan.nextLine();
        int first0 = binary.indexOf('0');
        if(first0 == -1){
            System.out.println("Nie wystepuje 0");
            return;}

        int count = 1;
        int max = count;
        for(int i = first0; i < binary.length()-1; i++)
        {
                if (binary.charAt(i + 1) == '0') {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                } else {
                    count = 0;
                }
        }

        System.out.println("Ilosc zer: "+max);
    }
}
