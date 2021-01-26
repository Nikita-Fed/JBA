import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        partition(n);
    }

    public static void partition(int n) {
        partition(n, n, "");
    }

    public static void partition(int n, int max, String prefix) {
        if (n == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 1; i <= Math.min(max, n); i++) {
            partition(n - i, i, prefix + " " + i);
        }
    }
}