import java.util.Scanner;

public class Student {
    String name;
    int rollNo;
    int age;
    double score;

    public Student(String name, int rollNo, int age, double score) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfStudents;

        System.out.println("Enter number of students");
        noOfStudents = scanner.nextInt();

        Student[] students = new Student[noOfStudents];

        for (int i = 0; i < noOfStudents; i++) {
            System.out.print("Enter the name, age, roll number and score for Student " + (i + 1) + ": ");
            String name = scanner.next();
            int age = scanner.nextInt();
            int rollNo = scanner.nextInt();
            int score = scanner.nextInt();
            students[i] = new Student(name, age, rollNo, score);
        }

        System.out.println("Records of Students in range of 0 to 50");
        for (Student student : students) {
            if (student.getScore() >= 0 && student.getScore() <= 50) {
                student.display();
            }
        }
        System.out.println("Records of Students in range of 51 to 65");
        for (Student student : students) {
            if (student.getScore() >= 51 && student.getScore() <= 65) {
                student.display();
            }
        }
        System.out.println("Records of Students in range of 66 to 80");
        for (Student student : students) {
            if (student.getScore() >= 66 && student.getScore() <= 80) {
                student.display();
            }
        }
        System.out.println("Records of Students in range of 81 to 100");
        for (Student student : students) {
            if (student.getScore() >= 81 && student.getScore() <= 100) {
                student.display();
            }
        }
    }

    double getScore() {
        return this.score;
    }

    void display() {
        System.out.println("Name: " + this.name + "\nAge: " + age + "\nRollno: " + this.rollNo + "\nScore: " + this.score);
    }
}
