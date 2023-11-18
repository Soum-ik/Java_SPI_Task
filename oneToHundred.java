
public class oneToHundred {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
            System.err.println(" 1+2+3 ....." + i + " sum ="+ sum);
        }
        System.out.println("total value" + sum);
    }
}