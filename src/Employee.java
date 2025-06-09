public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear= hireYear;
    }
    double tax (){
        if (salary >= 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    double bonus (){
        if (this.workHours > 40) {
            int bonusHours = this.workHours - 40;
            return bonusHours * 30;
        } else {
            return 0;
        }
    }
    double raiseSalary(){
        int year = 2021 - this.hireYear;
        double raise = 0;
        if (year < 10) {
            raise = this.salary * 0.05;
        } else if (year > 9 && year < 20) {
            raise = this.salary * 0.10;
        } else if (year > 19) {
            raise = this.salary * 0.15;
        }
        return raise;
    }
    void info(){
        double taxAmount = tax();
        double bonusAmount = bonus();
        double raiseAmount = raiseSalary();
        double salaryWithRaise = this.salary + raiseAmount;
        double totalSalary = salaryWithRaise + bonusAmount - taxAmount;
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work Hours : " + this.workHours);
        System.out.println("Hire Year : " + this.hireYear);
        System.out.println("Tax : " + taxAmount);
        System.out.println("Bonus : " + bonusAmount);
        System.out.println("Salary Increase : " + raiseAmount);
        System.out.println("Salary with Raise : " + (salary + bonusAmount - taxAmount));
        System.out.println("Total Salary : " + totalSalary);
    }
}
