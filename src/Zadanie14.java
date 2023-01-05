import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj Litere pakietu:");
        String litera = klawiatura.nextLine();
        System.out.println("Podaj liczbę minut rozmów:");
        int rozmowy = klawiatura.nextInt();
        double planA = 39.99;
        double planB = 59.99;
        double planC = 69.99;

        switch (litera) {
            case "A": {
                if (rozmowy > 450) {
                    double kosztDodatkoweychRozmow = (rozmowy - 450) * 0.45;
                    double oplata = kosztDodatkoweychRozmow + planA;
                    System.out.println("Łączne opłaty to: " + oplata);
                }
                else {
                    System.out.println("Łączne opłaty to: " + planA);
                }
                break;
            }
            case "B": {
                if (rozmowy > 900) {
                    double kosztDodatkoweychRozmow = (rozmowy - 900) * 0.40;
                    double oplata = kosztDodatkoweychRozmow + planB;
                    System.out.println("Łączne opłaty to: " + oplata);
                }
                else {
                    System.out.println("Łączne opłaty to: " + planB);
                }
                break;
            }
            case "C": {
                System.out.println("Łączne opłaty to: " + planC);
                break;
            }
        }
    }
}
