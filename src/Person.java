import java.util.Scanner;

public class Person {
    String name;
    int age;

    Person() {
        this.age = 18;
        this.name = "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        Person person = new Person();
        person.display();
        System.out.print("Enter name :> ");
        name = scanner.next();
        System.out.print("Enter age :> ");
        age = scanner.nextInt();

        person.setName(name);
        person.setAge(age);

        person.display();
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Displaying data");
        System.out.println("Name : " + name + "\nAge : " + age);
    }

}
