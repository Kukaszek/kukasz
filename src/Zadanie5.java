import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj masę obiektu w kg: ");
        double masa = klawiatura.nextDouble();

        double ciezar = masa * 9.8;

        if (ciezar > 1000) {
            System.out.println("Obiekt jest za ciężki. Jego ciężar wynosi: " + ciezar);
        }
        else if (ciezar < 10) {
            System.out.println("Obiekt jest za lekki. Jego ciężar wynosi: " + ciezar);
        }
        else {
            System.out.println("Ciężar obiektu to: " + ciezar);
        }
    }
}
