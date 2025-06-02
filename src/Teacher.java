public class Teacher {
    String isim;
    String telNo;
    String alan;

    Teacher(String isim, String telNo, String alan){
        this.isim= isim;
        this.telNo = telNo;
        this.alan = alan;
    }
    void print(){
        System.out.println("Adı: " + isim);
        System.out.println("Telefon Numarası: " + telNo);
        System.out.println("Alanı:  " + alan);
    }
}
