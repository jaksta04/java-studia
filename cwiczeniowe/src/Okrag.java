import java.util.Random;

public class Okrag {
    int x;
    int y;
    int r;
    public void Okrag()
    {
        Random rand = new Random();
        x = rand.nextInt(5,10);
        y = rand.nextInt(5,10);
        r = rand.nextInt(1,5);
    }
    public void show(Okrag o)
    {
        System.out.println("x: "+o.x+"\n");
        System.out.println("y: "+o.y+"\n");
        System.out.println("r: "+r+"\n");
    }
}
