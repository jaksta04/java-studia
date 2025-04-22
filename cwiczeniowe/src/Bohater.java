public class Bohater {
    String name;
    String type;
    int level;
    int arena;
    int money;
    public void Bohater(String name,String type ,int level, int arena, int money)
    {
        this.name = name;
        this.type = type;
        this.level = level;
        this.arena = arena;
        this.money = money;

    }
    public void show()
    {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Level: " + level);
        System.out.println("Arena: " + arena);
        System.out.println("Money: " + money);
    }
}
