public class Division {
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 2;
        System.out.println("Result: " + divide(num1, num2));
    }
}