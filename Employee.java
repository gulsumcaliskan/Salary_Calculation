
public class Employee {
	
	String name;
	int salary;
	int workHours;
	int hireYear;
//	int year = 2021 - hireYear;
	double tax;
	double bonus;
	double raiseSalary;
	
	Employee(String name, int salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
//		this.year = year;
		this.tax = 0;
		this.bonus = 0;
		this.raiseSalary = 0;
		
	}
	
	double tax(){
		if (this.salary > 1000){
			this.tax = this.salary * 0.03; 
		}else {
			this.tax = 0;
		}return this.tax;
		
		
	}
	
	double bonus(){
		if (workHours > 40){
			this.bonus = (this.workHours - 40) * 30; 
		}else
			this.bonus = 0;
		return this.bonus;
	}
	
	double raiseSalary(){
		if (2021- this.hireYear < 10){
			this.raiseSalary = this.salary * 0.05;
		}else if (2021 - this.hireYear > 9 && 2021- this.hireYear < 20){
			this.raiseSalary = this.salary * 0.1;
		}else {
			this.raiseSalary = this.salary * 0.15;
		}return this.raiseSalary;
	}

	void printInfo(){
		System.out.println("**********");
		System.out.println("Employee name: " + this.name);
		System.out.println("Employee salary: " + this.salary);
		System.out.println("Work Hour Per Week: " + this.workHours);
		System.out.println("Hire Year: " + this.hireYear);
		System.out.println("Tax Amount: " + tax());
		System.out.println("Bonus Amount: " + bonus());
		System.out.println("Raise Salary: " + raiseSalary());
		System.out.println("Salary with Tax and Bonus: " + (this.salary - tax() + bonus()));
		System.out.println("New Salary: " + (this.salary + raiseSalary()));
	}
	
	
}
