class Solution {
    public long solution(long n) {
        long number = (int)Math.sqrt(n);
        if (number * number == n) return (number + 1) * (number + 1);
        else return -1;
    }
}