public class Student {
    Course d1;
    Course d2;
    Course d3;
    String isim;
    String ogrNo;
    String sinif;
    double ort;
    boolean isGeciyorMu;

    Student(String isim, String ogrNo, String sinif, Course d1, Course d2, Course d3) {
        this.isim= isim;
        this.ogrNo = ogrNo;
        this.sinif = sinif;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.ort = 0.0;
        this.isGeciyorMu = false;
    }
    void notEkle(double not1, double not2, double not3){
        if (not1 <= 100 && not1 >=0) {
            this.d1.not=not1;
        }
        if ((not2 <= 100) && (not2 >= 0)) {
            this.d2.not=not2;
        }
        if (not3 <= 100 && not3 >=0) {
            this.d3.not=not3;
        }
    }
    void notYazdir (){
        System.out.println(this.d1.isim + " Notu: " + this.d1.not);
        System.out.println(this.d2.isim + " Notu: " + this.d2.not);
        System.out.println(this.d3.isim + " Notu: " + this.d3.not);
    }
    double ortHesapla(double not1, double not2, double not3){
        double toplam = not1 + not2 + not3;
        return toplam/3;
    }

    void isGeciyorMu(double not1, double not2, double not3){
        this.ort= ortHesapla(not1,not2,not3);
        System.out.println("Öğrencinin not ortalaması: " + this.ort );
        if (this.ort >= 60) {
            System.out.println("Sınıfı geçti!");
            this.isGeciyorMu = true;
        } else {
            System.out.println("Sınıfta kaldı!");
            this.isGeciyorMu = false;
        }
    }
}
