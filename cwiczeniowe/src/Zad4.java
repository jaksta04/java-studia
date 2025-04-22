public class Zad4 {
    public static void main(String[] args)
    {
        int tab[][] = new int[5][];
        for(int i=0; i<5; i++)
        {
            tab[i] = new int[5];
            for(int j=0; j< tab[i].length; j++)
            {
                tab[i][j] = i+j;
            }
        }

        for(int i=0; i<5; i++)
        {
            for(int j=0; j< tab[i].length; j++)
            {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }


    }

}
