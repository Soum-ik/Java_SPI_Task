import java.util.Scanner;

public class CircelRedious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of cricel");
        int r = sc.nextInt();
        double Area = Math.PI * r * r;
        System.out.println("Redious of the circel " + " " + Area);
    }
}
