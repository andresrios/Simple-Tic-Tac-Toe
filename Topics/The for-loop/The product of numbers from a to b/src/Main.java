import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = 1;
        for (; a < b; a++) {
            n *= a;
        }
        System.out.println(n);
    }
}