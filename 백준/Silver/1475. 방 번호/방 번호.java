import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        int[] intArray = new int[10];

        try (Scanner scanner = new Scanner(System.in)) {
            String inputString = scanner.next();
            for (int i = 0; i < inputString.length(); i++) {
                int index = inputString.charAt(i) - '0';
                intArray[index]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i != 6 && i != 9) {
                answer = Math.max(answer, intArray[i]);
            }
        }

        System.out.println(Math.max(answer, Math.round((float) (intArray[6] + intArray[9]) / 2)));
    }
}
