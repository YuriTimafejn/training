package HackerRank;

import java.util.*;

class JavaLoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            calculate(a, b, n);
        }
        in.close();
    }

    public static void calculate(int a, int b, int n) {
        // a + 2^0 * b, a + 2^0 * b + 2^1 *b , ... , a + 2^0 * b + ...
        int result = a;

        for (int i = 0; i < n; i++) {
            result += Math.pow(2, i) * b;
            System.out.println(result + " ");
        }
        System.out.println();
    }
}