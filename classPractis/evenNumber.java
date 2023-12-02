
/**
 * evenNumber
 */
import java.util.Scanner;

public class evenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the input number");
        int Total_num = sc.nextInt();
        for (int i = 0; i <= Total_num; i = i + 2) {
            sum = sum + i;
            System.err.println(" 2+ 4 + 6 ....." + i);
        }
        System.out.println("total value" + sum);
    }
}