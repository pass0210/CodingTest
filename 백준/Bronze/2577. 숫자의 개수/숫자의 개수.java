import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        int[] intArray = new int[10];

        try (Scanner scanner = new Scanner(System.in)) {
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();
            int thirdNum = scanner.nextInt();
            int totalNum = firstNum * secondNum * thirdNum;
            String numString = String.valueOf(totalNum);
            for (int i = 0; i < numString.length(); i++) {
                int index = numString.charAt(i) - '0';
                intArray[index]++;
            }

            for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);
            }
        }
    }
}
