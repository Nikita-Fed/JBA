import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int temp = array[size - 1];
        int[] array2 = new int[size];
        for (int i = 1; i < size; i++) {
            array2[i] = array[i - 1];
        }
        array2[0] = temp;
        for (int x: array2) {
            System.out.print(x + " ");
        }
    }
}