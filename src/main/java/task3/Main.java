package task3;

import com.education.ztu.humans.Location;

public class Main {
    public static void main(String[] args) {
        System.out.println("Addition: " + Operation.addition(1, 2, 3, 4, 5));
        System.out.println("Subtraction: " + Operation.subtraction(10, 3, 2));
        System.out.println("Multiplication: " + Operation.multiplication(2, 3, 4));
        System.out.println("Division: " + Operation.division(100, 2, 5));
        System.out.println("Average: " + Operation.average(1, 2, 3, 4, 5));
        System.out.println("Maximum: " + Operation.maximum(1, 2, 3, 4, 5));
        System.out.println("Minimum: " + Operation.minimum(1, 2, 3, 4, 5));

        System.out.println("----- Enum Location ------");
        for (Location location : Location.values()) {
            System.out.println(location);
        }
    }
}
