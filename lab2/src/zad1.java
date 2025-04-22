import java.util.Scanner;

public class zad1 {

    public static void main(String[] args)
    {
        zad1_2();
    }
    public static void zad1()
    {
        String text;
        char sign;
        System.out.println("Podaj tekst: ");
        Scanner scan = new Scanner(System.in);
        text = scan.nextLine();
        System.out.println("Podaj znak: ");
        Scanner scan2 = new Scanner(System.in);
        sign = scan2.next().charAt(0);

        int count =0;
        for(int i=0; i < text.length(); i++)
        {
            if(text.charAt(i) == sign)
            {
                count++;
            }
        }

        System.out.println("Znak "+sign+" wystapil "+ count+" razy");
    }

    public static void zad1_2()
    {
        String text;
        char sign;
        System.out.println("Podaj tekst: ");
        Scanner scan = new Scanner(System.in);
        text = scan.nextLine();
        char[] znaki = new char[text.length()];
        int[] value = new int[text.length()];

        znaki[0] = text.charAt(0);
        value[0] = 1;
        int number = 1;

        for(int i=1; i < text.length(); i++)
        {
            boolean found = false;
            for(int k = 0; k < number; k++)
            {
                if(znaki[k] == text.charAt(i))
                {
                    value[k] += 1;
                    found = true;
                    break;
                }
            }
            if(found == false)
            {
            znaki[number] = text.charAt(i);
            value[number] =1;
            number++;




            }


        }

        for(int i=0; i < number; i++)
        {
            System.out.println("Znak "+znaki[i]+ " wystapil "+ value[i]+" razy \n");
        }



}
}
