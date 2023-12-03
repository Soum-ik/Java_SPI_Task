public class fibona {
    public static void main(String[] args) {
        int f0 = 0, f1 = 1, n = 10, f;

        for (int i = 0; i <= n; i++) {
            f = f0 + f1;
            System.out.println(f + "\t");
            f1 = f0;
            f0 = f;
        }
    }
}
