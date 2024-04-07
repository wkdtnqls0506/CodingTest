class Solution {
    public int solution(int n) {
        StringBuffer ternary = new StringBuffer(Integer.toString(n,3));
        int answer = Integer.parseInt(ternary.reverse().toString(), 3);
        return answer;
    }
}