class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += (price * i);
        }
        return money - sum < 0 ? (money - sum) * -1 : 0;
    }
}

// 1. 등차수열의 합 공식 사용하기
// 2. Math.max()를 사용하면 0과 비교하는 조건문없이 작성 가능