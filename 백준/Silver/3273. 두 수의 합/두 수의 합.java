import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        try (Scanner scanner = new Scanner(System.in)) {
            int volume = scanner.nextInt();
            Integer[] array = new Integer[volume];
            for (int i = 0; i < volume; i++) {
                array[i] = scanner.nextInt();
            }
            int sumNum = scanner.nextInt();

            for (int i = 0; i < array.length; i++) {
                answer += map.getOrDefault(sumNum - array[i], 0);
                map.put(array[i], map.getOrDefault(array[i], 0) + 1);
            }

            System.out.println(answer);
        }
    }
}
