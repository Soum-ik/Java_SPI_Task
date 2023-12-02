/**
 * PrimeNumber
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int i, j;
        for (i = 2; i < 25; i++) {
            for (j = 2; j < i; j++) {
                if (i % 2 == 0) {
                    break;
                }
            }
            if (i == j) {

                System.out.print(" " + i + " \n");
            }
        }
    }
}