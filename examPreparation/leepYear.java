import java.util.Scanner;

public class leepYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leepYear = sc.nextInt();
        if (leepYear % 400 == 0 || (leepYear % 4 == 0 && leepYear % 100 != 0)) {
            System.out.println("This is a leap year");
        } else
            System.out.println("This is a not leap year");
    }
}
