public class Trojkat {
    boolean mozna = true;
    public static void main(String[] args)
    {
        Trojkat t = new Trojkat();
        t.boki(6,2,3);
    }
    public void boki(int bok1,int bok2, int bok3)
    {
        if(bok1+bok2<bok3)
        {
            mozna = false;
        }
        else if(bok1+bok3<bok2)
        {
            mozna = false;
        }
        else if(bok2+bok3<bok1)
        {
            mozna = false;
        }

        if(mozna == true)
        {
            System.out.println("Mozna utowrzyc");
            if(bok1 == bok2 && bok2 == bok3)
            {
                System.out.println("trojkat rownoboczny");
            }
            else if(bok1 == bok2 || bok1 == bok3 || bok2 == bok3)
            {
                System.out.println("trojkat rownoramienny");

            }else {
                System.out.println("trojkat roznoboczny");
            }

        }else System.out.println("Nie mozna utowrzyc");


    }
}
