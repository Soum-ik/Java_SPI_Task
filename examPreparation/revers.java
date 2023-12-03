public class revers {
    public static void main(String[] args) {
        int n = 32983, r;
        while (n > 0) {
            r = n % 10;
            System.out.println(r);
            n = n / 10;
        }
    }
}
