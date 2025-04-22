import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> przedmioty = new ArrayList<>();
        przedmioty.add("Matematyka");
        przedmioty.add("Historia");
        przedmioty.add("Geografia");
        przedmioty.add("Biologia");
        /*Interfejs nowy = new Interfejs() {
            @Override
            public void abstarkcyjnaMetoda(String tekst) {
                System.out.println(tekst);
            }
        }; */
        funkcja(przedmioty, przedmiot -> System.out.println("Przedmiot: "+przedmiot));


    }

    public static void funkcja(ArrayList<String> przedmioty, Interfejs nowy)
    {
        przedmioty.forEach(przedmiot -> nowy.abstarkcyjnaMetoda(przedmiot));

    }


}