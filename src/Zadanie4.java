import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner klawitura = new Scanner(System.in);

        System.out.println("Podaj wynik pierwszego testu w procentach:");
        double wynik1 = klawitura.nextDouble();
        System.out.println("Podaj wynik drugiego testu w procentach:");
        double wynik2 = klawitura.nextDouble();
        System.out.println("Podaj wynik trzeciego testu w procentach:");
        double wynik3 = klawitura.nextDouble();

        double srednia = (wynik1 + wynik2 + wynik3)/3;

        if (srednia >100) {
            System.out.println("Podałeś złe dane!");
        }
        else if (srednia >=90) {
            System.out.println("Twoja ocena to 5, ponieważ średnia wynosi: " + srednia);
        }
        else if (srednia>=80){
            System.out.println("Twoja ocena to 4, ponieważ średnia wynosi: " + srednia);
        }
        else if (srednia>=70){
            System.out.println("Twoja ocena to 3, ponieważ średnia wynosi: " + srednia);
        }
        else if (srednia>=60){
            System.out.println("Twoja ocena to 2, ponieważ średnia wynosi: " + srednia);
        }
        else {
            System.out.println("Twoja ocena to 1, ponieważ średnia wynosi: " + srednia);
        }

    }
}
