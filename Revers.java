import  java.util.Scanner;

/**
 * Revers
 */
public class Revers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number >= 1) {
            number--;
            System.out.println(number);
        }
    }
}