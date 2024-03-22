import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            int length = scanner.nextInt();
            int[] intArray = new int[length];
            for (int i = 0; i < length; i++) {
                intArray[i] = scanner.nextInt();
            }
            int selectNum = scanner.nextInt();

            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] == selectNum) {
                    answer++;
                }
            }

            System.out.println(answer);
        }
    }
}
