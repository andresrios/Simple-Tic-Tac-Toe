package tictactoe;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.next();
        System.out.println("> " + values);
        System.out.println("---------");
        System.out.println("| " + values.charAt(0) + " " + values.charAt(1) + " " + values.charAt(2) + " |");
        System.out.println("| " + values.charAt(3) + " " + values.charAt(4) + " " + values.charAt(5) + " |");
        System.out.println("| " + values.charAt(6) + " " + values.charAt(7) + " " + values.charAt(8) + " |");
        System.out.println("---------");
    }
}
