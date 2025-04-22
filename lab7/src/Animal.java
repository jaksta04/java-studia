public class Animal implements Comparable<Animal>
{
    Animal(String name)
    {
        this.name = name;
    }

    String name = "Filemon";
    int age = 5;

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(this.age, o.age);
    }
}
