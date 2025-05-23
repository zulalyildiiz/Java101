import java.util.Scanner;

public class CinBurcuBulmaProgrami {
    public static void main(String[] args) {
        int dogumYili;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz:");
        dogumYili = scanner.nextInt();

        int kalan = dogumYili % 12;

        switch (kalan){
            case 0:
                System.out.println("Çin zodyağı burcunuz: MAYMUN");
                break;
            case 1:
                System.out.println("Çin zodyağı burcunuz: HOROZ");
                break;
            case 2:
                System.out.println("Çin zodyağı burcunuz: KÖPEK");
                break;
            case 3:
                System.out.println("Çin zodyağı burcunuz: DOMUZ");
                break;
            case 4:
                System.out.println("Çin zodyağı burcunuz: FARE");
                break;
            case 5:
                System.out.println("Çin zodyağı burcunuz: ÖKÜZ");
                break;
            case 6:
                System.out.println("Çin zodyağı burcunuz: KAPLAN");
                break;
            case 7:
                System.out.println("Çin zodyağı burcunuz: TAVŞAN");
                break;
            case 8:
                System.out.println("Çin zodyağı burcunuz: EJDERHA");
                break;
            case 9:
                System.out.println("Çin zodyağı burcunuz: YILAN");
                break;
            case 10:
                System.out.println("Çin zodyağı burcunuz: AT");
                break;
            case 11:
                System.out.println("Çin zodyağı burcunuz: KOYUN");
                break;
        }

    }
}
