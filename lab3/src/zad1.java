public class zad1 {
    public static void main(String[] args)
    {
        int tab[] = new int[100];
        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = i;
        }
        int count = 0;
        for (int i = 0; i < 10; i++)
        {
            for(int k = 0; k < 10; k++)
            {
                if(count < 10)
                {
                    System.out.print("0"+tab[count] + ",");
                }else {
                System.out.print(tab[count]+",");}
                count++;
            }
            System.out.println("\n");
        }
    }

}
