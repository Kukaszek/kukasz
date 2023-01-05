import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj nazwisko pierwszego biegacza:");
        String nazwisko1 = klawiatura.nextLine();
        System.out.println("Podaj czas uczończenia biegu w minutach:");
        double czas1 = klawiatura.nextDouble();
        String clear = klawiatura.nextLine();
        System.out.println("Podaj nazwisko drugiego biegacza:");
        String nazwisko2 = klawiatura.nextLine();
        System.out.println("Podaj czas uczończenia biegu w minutach:");
        double czas2 = klawiatura.nextDouble();
        clear = klawiatura.nextLine();
        System.out.println("Podaj nazwisko trzeciego biegacza:");
        String nazwisko3 = klawiatura.nextLine();
        System.out.println("Podaj czas uczończenia biegu w minutach:");
        double czas3 = klawiatura.nextDouble();

        if (czas1 < czas2 && czas1 < czas3 && czas2 < czas3) {
            System.out.println(nazwisko1 + "\n" + nazwisko2 + "\n" + nazwisko3);
        }
        else if (czas1 < czas2 && czas1 < czas3 && czas3 < czas2) {
            System.out.println(nazwisko1 + "\n" + nazwisko3 + "\n" + nazwisko2);
        }
        else if (czas2 < czas1 && czas2 < czas3 && czas1 < czas3) {
            System.out.println(nazwisko2 + "\n" + nazwisko1 + "\n" + nazwisko3);
        }
        else if (czas2 < czas1 && czas2 < czas3 && czas3< czas1) {
            System.out.println(nazwisko2 + "\n" + nazwisko3 + "\n" + nazwisko1);
        }
        else if (czas3 < czas1 && czas3 < czas2 && czas1 < czas2) {
            System.out.println(nazwisko3 + "\n" + nazwisko1 + "\n" + nazwisko2);
        }
        else if (czas3 < czas1 && czas3 < czas2 && czas2 < czas1) {
            System.out.println(nazwisko3 + "\n" + nazwisko2 + "\n" + nazwisko1);
        }
    }
}
