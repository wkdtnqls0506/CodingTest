class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        char[] arr = s.toCharArray();
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < arr.length; i++) {
                if (Character.getNumericValue(arr[i]) > 9) {
                    answer = false;
                    break;
                }
                else answer = true;
            }   
        }
        return answer;
    }
}

// if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
// return false;