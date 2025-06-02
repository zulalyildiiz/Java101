public class Course {
    Teacher teacher;
    String isim;
    String onEk;
    int egitmenNo;
    double not;

    Course ( String isim, String onEk, Teacher teacher, int egitmenNo){
        this.isim = isim;
        this.onEk = onEk;
        this.egitmenNo =egitmenNo;
        this.not = 0;
        this.teacher = teacher;
    }
    void addTeacher(Teacher teacher){
        if (teacher.alan.equals(this.onEk)) {
            this.teacher = teacher;
            printTeacher();
        }else{
            System.out.println("Eğitmen ve alanı uyuşmuyor!");
        }
    }
    public void printTeacher(){
        this.teacher.print();
    }

}

