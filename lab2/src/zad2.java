import java.util.Scanner;

public class zad2 {
    public static void main(String[] args)
    {
        zad2();
    }
    public static void zad2()
    {
        String text;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = scan.nextLine();
        int sum=0;
        for(int i=0;i<text.length();i++)
        {
            if(Character.isLowerCase(text.charAt(i)) || Character.isDigit(text.charAt(i)))
            {
                sum += (int) text.charAt(i);
            }
        }
        System.out.println("Sum of digits is: " + sum);
    }
}
