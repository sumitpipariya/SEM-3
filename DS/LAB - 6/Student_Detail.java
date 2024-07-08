import java.util.Scanner;

public class StudentDetailsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student_Detail[] students = new Student_Detail[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enrollment No: ");
            String enrollmentNo = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Semester: ");
            int semester = scanner.nextInt();
            System.out.print("CPI: ");
            double cpi = scanner.nextDouble();
            scanner.nextLine(); 

            students[i] = new Student_Detail(enrollmentNo, name, semester, cpi);
        }

        System.out.println("\nStudent Details:");
        for (Student_Detail student : students) {
            student.displayDetails();
        }

    }
}

class Student_Detail {
    String Enrollment_No;
    String Name;
    int Semester;
    double CPI;

    Student_Detail(String Enrollment_No, String Name, int Semester, double CPI) {
        this.Enrollment_No = Enrollment_No;
        this.Name = Name;
        this.Semester = Semester;
        this.CPI = CPI;
    }

    void displayDetails() {
        System.out.println("Enrollment No: " + Enrollment_No);
        System.out.println("Name: " + Name);
        System.out.println("Semester: " + Semester);
        System.out.println("CPI: " + CPI);
        System.out.println();
    }
}

