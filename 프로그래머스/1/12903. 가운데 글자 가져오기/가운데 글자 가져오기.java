class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        int l = s.length();
        if (s.length() % 2 != 0) return String.valueOf(ch[l / 2]);
        else return String.valueOf(ch[l / 2 - 1]) + String.valueOf(ch[l / 2]);
    }
}

// substring() 활용해서 푸는 방법 ⭐️