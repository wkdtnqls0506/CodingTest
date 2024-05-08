class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char[] chArr = control.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == 'w') answer += 1;
            else if (chArr[i] == 's') answer -= 1;
            else if (chArr[i] == 'd') answer += 10;
            else answer -= 10;
        }
        return answer;
    }
}