import java.util.Scanner;

public class EtkinlikOnermeProgrami {
    public static void main(String[] args) {
        double sicaklik;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Havanın sıcaklık değerini giriniz: ");
        sicaklik = scanner.nextDouble();

        if (sicaklik<5.0){
            System.out.println("Kayak yapmaya ne dersiniz?");
        }
        if (5.0<sicaklik && sicaklik<15.0){
            System.out.println("Vizyonda çok iyi yapımlar var, sinemaya mı gitsek?");
        }
        if (15.0<sicaklik && sicaklik<25.0){
            System.out.println("Hava da tam piknik havası! Nerede piknik yapalım?");
        }
        if (25.0<sicaklik){
            System.out.println("Plaj sezonunu açma vakti gelmiş! Haydi denize!");
        }
    }
}
