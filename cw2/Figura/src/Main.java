import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figury = new ArrayList<>();

        Random rand = new Random();

        for(int i = 0; i<10; i++)
        {
            int choice = rand.nextInt(0,2);
            int choice2 = rand.nextInt(2,10);
            int choice3 = rand.nextInt(2,10);
            int choice4 = rand.nextInt(2,10);
            int choice5 = rand.nextInt(2,10);
            int choice6 = rand.nextInt(2,10);
            if(choice == 0)
            {
                try {
                    figury.add(new Trojkat(choice2, choice3, choice4, choice5, choice6));
                } catch (IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            else if(choice == 1)
            {
                try {
                    figury.add(new Kwadrat(choice2, choice3, choice4));
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
            }

        }

        for(Figura f : figury)
        {
            f.show();
        }


    }
}