package Student;

public class CollegeStudent extends Student {
    char semester;

    public CollegeStudent() {
    }

    public CollegeStudent(char semester) {
        this.semester = semester;
    }

    public CollegeStudent(int rollNo, double percentage, char semester) {
        super(rollNo, percentage);
        this.semester = semester;
    }


    @Override
    void show() {
        super.show();
        System.out.println("Semester : " + semester);
    }
}
