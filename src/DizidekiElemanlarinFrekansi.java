import java.util.Arrays;
import java.util.Scanner;
public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizideki eleman sayısını giriniz: ");
        n = scanner.nextInt();
        int[] dizi = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". eleman: ");
            dizi[i] = scanner.nextInt();
        }
        System.out.println("Oluşturduğunuz dizi: " + Arrays.toString(dizi));

        // Frekans dizisi (aynı indekste tekrar sayısını tutacak)
        int[] frekans = new int[n];

        for (int i = 0; i < n; i++) {
            if (frekans[i] == -1) {
                continue; // zaten işlenmiş eleman
            }
            int sayac = 1;
            for (int j = i + 1; j < n; j++) {
                if (dizi[i] == dizi[j]) {
                    sayac++;
                    frekans[j] = -1; // tekrar eden elemanları işaretle
                }
            }
            frekans[i] = sayac;
        }
        System.out.println("\nElemanların frekansları:");
        for (int i = 0; i < n; i++) {
            if (frekans[i] != -1) {
                System.out.println(dizi[i] + " sayısı " + frekans[i] + " kez tekrar etti.");
            }
        }
    }
}
