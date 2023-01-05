import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbę sekund:");
        int sekundy  = klawiatura.nextInt();
        double minuty = (double)sekundy/60;
        double godziny = (double)sekundy/3600;
        double dni = (double)sekundy/86400;

        if ((sekundy > 86400)) {
            System.out.println(sekundy + " sekund to: " + minuty + " minut, " + godziny + " godzin i " + dni + " dni.");
        }
        else if (sekundy > 3600) {
            System.out.println(sekundy + " sekund to: " + minuty + " minut i " + godziny + " godzin");
        }
        else  if (sekundy > 60) {
            System.out.println(sekundy + " sekund to: " + minuty + " minut");
        }
        else {
            System.out.println("Liczba sekund to: " + sekundy);
        }
    }
}
