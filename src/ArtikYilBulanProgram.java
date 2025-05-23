import java.util.Scanner;

public class ArtikYilBulanProgram {
    public static void main(String[] args) {
        double yil;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hesaplamak istediğiniz yılı giriniz:");
        yil = scanner.nextDouble();


        if ( yil % 4 == 0){
            if (yil % 100 != 0 || yil % 400 ==0) {
                System.out.println(yil + " bir artık yıldır.");
            } else {
                System.out.println(yil + " bir artık yıl değildir.");
            }

        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}
