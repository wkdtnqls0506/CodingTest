class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            Long num = Long.parseLong(t.substring(i, i + p.length()));
            if (num <= Long.parseLong(p)) answer++;
        }
        return answer;
    }
}

// Integer.parseInt()는 최대 10자리까지 지원하므로, Long 타입으로 선언해주어야 런타임 에러가 발생하지 않음.