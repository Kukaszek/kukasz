import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj dzień w formie liczby:");
        int dzien = klawiatura.nextInt();
        System.out.println("Podaj miesiąc w formie liczby:");
        int miesiac = klawiatura.nextInt();
        System.out.println("Podaj dwie ostatnie cyfry roku:");
        int rok = klawiatura.nextInt();

        if (dzien * miesiac == rok) {
            System.out.println("Data jest magiczna!");
        }
        else  {
            System.out.println("Data nie jest magiczna!");
        }
    }
}
