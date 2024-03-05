import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Objects;
//.

public class Student {
    private String imie;
    private String nazwisko;

    // myslalem tutaj nad Static ale zdecydowlaem sie nad Final
    private final int numerIndeksu;
    private int Rokstudiow;

    public ArrayList<Przedmiot> przedmioty = new ArrayList<>();

    public Student(String imie, String nazwisko, int numerIndeksu, int rokstudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        Rokstudiow = rokstudiow;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public int getRokstudiow() {
        return Rokstudiow;
    }

    public ArrayList<Przedmiot> getPrzedmioty() {
        return przedmioty;
    }
    @Override
    public String toString() {
        return String.format("Imie:%s; Nazwisko: %s; NumerIndeksu: %d; rokstudiow: %d",imie,nazwisko,numerIndeksu,Rokstudiow);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numerIndeksu == student.numerIndeksu && Rokstudiow == student.Rokstudiow && Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko) && Objects.equals(przedmioty, student.przedmioty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, numerIndeksu, Rokstudiow, przedmioty);
    }
    public void dodaj(Przedmiot przedmiot){
        przedmioty.add(przedmiot);
        System.out.println("Dodano: " + przedmiot);
    }

}
