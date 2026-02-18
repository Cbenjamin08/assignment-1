import java.util.Scanner;

public class CubicFormula {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a nonzero a value:");
        double a = keyboard.nextDouble();
        System.out.println("Please enter a nonzero b value:");
        double b = keyboard.nextDouble();
        System.out.println("Please enter a nonzero c value:");
        double c = keyboard.nextDouble();
        System.out.println("Please enter a nonzero d value:");
        double d = keyboard.nextDouble();
        keyboard.close();
        double discriminant = 18 * a * b * c * d - 4 * b * b * b * d + b * b * c * c - 4 * a * c * c * c - 27 * a * a * d * d;
        double var1 = (b * c) / (6 * a * a) - d / (2 * a) - (b * b * b) / (27 * a * a * a);
        double var2 = Math.pow(c / (3 * a) - (b * b) / (9 * a * a), 3);
        double root1 = Math.cbrt(var1 + Math.sqrt(Math.pow(var1, 2) + var2))
                + Math.cbrt(var1 - Math.sqrt(Math.pow(var1, 2) + var2)) - b / (3 * a);

        if (discriminant > 0) {
            System.out.println("There is 3 distinct real roots");
        } else if (discriminant == 0) {
            System.out.println("All roots are equal, and at least 2 are repeated");
        } else {
            System.out.println("There is 1 real root and 2 complex conjugate roots");
        }

        System.out.println(root1);
        System.out.println(discriminant);
    }
}
