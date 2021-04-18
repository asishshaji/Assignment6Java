import java.util.Scanner;

public class Employee {
    public static double totalSalary = 0.0;
    public static int empNo = 0;
    double salary;

    Employee(double salary) {
        this.salary = salary;
        empNo += 1;
        totalSalary += salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfEmp;
        Employee emp = null;

        System.out.println("Enter number of employees ");
        numOfEmp = scanner.nextInt();

        for (int i = 0; i < numOfEmp; i++) {
            double salary;
            System.out.println("Enter salary");
            salary = scanner.nextDouble();
            emp = new Employee(salary);
        }
        if (emp != null) {
            emp.displayData();
        }
    }

    void displayData() {
        System.out.print("Total employees : " + empNo + "\nTotal Salary : " + totalSalary);
    }
}
