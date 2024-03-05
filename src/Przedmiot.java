import java.util.Objects;

public class Przedmiot {
    private String nazwaPrzedmiotu;
    private int liczbaPunktowECTS;

    public Przedmiot(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }
    public Przedmiot(){

    }



    public String getNazwaPrzedmiotu() {
        return nazwaPrzedmiotu;
    }

    public void setNazwaPrzedmiotu(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public int getLiczbaPunktowECTS() {
        return liczbaPunktowECTS;
    }

    public void setLiczbaPunktowECTS(int liczbaPunktowECTS) {
        this.liczbaPunktowECTS = liczbaPunktowECTS;
    }

    @Override
    public String toString() {
        return String.format("Nazwa Przedmiotu: %s - ilosc punktow ECTS: %d",nazwaPrzedmiotu,liczbaPunktowECTS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Przedmiot przedmiot = (Przedmiot) o;
        return liczbaPunktowECTS == przedmiot.liczbaPunktowECTS && Objects.equals(nazwaPrzedmiotu, przedmiot.nazwaPrzedmiotu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwaPrzedmiotu, liczbaPunktowECTS);
    }

}
