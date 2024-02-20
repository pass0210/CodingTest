import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] stringNumbers = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        Arrays.sort(stringNumbers, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                while (true) {
                    if(a.length() ==  b.length())
                        return b.compareTo(a);
                    if(a.length() <  b.length()) {
                        for (int i = 0; i < a.length(); i++) {
                            if (a.charAt(i) != b.charAt(i))
                                return b.substring(i, i + 1).compareTo(a.substring(i, i + 1));
                        }
                        b = b.substring(a.length());
                    }
                    if(a.length() >  b.length()) {
                        for (int i = 0; i < b.length(); i++) {
                            if (a.charAt(i) != b.charAt(i))
                                return b.substring(i, i + 1).compareTo(a.substring(i, i + 1));
                        }
                        a = a.substring(b.length());
                    }
                }
            }
        });
        
        if (stringNumbers[0].charAt(0) == '0')
            return "0";
        
        return String.join("", stringNumbers);
    }
}