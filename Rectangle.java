import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Length");
        int Length = sc.nextInt();
        System.out.println("Enter the value of wide");
        int wide = sc.nextInt();
        int Area = Length * wide;
        System.out.println("Area of triangle" + Area);
    }
}
