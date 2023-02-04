import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter the number of students in Group 1: ");
        int group1 = scanner.nextInt();
        // System.out.println("Enter the number of students in Group 2: ");
        int group2 = scanner.nextInt();
        // System.out.println("Enter the number of students in Group 3: ");
        int group3 = scanner.nextInt();

        int minNumberOfDesks = group1 / 2 + group1 % 2 + group2 / 2 + group2 % 2 + group3 / 2 + group3 % 2;

        System.out.println(minNumberOfDesks);
    }
}