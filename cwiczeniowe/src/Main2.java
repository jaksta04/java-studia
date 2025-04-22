public class Main2 {
    public static void main(String[] args)
    {
        Okrag Tab[] = z1();
        z2(Tab[1],Tab[2]);

    }
    public static Okrag[] z1()
    {
        Okrag tab[] = new Okrag[5];
        for(int i=0; i<5; i++)
        {
            tab[i] = new Okrag();
            tab[i].Okrag();
        }
        return tab;
    }
    public static void z2(Okrag o1, Okrag o2)
    {
        double value;
        value = Math.sqrt(Math.pow(o1.x - o2.x,2)+Math.pow(o1.y - o2.y,2));
        System.out.println("Okrag 1: ");
        o1.show(o1);
        System.out.println("Okrag 2: ");
        o2.show(o2);

        if(o1.x != o2.x && value == o1.r + o2.r)
        {
            System.out.println("Okregi są styczne \n");
        }
        else if(value > o1.r - o2.r)
        {
            System.out.println("Okregi są rozlaczne \n");
        }
        else if(value < o1.r + o2.r)
        {
            System.out.println("Okregi przecinaja sie \n");
        }
        else if(o1.x == o2.x && o1.y == o2.y && o1.r == o2.r)
        {
            System.out.println("Okregi pokrywaja sie \n");
        }


    }
}
