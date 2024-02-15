class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dh = new int[]{0, 1, -1, 0};
        int[] dw = new int[]{1, 0, 0, -1};

        String col = board[h][w];
        for (int i = 0; i < dh.length; i++) {
            int mh = h + dh[i];
            int my = w + dw[i];
            if ((0 <= h + dh[i] &&
                    board.length > h + dh[i] &&
                    0 <= w + dw[i] &&
                    board[h].length > w + dw[i]) &&
                    col.equals(board[h + dh[i]][w + dw[i]])) {
                answer++;
            }
        }
        return answer;
    }
}