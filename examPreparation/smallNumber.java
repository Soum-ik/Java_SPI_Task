import java.util.Scanner;

public class smallNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println("enter the value of  c");
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println(" is small");
        } else if (b < c && b < a) {
            System.out.println("c is small");
        } else {
            System.out.println("c is small");

        }
    }
}
