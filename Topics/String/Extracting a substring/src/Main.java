import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();

        System.out.println(myString.substring(startNumber, ++endNumber));

    }
}