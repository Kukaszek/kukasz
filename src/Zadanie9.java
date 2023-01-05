import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj wagę przesyłki: ");
        double waga = klawiatura.nextDouble();
        System.out.println("Podaj odległość przesyłki:");
        int odleglosc = klawiatura.nextInt();
        double cena = 0;

        if (waga > 5) {
            cena = cena + 3.80;
        }
        else if (waga > 3) {
            cena = cena + 3.70;
        }
        else if (waga > 1) {
            cena = cena + 2.20;
        }
        else if (waga <=1){
            cena = cena + 1.10;
        }

        double koniecOdleglosc = Math.ceil(odleglosc)/(double)500;
        double wynik = koniecOdleglosc + cena;

        System.out.println("Całkowita cena to: " + wynik + " zł");
    }
}
