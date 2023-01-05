import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbę zakupionych pakietów:");
        int pakiety = klawiatura.nextInt();
        int cena = 99;
        int koniecCena = pakiety * cena;

        if (pakiety > 100) {
            double wynik = koniecCena * 0.5;
            System.out.println("Łączna kwota zakupu po rabacie: " + wynik);
        }
        else if (pakiety > 50) {
            double wynik = koniecCena * 0.6;
            System.out.println("Łączna kwota zakupu po rabacie: " + wynik);
        }
        else if (pakiety > 20) {
            double wynik = koniecCena * 0.7;
            System.out.println("Łączna kwota zakupu po rabacie: " + wynik);
        }
        else if (pakiety > 10) {
            double wynik = koniecCena * 0.8;
            System.out.println("Łączna kwota zakupu po rabacie: " + wynik);
        }
        else {
            System.out.println("Łączna kwota zakupu: " + koniecCena);
        }
    }
}
