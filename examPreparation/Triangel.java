import java.util.Scanner;

public class Triangel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println("enter the value of c");
        int c = sc.nextInt();

        if ((a + b) > c && (c + b) > a && (c + a) > b) {
            int s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("triangle area is" + " " +  area);
        } else {
            System.out.println("triangle area is not possiable");

        }
    }
}
