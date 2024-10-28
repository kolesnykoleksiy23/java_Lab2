package task3;

public class Operation {

    public static int addition(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    ;

    public static int subtraction(int... values) {
        if (values.length == 0) return 0;
        int result = values[0];
        for (int i = 1; i < values.length; i++) {
            result -= values[i];
        }
        return result;
    }
    public static int multiplication(int... values) {
        int result = 1;
        for (int value : values) {
            result *= value;
        }
        return result;
    }

    public static double division(double... values) {
        if (values.length == 0) return 0;
        double result = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] != 0) {
                result /= values[i];
            } else {
                System.out.println("Division by zero is not allowed");
                return 0;
            }
        }
        return result;
    }

    public static double average(int... values) {
        if (values.length == 0) return 0;
        int sum = addition(values);
        return (double) sum / values.length;
    }

    public static int maximum(int... values) {
        if (values.length == 0) return 0;
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int minimum(int... values) {
        if (values.length == 0) return 0;
        int min = values[0];
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
