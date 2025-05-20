import java.util.Scanner;

public class NotOrtHesaplama {
    public static void main(String[] args){
        int turkce, mat, fen, sosyal, ingilizce;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = scanner.nextInt();

        System.out.println("Matematik notunuzu giriniz: ");
        mat = scanner.nextInt();

        System.out.println("Fen notunuzu giriniz: ");
        fen = scanner.nextInt();

        System.out.println("Sosyal notunuzu giriniz: ");
        sosyal = scanner.nextInt();

        System.out.println("İngilizce notunuzu giriniz: ");
        ingilizce = scanner.nextInt();

        int toplam = (turkce + mat + fen + sosyal + ingilizce);
        double ortalama = toplam/5;

        System.out.println("Not ortalaması:" + ortalama);
    }
}
