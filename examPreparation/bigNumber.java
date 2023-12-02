import java.util.Scanner;

/**
 * bigNumber
 */
public class bigNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a is big");
        } else {
            System.out.println("b is big");

        }
    }
}