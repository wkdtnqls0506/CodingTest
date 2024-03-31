class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt++;
            }
            if (cnt % 2 == 0) sum += i;
            else sum -= i;
        }
        return sum;
    }
}

// ⭐️ 아이디어
// 1. 제곱수인 경우 약수의 개수가 홀수
// 2. 제곱수가 아닐 경우 약수의 개수가 짝수
// -> Math.sqrt()를 사용하여 풀이해보기