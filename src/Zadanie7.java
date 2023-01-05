import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj pierwsze imie: ");
        String imie1 = klawiatura.nextLine();
        System.out.println("Podaj drugie imie: ");
        String imie2 = klawiatura.nextLine();
        System.out.println("Podaj trzecie imie: ");
        String imie3 = klawiatura.nextLine();

        if (imie1.compareTo(imie2)<0 && imie1.compareTo(imie3)<0 && imie2.compareTo(imie3)<0) {
            System.out.println(imie1 + "\n" + imie2 + "\n" + imie3);
        }
        else if (imie1.compareTo(imie2)<0 && imie1.compareTo(imie3)<0 && imie3.compareTo(imie2)<0) {
            System.out.println(imie1 + "\n" + imie3 + "\n" + imie2);
        }
        else if (imie2.compareTo(imie1)<0 && imie2.compareTo(imie3)<0 && imie1.compareTo(imie3)<0) {
            System.out.println(imie2 + "\n" + imie1 + "\n" + imie3);
        }
        else if (imie2.compareTo(imie1)<0 && imie2.compareTo(imie3)<0 && imie3.compareTo(imie1)<0) {
            System.out.println(imie2 + "\n" + imie3 + "\n" + imie1);
        }
        else if (imie3.compareTo(imie1)<0 && imie3.compareTo(imie2)<0 && imie1.compareTo(imie2)<0) {
            System.out.println(imie3 + "\n" + imie1 + "\n" + imie2);
        }
        else if (imie3.compareTo(imie1)<0 && imie3.compareTo(imie2)<0 && imie2.compareTo(imie1)<0) {
            System.out.println(imie3 + "\n" + imie2 + "\n" + imie1);
        }
    }
}
