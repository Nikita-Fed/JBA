import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 0;
        String result = null;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                counter++;
                if (counter == n) break;
            }
//            System.out.print(counter + "qq ");
            if (counter == n) break;
        }
    }
}