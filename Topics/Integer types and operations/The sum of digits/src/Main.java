import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int hundredNumber = 100;
        final int tenNumber = 10;

        int numberToParse = scanner.nextInt();
        int firstDigit = numberToParse / hundredNumber;
        int secondDigit = numberToParse % hundredNumber / tenNumber;
        int thirdDigit = numberToParse % hundredNumber % tenNumber;

        int result = firstDigit + secondDigit + thirdDigit;

        System.out.println(result);

    }
}