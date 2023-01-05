import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj środowisko rozchodzenia się dźwięku:");
        String srodowisko = klawiatura.nextLine();
        System.out.println("Podaj odległość:");
        double odleglosc = klawiatura.nextDouble();
        int powietrze = 343;
        int woda = 1490;
        int stal = 5100;
        double czas;

        switch (srodowisko) {
            case "powietrze": {
                czas = odleglosc/powietrze;
                System.out.println("Czas potrzebny do pokonania odległości to " + czas + " sekund.");
                break;
            }
            case "woda": {
                czas = odleglosc/woda;
                System.out.println("Czas potrzebny do pokonania odległości to " + czas + " sekund.");
                break;
            }
            case "stal": {
                czas = odleglosc/stal;
                System.out.println("Czas potrzebny do pokonania odległości to " + czas + " sekund.");
                break;
            }
            default: {
                System.out.println("Błędne środowisko!");
            }
        }



    }
}
