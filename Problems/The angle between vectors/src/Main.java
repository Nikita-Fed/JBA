import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int mulpl = a * c + b * d;

        double firstMod = Math.hypot(a, b);
        double secMod = Math.hypot(c, d);
        double cos = (mulpl / (firstMod * secMod));

        System.out.println(Math.toDegrees(Math.acos(cos)));
    }
}