import java.util.Scanner;

public class MathOperation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        MathOperation mathOperation = new MathOperation();
        System.out.print("Enter choice(1-4) :> ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int a1, a2;
                System.out.println("Enter two integers");
                a1 = scanner.nextInt();
                a2 = scanner.nextInt();
                mathOperation.multiply(a1, a2);
                break;
            case 2:
                float a, b, c;
                System.out.println("Enter three floating point numbers ");
                a = scanner.nextFloat();
                b = scanner.nextFloat();
                c = scanner.nextFloat();
                mathOperation.multiply(a, b, c);
                break;
            case 3:
                int n;
                System.out.println("Enter the no of elements");
                n = scanner.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter number :> ");
                    arr[i] = scanner.nextInt();
                }
                mathOperation.multiply(arr);
                break;
            case 4:
                double a3;
                int b3;
                System.out.println("Enter double ");
                a3 = scanner.nextDouble();
                System.out.println("Enter integer");
                b3 = scanner.nextInt();
                mathOperation.multiply(a3, b3);
                break;
            default:
                System.out.println("Enter valid option");
        }
    }

    void multiply(int a, int b) {
        System.out.println(a * b);
    }

    void multiply(float a, float b, float c) {
        System.out.println(a * b * c);
    }

    void multiply(int... nums) {
        int res = 1;
        for (int num : nums) {
            res *= num;
        }
        System.out.println(res);
    }

    void multiply(double a, int b) {
        System.out.println(a * b);
    }

}
