import java.util.Scanner;

public class zad4 {
    public static String z1()
    {
        String text;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = scan.nextLine();
        return text;
    }
    public static String z2(String text)
    {
        char[] tekst = text.toCharArray();
        for(int i = 0; i < text.length(); i++)
        {
            if(!Character.isDigit(text.charAt(i))) {
                char current = text.charAt(i);
                int k = (int) current + 3;
                char m = (char) k;
                tekst[i] = m;
            }else tekst[i] = text.charAt(i);
        }
        String str = new String(tekst);
        return str;
    }

    public static String z3(String text)
    {
        char[] tekst = text.toCharArray();
        for(int i = 0; i < text.length(); i++)
        {
            if(!Character.isDigit(text.charAt(i))) {
            char current = text.charAt(i);
            int k = (int) current -3;
            tekst[i] = (char) k;
            }else tekst[i] = text.charAt(i);

        }
        String str = new String(tekst);
        return str;

    }
    public static boolean z4(String text)
    {
        boolean pali = true;
        for (int i = 0; i < text.length()/2; i++)
        {
            if(!(text.charAt(i) == text.charAt(text.length()-i-1)))
            {
                pali = false;
                break;
            }
        }
        return pali;
    }
}
