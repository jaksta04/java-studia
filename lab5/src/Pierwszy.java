public interface Pierwszy {
    void pustaMetoda();
    default void Metoda()
    {
        System.out.println("Metoda!");
    }
}
