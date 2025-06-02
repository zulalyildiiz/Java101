
public class OBS {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "0555 555 55 55", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "0551 111 11 11", "FZK");
        Teacher t3 = new Teacher("Cahit Arf", "0242 242 24 42", "MAT");
        Course tarih = new Course("Tarih","TRH",t1,1);
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","FZK",t2,2);
        fizik.addTeacher(t2);
        Course matematik = new Course("Matematik","MAT",t3,3);
        matematik.addTeacher(t3);
        Student s1 = new Student("Zülco","163","2",tarih,fizik,matematik);
        s1.notEkle(96,48,86);
        s1.notYazdir();
        s1.isGeciyorMu(96,48,86);
        Student s2 = new Student("Ebru","193","3",tarih,fizik,matematik);
        s2.isGeciyorMu(30,40,50);
    }
}
