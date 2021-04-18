package BHK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalAmountOnFlats = 0.0;

        TwoBHK[] bhks = new TwoBHK[3];
        for (int i = 0; i < 3; i++) {
            double roomArea, hallArea, price;

            System.out.println("Enter room area");
            roomArea = scanner.nextDouble();

            System.out.println("Enter hall area");
            hallArea = scanner.nextDouble();

            System.out.println("Enter price ");
            price = scanner.nextDouble();

            bhks[i] = new TwoBHK(roomArea, hallArea, price);

        }

        for (TwoBHK bhk : bhks) {
            bhk.show();
            System.out.println(" ");
            totalAmountOnFlats += bhk.price;
        }
        System.out.println("Total amount " + totalAmountOnFlats);

    }
}
