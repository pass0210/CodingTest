import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        Integer[] intArray = new Integer[26];

        Map<Integer, Integer> alphaMap = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            intArray[i] = 0;
            alphaMap.put('a' + i, i);
        }

        try (Scanner scanner = new Scanner(System.in)) {
            String inputString = scanner.next();
            for (int i = 0; i < inputString.length(); i++) {
                int c = inputString.charAt(i);
                int index = alphaMap.get(c);
                intArray[index]++;
            }
        }

        System.out.println(Arrays.stream(intArray).map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
