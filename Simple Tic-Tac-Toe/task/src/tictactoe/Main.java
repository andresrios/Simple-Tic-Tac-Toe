package tictactoe;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueOfX = 264;
        int valueOfO = 237;
        int emptyCounter = 0;
        int xCounter = 0;
        int oCounter = 0;
        boolean xWins = false;
        boolean oWins = false;

        String values = scanner.next();
        System.out.println("> " + values);
        System.out.println("---------");
        System.out.println("| " + values.charAt(0) + " " + values.charAt(1) + " " + values.charAt(2) + " |");
        System.out.println("| " + values.charAt(3) + " " + values.charAt(4) + " " + values.charAt(5) + " |");
        System.out.println("| " + values.charAt(6) + " " + values.charAt(7) + " " + values.charAt(8) + " |");
        System.out.println("---------");

        for (int i = 0; i < 9; i++) {
            if (values.charAt(i) == '_') {
                emptyCounter++;
            }
            if (values.charAt(i) == 'X'){
                xCounter++;
            }
            if (values.charAt(i) == 'O'){
                oCounter++;
            }
        }

        int line1 = values.charAt(0) + values.charAt(1) + values.charAt(2);
        int line2 = values.charAt(3) + values.charAt(4) + values.charAt(5);
        int line3 = values.charAt(6) + values.charAt(7) + values.charAt(8);

        int col1 = values.charAt(0) + values.charAt(3) + values.charAt(6);
        int col2 = values.charAt(1) + values.charAt(4) + values.charAt(7);
        int col3 = values.charAt(2) + values.charAt(5) + values.charAt(8);

        int diagonal1 = values.charAt(0) + values.charAt(4) + values.charAt(8);
        int diagonal2 = values.charAt(2) + values.charAt(4) + values.charAt(6);

        if (line1 == valueOfX || line2 == valueOfX || line3 == valueOfX ||
                col1 == valueOfX || col2 == valueOfX || col3 == valueOfX ||
                diagonal1 == valueOfX || diagonal2 == valueOfX) {
            xWins = true;
        }
        if (line1 == valueOfO || line2 == valueOfO || line3 == valueOfO ||
                col1 == valueOfO || col2 == valueOfO || col3 == valueOfO ||
                diagonal1 == valueOfO || diagonal2 == valueOfO) {
            oWins = true;
        }

        if (xWins == true && oWins == false) {
            System.out.println("X wins");
        } else if (xWins == false && oWins == true) {
            System.out.println("O wins");
        } else if (xWins == false && oWins == false && emptyCounter == 0) {
            System.out.println("Draw");
        } else if (xWins == false && oWins == false && emptyCounter > 0) {
            if (xCounter - oCounter == 1 || oCounter - xCounter == 1 || xCounter - oCounter == 0 ||
                    oCounter - xCounter == 0) {
                System.out.println("Game not finished");
            } else {
                System.out.println("Impossible");
            }
        } else {
            System.out.println("Impossible");
        }

    }
}
