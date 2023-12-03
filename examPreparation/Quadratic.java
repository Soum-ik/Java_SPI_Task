import java.util.Scanner;
import java.lang.Math;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2;
        System.out.println("enter the of value a ");
        int a = sc.nextInt();
        System.out.println("enter the of value b ");
        int b = sc.nextInt();
        System.out.println("enter the of value c ");
        int c = sc.nextInt();

        int d = (b * b - 4 * a * c);
        if (d > 0) {
            x1 = -b + Math.sqrt(d) / 2 * a;
            x2 = -b - Math.sqrt(d) / 2 * a;
            System.out.println("root are real " + x1 + " " + x2);
        } else if (d == 0) {
            x1 = x2 = -b / 2 * a;
            System.out.println("root are equal" + x1);
        } else {
            System.out.println("root are not possiable");
        }
    }
}
