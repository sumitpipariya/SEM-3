import java.util.Scanner;

public class ArrayObject{
	public static void main(String[] args) {
		 
		Student_Detail[] arr = new Student_Detail[5];
		for(int i=0;i<5;i++){
			arr[i] = new Student_Detail();
			arr[i].details();
		}
		for(int i=0;i<5;i++){
			arr[i].display();
		}
	}
}

class Student_Detail{

	int  Enrollment_No;
	String Name;
	int Semester;
	double CPI;

	public void details(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Enrollment Number : ");
		Enrollment_No = sc.nextInt();
		System.out.println("Enetr you name : ");
		Name = sc.next();
		System.out.println("Enter Semester : ");
		Semester = sc.nextInt();
		System.out.println("Enter CPI : ");
		CPI = sc.nextDouble();

	}

	public void display(){
		System.out.println("Enrollment Number :" +Enrollment_No);
		System.out.println("name : "+Name);
		System.out.println("Semester : "+Semester);
		System.out.println("CPI : "+CPI);
	}
}