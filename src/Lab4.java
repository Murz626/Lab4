package Lab4;
import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("Choose a car:");
        System.out.println("Car #1");
        System.out.println("Car #2");
        System.out.println("Car #3");
        Scanner sc = new Scanner(System.in);
        int q1 = sc.nextInt();
        c.construct(q1);
        c.getCarinfo();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Select the following action: ");
            System.out.println("Drive");
            System.out.println("Information about the car");
            System.out.println("Refuel");
            System.out.println("Stop the car");
            int op = sc.nextInt();
            if (op == 1) {
                System.out.println("How many kilometers to drive?");
                int km = sc.nextInt();
                c.drive(km);
            } else if (op == 2) {
                c.getCarinfo();
            } else if (op == 3) {
                System.out.println("How much should refuel?");
                int amount = sc.nextInt();
                c.refuel(amount);
            } else if (op == 4) {
                break;
            } else {
                System.out.println("Wrong command"); }
        } System.out.println("end of the trip");
    }
}