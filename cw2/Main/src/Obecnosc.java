public class Obecnosc {
    private String data_godzina;
    private String przedmiot;
    private String typ_obecnosci;

    public Obecnosc(String data_godzina, String przedmiot, String typ_obecnosci)
    {
        this.data_godzina = data_godzina;
        this.przedmiot = przedmiot;
        this.typ_obecnosci = typ_obecnosci;
    }

    public String getData_godzina()
    {
        return data_godzina;
    }
    public String getPrzedmiot()
    {
        return przedmiot;
    }
    public String getTyp_obecnosci()
    {
        return typ_obecnosci;
    }
    public void setData_godzina(String data_godzina)
    {
        this.data_godzina = data_godzina;
    }

    public void setPrzedmiot(String przedmiot)
    {
        this.przedmiot = przedmiot;
    }
    public void setTyp_obecnosci(String typ_obecnosci)
    {
        this.typ_obecnosci = typ_obecnosci;
    }

}
