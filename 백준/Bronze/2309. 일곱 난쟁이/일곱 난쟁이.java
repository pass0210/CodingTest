import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] heightArray = new int[9];
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            heightArray[i] = scanner.nextInt();
            num += heightArray[i];
        }
        num -= 100;

        boolean flag = true;
        for (int i = 0; i < 8 && flag; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (heightArray[i] + heightArray[j] == num) {
                    heightArray[i] = 0;
                    heightArray[j] = 0;
                    flag = false;
                    break;
                }
            }
        }

        Arrays.sort(heightArray);
        for (int i = 2; i < 9; i++) {
            System.out.println(heightArray[i]);
        }
    }
}