import java.util.Random;

public class Random1 {
    public static void main(String[] args)
    {
        Random rand = new Random();
        int liczba = rand.nextInt(10,20);
        System.out.println(liczba);
    }
}
