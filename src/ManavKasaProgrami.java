import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double elmaKg, armutKg, domatesKg, muzKg, patlicanKg, tutar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç kg elma aldınız?");
        elmaKg = scanner.nextDouble();

        System.out.println("Kaç kg armut aldınız?");
        armutKg = scanner.nextDouble();

        System.out.println("Kaç kg domates aldınız?");
        domatesKg = scanner.nextDouble();

        System.out.println("Kaç kg muz aldınız?");
        muzKg = scanner.nextDouble();

        System.out.println("Kaç kg patlıcan aldınız?");
        patlicanKg = scanner.nextDouble();

        tutar = ( (elmaKg * 3.67) + (armutKg * 2.14)+ (domatesKg * 1.11) + (muzKg * 0.95) + (patlicanKg * 5));

        System.out.println("Ödemeniz gereken tutar: " + tutar );

    }
}
