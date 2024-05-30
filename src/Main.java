import java.util.Scanner;

public class Main {
    public static double calculate(double x, double a, double b, int functionNumber) {
        // так как все функции непрерывны можно использовать if/else
        switch (functionNumber) {
            case 1:
                return x <= 3 ? b + 2 * Math.log(Math.abs(x)) : (Math.pow(x, 2)) / (Math.pow(x, 2) + a);
            case 2:
                return x > 0 ? a + (1.0 / 2.0) * Math.exp(-x) : Math.cos(b * x + 1);
            case 3:
                return x <= 1 ? 1 / (Math.pow(a, 2) + Math.pow(x, 2)) : b * Math.log(Math.abs(x));
            case 4:
                return x <= 2 ? (a + Math.pow(x, 2)) / (b + Math.log(Math.abs(x) + 1)) : Math.exp(x) + Math.pow(x, 2);
            case 5:
                return x <= 1 ? a * Math.pow(Math.sin(x), 2) + Math.sqrt(x) : b * Math.exp(Math.pow(x, 2));
            case 6:
                return x <= -1 ? a * Math.tan(Math.pow(x, 2)) : b + (Math.pow(x, 2) / (Math.pow(x, 2) + a));
            case 7:
                return x > 3 ? (a + x) * Math.atan(a * x) : Math.pow(Math.cos(b + Math.pow(x, 3)), 2);
            case 8:
                return x < 5 ? Math.pow(Math.sin(a + x), 3) : Math.log(Math.sqrt(Math.abs(b - x)));
            case 9:
                return x >= 2 ? Math.sqrt(1 + x * Math.sqrt(a * x)) : a * Math.sin(b * x) + 3;
            case 10:
                return x <= 0 ? Math.sqrt(Math.exp(2 * x - b)) - 1 : 1 / (Math.pow(x, 2) + a);
            case 11:
                return x > 4 ? Math.sqrt(a + Math.abs(Math.sin(x))) : Math.tan(b * x);
            case 12:
                return x <= 1 ? 2 * Math.pow(x, 2) + a * Math.cos(b * x) : Math.exp(x) + Math.tan(Math.pow(x, 3));
            case 13:
                return x >= 2 ? Math.log(a + Math.pow(x, 2)) : Math.exp(Math.sin(x)) + 2 * b;
            case 14:
                return x > -1 ? 0.2 * Math.pow(x, 3) + a : b * Math.pow(x, 2) + Math.log(Math.abs(x + 3));
            case 15:
                return x < 2 ? Math.sin(x + Math.pow(a, 2)) : Math.log(x*x + 2*x + b);
            case 16:
                return x < 2 ? Math.cos(x + Math.pow(a, 2)) : Math.log(x*x + 2*x + b);
            default:
                throw new IllegalArgumentException("Invalid function number: " + functionNumber);
        }
    }

    public static void main(String[] args) {
        double a = 1;
        double b = 1;

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        for (int i = 1; i <= 16; i++) {
            System.out.println("Результат функции " + i + ": " + calculate(x, a, b, i));
        }
    }
}