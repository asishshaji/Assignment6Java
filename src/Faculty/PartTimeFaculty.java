package Faculty;

public class PartTimeFaculty extends Faculty {
    int hour;
    double rate;

    PartTimeFaculty() {
    }

    void acceptData(int hour, double rate, int id) {
        this.hour = hour;
        this.rate = rate;
        this.salary = hour * rate;
        this.setFacultyId(id);
    }

    void displayData() {
        System.out.println("Hour : " + hour);
        System.out.println("Rate : " + rate);
        System.out.println("Salary : " + this.salary);

    }
}
