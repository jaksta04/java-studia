import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args)
    {
        System.out.println("Enter text: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        char signs[] = new char[text.length()];

        for(int i = 0; i < text.length(); i++)
        {
            signs[i] = text.charAt(i);
        }
        char value;
        for(int i = 0; i < signs.length/2; i++)
        {
            value = signs[i];
            signs[i] = signs[signs.length - i-1];
            signs[signs.length - i - 1] = value;
        }

        for(int k = 0; k < signs.length; k++)
        {
            System.out.print(signs[k]+" ");
        }
    }
}
