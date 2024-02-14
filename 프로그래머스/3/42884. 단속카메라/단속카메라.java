import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;

        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]);
            }
        });

        int cameraIndex = Integer.MIN_VALUE;
        for (int i = 0; i < routes.length; i++) {
            if (!(routes[i][0] <= cameraIndex && routes[i][1] >= cameraIndex)) {
                cameraIndex = routes[i][1];
                answer++;
            }
        }

        return answer;
    }
}