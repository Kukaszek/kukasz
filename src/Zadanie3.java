import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj swoją wagę w kg:");
        double waga = klawiatura.nextDouble();
        System.out.println("Podaj swój wzrost w metrach:");
        double wzrost = klawiatura.nextDouble();

        double BMI = waga/Math.pow(wzrost,2);

        if (BMI >= 18.5 && BMI <= 25) {
            System.out.println("Twoje BMI jest w normie i wynosi: " + BMI + ".");
        }
        else if (BMI > 40 || BMI < 10) {
            System.out.println("Podałeś złe dane!");
        }
        else if (BMI < 18.5) {
            System.out.println("Masz niedowagę, a Twoje BMI wynosi: " + BMI + ".");
        }
        else if (BMI > 25) {
            System.out.println("Masz nadwagę, a Twoje BMI wynosi: " + BMI + ".");
        }


    }
}
