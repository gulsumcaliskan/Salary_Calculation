//package salarycalc

public class Employee {
    
    String nameSurname;
    int salary;
    int workHours;
    int hireYear;
    
    double tax;
    double bonus;
    double raiseSalary;
    
    Employee(String nameSurname, int salary, int workHours, int hireYear){
        this.nameSurname = nameSurname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = 0;
        this.bonus = 0;
        this.raiseSalary = 0;
    }
    
    double tax(){
        if(this.salary > 1000){
            this.tax = this.salary * 0.03;
        }else {
            this.tax = 0;
        }
        return this.tax;
    }
    
    double bonus(){
        if(this.workHours > 40){
            this.bonus = (this.workHours - 40) * 30;
        }else {
            this.bonus = 0;
        }
        return this.bonus;
    }
    
    double raiseSalary(){
        if(2021 - this.hireYear < 10){
            this.raiseSalary = this.salary * 0.05;
        }else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20){
            this.raiseSalary = this.salary * 0.1;
        }else {
            this.raiseSalary = this.salary * 0.15; // 19 senenin üstünde çalışan için
        }
        return this.raiseSalary;
    }
    
    
    void printInfo(){
        System.out.println("************** Information System of the Employee *********");
        System.out.println();
        System.out.println("Name and Surname: " + this.nameSurname);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println();
        System.out.println("Tax: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Raise Salary: " + this.raiseSalary());
        System.out.println("The total salary with tax and bonus: " + (this.salary - this.tax() + this.bonus()));
        System.out.println("Total Salary: " + (this.salary + this.raiseSalary()));
        System.out.println("*****************");
        System.out.println();
        
    }
    
}
