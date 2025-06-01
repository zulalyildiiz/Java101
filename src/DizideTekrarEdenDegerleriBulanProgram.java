import java.util.Arrays;
public class DizideTekrarEdenDegerleriBulanProgram {
    static boolean isVarMi(int[] list, int deger){
        for ( int i : list){
            if ( i == deger){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int baslangicIndex = 0;
        
        int[] dizi = {1, 2, 3, 3, 3, 4, 4, 4, 4, 5, 6, 7};
        int[] dublicate = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    if (!isVarMi(dublicate, dizi[i])){
                        dublicate[baslangicIndex++] = dizi[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(dublicate));
    }
}
