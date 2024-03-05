public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ryszard","WOW",12,2);
        Student student2 = new Student("Fifi","fiflak",2,3);
        Student student3 = new Student("Olaf","a1b2c3",12,2);

        if (student1.getNumerIndeksu() == student3.getNumerIndeksu()) {
            System.out.println("Nie mozna tak!!");
        }

        Przedmiot przedmiot1 = new Przedmiot("Banan");
        Przedmiot przedmiot2 = new Przedmiot();
        student1.dodaj(przedmiot1);
        student2.dodaj(przedmiot2);
        // chyba dobrze chyba

    }
}