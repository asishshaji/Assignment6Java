package Student;

public class Student {
    int rollNo;
    double percentage;

    public Student() {
    }

    public Student(int rollNo, double percentage) {
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    void show() {
        System.out.println("Roll no : " + this.rollNo);
        System.out.println("Percentage : " + this.percentage);
    }
}
