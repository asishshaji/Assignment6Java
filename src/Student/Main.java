package Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CollegeStudent[] collegeStudents = new CollegeStudent[2];
        SchoolStudent[] schoolStudents = new SchoolStudent[3];
        Main main = new Main();
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

            collegeStudents[i] = new CollegeStudent(rollNo, percentage, semester);
        }

        System.out.println("Enter details for school student");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter roll no");
            rollNo = scanner.nextInt();

            System.out.println("Enter Percentage ");
            percentage = scanner.nextDouble();

            System.out.println("Enter class name");
            className = scanner.next();

            schoolStudents[i] = new SchoolStudent(rollNo, percentage, className);
        }


        for (CollegeStudent stu : collegeStudents) {
            stu.show();
        }

        for (SchoolStudent stu : schoolStudents) {
            stu.show();
        }

        System.out.println("Enter search key");
        searchKey = scanner.nextInt();

        for (CollegeStudent stu : collegeStudents)
            main.searchMsg(stu, searchKey, "User is a college student");


        for (SchoolStudent stu : schoolStudents)
            main.searchMsg(stu, searchKey, "User is a school student");


        for (CollegeStudent stu : collegeStudents) {
            if (stu.percentage > 75)
                countAGrade++;
        }

        for (SchoolStudent stu : schoolStudents) {
            if (stu.percentage > 75)
                countAGrade++;
        }

        System.out.println("Number of students with grade A : " + countAGrade);

    }

    public void searchMsg(Student stu, int searchKey, String message) {

        if (stu.rollNo == searchKey) {
            System.out.println("User is a college student");
            return;
        }
    }
}
