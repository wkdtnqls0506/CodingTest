class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] arr = s.toCharArray();
        for (int i=0; i < arr.length; i++) {
            answer[i] = -1;
            for (int j=i-1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    answer[i] = i-j;
                    break;
                }
            }
        }
        return answer;
    }
}