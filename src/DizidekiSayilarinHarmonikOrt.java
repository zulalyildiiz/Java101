

public class DizidekiSayilarinHarmonikOrt {
    public static void main(String[] args) {
        double toplam = 0;
        double[] dizi = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; dizi.length > i; i++) {
            toplam += (1/dizi[i]);
        }
        System.out.println("Dizinin harmonik ortalaması = " + toplam);
    }

}
