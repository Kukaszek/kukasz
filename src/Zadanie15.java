import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double oplataZaCzeki;

        System.out.println("Podaj liczbe czekow wystawionych w tym miesiacu:");
        int liczbaCzekow = klawiatura.nextInt();

        if (liczbaCzekow > 60){
            oplataZaCzeki = 0.04 * liczbaCzekow;
            double oplataCala = 10 + oplataZaCzeki;
            System.out.println("Całkowite opłaty w tym miesiacu to: " + oplataCala);
        }
        else  if (liczbaCzekow > 40){
            oplataZaCzeki = 0.06 * liczbaCzekow;
            double oplataCala = 10 + oplataZaCzeki;
            System.out.println("Całkowite opłaty w tym miesiacu to: " + oplataCala);
        }



    }
}
