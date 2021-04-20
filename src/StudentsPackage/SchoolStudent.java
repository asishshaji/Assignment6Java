package StudentsPackage;

public class SchoolStudent extends Student {
    String className;

    public SchoolStudent() {
    }

    public SchoolStudent(String className) {
        this.className = className;
    }

    public SchoolStudent(int rollNo, double percentage, String className) {
        super(rollNo, percentage);
        this.className = className;
    }

    void show() {
        super.show();
        System.out.println("Class : " + className);
    }


}
