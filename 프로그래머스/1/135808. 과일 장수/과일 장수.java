import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Integer[] list = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(list, Collections.reverseOrder());
        
        for(int i = 0; i < list.length; i++) {
            if((i + 1) % m == 0) answer += (list[i] * m);
        }
        return answer;
    }
}