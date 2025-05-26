
public class DizidekiMaxveMiniBulanProgram {
    public static void main(String[] args) {
        int[] dizi = {1,2,3,4,5,6,7,8,9};
        int max = dizi[0];
        int min = dizi[0];
        for (int i : dizi){
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Dizinin min değeri: " + min);
        System.out.println("Dizinin max değeri: " + max);
    }

}
