package Faculty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FullTimeFaculty[] fullTimeFaculties = new FullTimeFaculty[2];
        PartTimeFaculty[] partTimeFaculties = new PartTimeFaculty[2];

        System.out.println("Full time");
        for (int i = 0; i < 2; i++) {
            int id;
            double basic, allowance;
            System.out.println("Enter id");
            id = scanner.nextInt();

            System.out.println("Enter basic");
            basic = scanner.nextDouble();

            System.out.println("Enter allowance");
            allowance = scanner.nextDouble();

            FullTimeFaculty faculty = new FullTimeFaculty();
            faculty.acceptData(basic, allowance, id);

            fullTimeFaculties[i] = faculty;
        }

        System.out.println("Part time");
        for (int i = 0; i < 2; i++) {
            int id, hour;
            double rate;
            System.out.println("Enter id");
            id = scanner.nextInt();

            System.out.println("Enter hours");
            hour = scanner.nextInt();

            System.out.println("Enter rate");
            rate = scanner.nextDouble();

            PartTimeFaculty faculty = new PartTimeFaculty();
            faculty.acceptData(hour, rate, id);
            partTimeFaculties[i] = faculty;

        }
        System.out.println();
        System.out.println();
        System.out.println("Displaying Full Time data");
        System.out.println();

        for (FullTimeFaculty f :
                fullTimeFaculties) {
            f.displayData();
        }

        System.out.println();
        System.out.println();
        System.out.println("Displaying Part Time data");
        System.out.println();

        for (PartTimeFaculty p :
                partTimeFaculties) {
            p.displayData();
        }

    }
}
