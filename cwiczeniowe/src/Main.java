import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter text to encrypt");
        String text;
        Scanner scan = new Scanner(System.in);
        text = scan.nextLine();
        char signs[] = new char[text.length()];
        int value;
        for(int i =0;i<text.length();i++)
        {
            char current = text.charAt(i);
            value = (int) current +3;
            signs[i] = (char) value;

        }
        String encrypt = new String(signs);
        System.out.println(encrypt+"\n");

        for(int i =0;i<encrypt.length();i++)
        {
            char current = encrypt.charAt(i);
            value = (int) current -3;
            signs[i] = (char) value;

        }
        String decrypt = new String(signs);
        System.out.println(decrypt+"\n");

    }
}