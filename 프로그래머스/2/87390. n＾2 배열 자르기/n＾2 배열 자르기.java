class Solution {
    public int[] solution(int n, long left, long right) {
        int length = (int)(right - left + 1);
        int[] answer = new int[length];
        for (long i = left; i <= right; i++) {
            int row = (int)(i / n) + 1;
            int col = (int)(i % n) + 1;
            answer[(int)(i - left)] = Math.max(row, col);
        }
        return answer;
    }
}