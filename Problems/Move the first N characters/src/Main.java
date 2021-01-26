import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        String text = new String(array[0]);
        int n = Integer.parseInt(array[1]);
        String result = "";

        if (n >= text.length()) System.out.println(text);
        else result = text.substring(n) + text.substring(0,n);
        System.out.println(result);
    }

}