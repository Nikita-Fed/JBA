import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] cineMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cineMatrix[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();

        int row = -1;

        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = 0; j < m; j++) {
                if (cineMatrix[i][j] == 0) {
                    counter++;
                } else counter = 0;
                if (counter == k) {
                    row = i;
                    break;
                }
            }
            if (row >= 0) break;
        }
        if (row >= 0) {
            System.out.println(row + 1);
        } else System.out.println(0);
    }
}
class Test {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        char[] array2 = new char[-1];
        char[] array3 = new char[0];
        char[] array4 = new char[1];
        char[] array5 = { 'a', 'b', 'c', 'd' };
        System.out.println(array2);
    }
}