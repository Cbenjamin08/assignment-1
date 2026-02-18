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
        double discriminant = b * b * c * c - 4 * a * Math.pow(c, 3) - 4 * Math.pow(b, 3) * -27 * a * a * d * d
                + 18 * a * b * c * d;
        keyboard.close();

        if (discriminant > 0) {
            System.out.println("There is 3 distinct real roots");
        } else if (discriminant == 0) {
            System.out.println("All roots are equal, and at least 2 are repeated");
        } else {
            System.out.println("There is 1 real root and 2 complex conjugate roots");
        }

        double root1 = -(b / (3 * a)) - (1 / (3 * a)
                * Math.cbrt((1 / 2) * (2 * b * b * b - 9 * a * b * c + 27 * a * a * d
                        + Math.sqrt(Math.pow((2 * b * b * b - 9 * a * b * c + 27 * a * a * d), 2)
                                - 4 * Math.pow((b * b - 3 * a * c), 3)))));
        System.out.println(root1);
    }
}
