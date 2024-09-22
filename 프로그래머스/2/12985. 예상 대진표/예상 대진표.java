class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        while(Math.abs(a - b) >= 1) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }
        return answer;
    }
}