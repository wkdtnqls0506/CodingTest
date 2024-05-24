class Solution {
    public int solution(int number, int limit, int power) {
        int[] size = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                size[i * j]++;
            }
        }
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if(size[i] > limit) answer += power;
            else answer += size[i];
        }
        return answer;
    }
}