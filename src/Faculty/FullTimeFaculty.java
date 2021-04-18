package Faculty;

public class FullTimeFaculty extends Faculty {
    double basic, allowance;

    FullTimeFaculty() {
    }

    void acceptData(double basic, double allowance, int id) {
        this.basic = basic;
        this.allowance = allowance;
        this.salary = basic + allowance;
        this.setFacultyId(id);
    }

    void displayData() {
        System.out.println("Basic : " + basic);
        System.out.println("Allowance : " + allowance);
        System.out.println("Salary : " + this.salary);

    }

}
