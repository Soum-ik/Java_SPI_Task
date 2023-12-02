import java.util.Scanner;

public class RootNumber {
    public static void main(String[] Strings) {
        double a, b, c, D, r1, r2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of a: ");
            a = sc.nextDouble();
            System.out.print("Enter the value of b: ");
            b = sc.nextDouble();
            System.out.print("Enter the value of c: ");
            c = sc.nextDouble();
        }
        D = b * b - 4.0 * a * c;
        if (D > 0.0) {
            r1 = (-b + Math.pow(D, 0.5)) / (2.0 * a);
            r2 = (-b - Math.pow(D, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (D == 0.0) {
            r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("Roots are not real.");
        }
    }
}
