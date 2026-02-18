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
        
        /* double p = (3 * a * c - b * b) / (3 * a * a);
        double q = (2 * b * b - 9 * a * b * c + 27 * a * a * d) / (27 * a * a * a);

        double depressed_discriminant = 4 * p * p * p + 27 * q * q * q;
        if (p == 0) {
            System.out.println("There is one triple root at x = 0");
        } else if (depressed_discriminant == 0) {
            double root1 = (3 * q / p) - b / 3 * a;
            double root2 = -(3 * q / 2 * p) - b / 3 * a;
            System.out.println("There is a root at " + root1 + ", and a repeated root at " + root2);
        } */
        
        
        if (-(b) == 3*a) {
            System.out.println("There is a triple root at " + -(b/(3*a)));
        } else {
            double root1 = (9*a*d - b*c) / (a * (b*b - 3*a*c));
        }
    }
}
