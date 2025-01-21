package Lab4;
import java.util.Random;
import java.util.Scanner;
public class Car {
    public String brand;
    public String model;
    private int year;
    private int mileage = 0;
    private int fuellevel = 100;
    Random rnd = new Random();
    Scanner s = new Scanner(System.in);

    public void construct(int q1) {
        if (q1 == 1) {
            brand = "BMW";
            model = "X5";
            year = year + rnd.nextInt(1, 5);
        } else if (q1 == 2) {
            brand = "Toyota";
            model = "Camry";
            year = year + rnd.nextInt(1, 5);
        } else if (q1 == 3) {
            brand = "Audi";
            model = "A6";
            year = year + rnd.nextInt(1, 5);
        }
    }

    public void drive(int km) {
        int fuelConsumtion = km / 1;
        if (fuellevel < fuelConsumtion) {
            System.out.println("The trip is impossible");
            if (fuellevel <= 20) {
                System.out.println("Need to refuel");
            }
            return;
        }
        fuellevel -= fuelConsumtion;
        mileage = mileage + km;
        System.out.println("Your mileage now amounts to: " + mileage);

    }

    public void refuel(int amount) {
        fuellevel = fuellevel + amount;
        if (fuellevel > 100) {
            fuellevel = 100;
            System.out.println("The tank is full");
        }
    }

    public void getCarinfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Age of the car: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Fuel quantity: " + fuellevel);
    }
}