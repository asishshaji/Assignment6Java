package StudentsPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];
        int rollNo;
        double percentage;
        char semester;
        String className;
        int searchKey;
        int countAGrade = 0;

        System.out.println("Enter details for college student");
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter roll no");
            rollNo = scanner.nextInt();

            System.out.println("Enter Percentage ");
            percentage = scanner.nextDouble();

            System.out.println("Enter semester");
            semester = scanner.next().charAt(0);

            students[i] = new CollegeStudent(rollNo, percentage, semester);
        }

        System.out.println("Enter details for school student");
        for (int i = 2; i < 5; i++) {
            System.out.println("Enter roll no");
            rollNo = scanner.nextInt();

            System.out.println("Enter Percentage ");
            percentage = scanner.nextDouble();

            System.out.println("Enter class name");
            className = scanner.next();

            students[i] = new SchoolStudent(rollNo, percentage, className);
        }

        for (Student stu : students) {
            stu.show();
        }


        System.out.println("Enter search key");
        searchKey = scanner.nextInt();

        for (Student stu : students) {
            if (stu.getRollNo() == searchKey) {
                if (stu instanceof SchoolStudent)
                    System.out.println("School student");
                else System.out.println("College student");
            }
            if (stu.getPercentage() > 75) countAGrade++;

        }


        System.out.println("Number of students with grade A : " + countAGrade);

    }

}
