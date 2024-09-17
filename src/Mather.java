public class Mather {
    static double calculate(double first, double second, String symbol) {
        switch (symbol) {
            case "add":
                return first + second;
            case "subtract":
                return first - second;
            case "multiply":
                return first * second;
            case "divide":
                if (second != 0) {
                    return first / second;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return 0;
                }
            default:
                System.out.println("Invalid operation.");
                return 0;
        }
    }
}