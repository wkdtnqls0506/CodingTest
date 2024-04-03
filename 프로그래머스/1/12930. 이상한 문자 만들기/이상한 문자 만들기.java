class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ", -1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                String stringArr = String.valueOf(arr[i].charAt(j));
                if (j % 2 == 0) answer += stringArr.toUpperCase();
                else answer += stringArr.toLowerCase();
            }
            if (i < arr.length - 1) {
                answer += " ";
            }
        }
        return answer;
    }
}