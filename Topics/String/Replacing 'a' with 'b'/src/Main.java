import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int size = input.length();

        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != 'a') {
                System.out.print(input.charAt(i));
            } else {
                System.out.print('b');
            }
        }
    }
}