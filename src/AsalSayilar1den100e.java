
public class AsalSayilar1den100e {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            int sayac = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac == 1) {
                System.out.println(i + " ");
            }
        }

    }
}
