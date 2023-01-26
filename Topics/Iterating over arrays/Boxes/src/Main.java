import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] box1 = new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int[] box2 = new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        Arrays.sort(box1);
        Arrays.sort(box2);

        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < box1.length; i++) {
            if (box1[i] < box2[i]) {
                counter1++;
            }
        }

        for (int i = 0; i < box1.length; i++) {
            if (box1[i] > box2[i]) {
                counter2++;
            }
        }

        if (counter1 == 3) {
            System.out.println("Box 1 < Box 2");
        } else if (counter2 == 3) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}
