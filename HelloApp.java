
/**
 * HelloApp
 */
class Over {
    int cel(int x, int y) {
        int z = x + y;
        System.out.println("result print here" + z);
        return 0;
    }

    int cel(int z) {
        System.out.println("result print here" + z);
        return 0;
    }
}

public class HelloApp {

    public static void main(String[] args) {
        Over result = new Over();

        result.cel(10, 20);
        result.cel(10);
    }
}