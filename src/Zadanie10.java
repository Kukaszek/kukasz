import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbę kalorii w produkcie:");
        double kalorie = klawiatura.nextDouble();
        System.out.println("Podaj liczbę gramów tłuszczu w produkcie:");
        double tluszcz = klawiatura.nextDouble();

        double kalorieZTluszczu = tluszcz * 9;
        double kalorieWSumie = kalorie + kalorieZTluszczu;
        double procentKalorii = (kalorieZTluszczu/kalorieWSumie) * 100;

        if (procentKalorii < 30) {
            System.out.println("Produkt jest niskotłuszczowy, procent kalorii z tłuszczu to: " + procentKalorii);
        }
        else if (kalorieZTluszczu > kalorieWSumie) {
            System.out.println("Podano błędne dane!");
        }

    }
}
