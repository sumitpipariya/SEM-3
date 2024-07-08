import java.util.Scanner;

public class Employee{
	public static void main(String[] args) {
		
	Employee_Detail emp1 = new Employee_Detail();
	emp1.Employee_Details();
	emp1.dispaly();

	}
}

class  Employee_Detail{

	int employee_id;
	String name;
	String designation;
	int salary;

	public void Employee_Details(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Id : ");
		this.employee_id = sc.nextInt();
		System.out.println("Enter name : ");
		this.name = sc.next();
		System.out.println("Enter designation : ");
		this.designation = sc.next();
		System.out.println("Enter salary : ");
		this.salary = sc.nextInt();

	}

	public void dispaly(){
		System.out.println("Employee id :"+employee_id);
		System.out.println("Employee name : "+name);
		System.out.println("Employee designation : "+designation);
		System.out.println("Employee salary : "+salary);
	}
}