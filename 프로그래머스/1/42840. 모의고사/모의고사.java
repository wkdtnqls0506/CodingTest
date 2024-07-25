/*
    1. 1번, 2번, 3번 수포자의 찍기 패턴 파악
        - 특정 패턴이 있으면 배열에 미리 저장해두어도 됨
    2. 각 수포자들의 패턴과 answers 배열 비교
    3. 점수가 가장 높은 수포자 번호를 배열에 담아서 return
    -> 시간복잡도: O(N) 
*/

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] number1 = {1, 2, 3, 4, 5};
        int[] number2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] number3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == number1[i % number1.length]) score[0]++;
            if(answers[i] == number2[i % number2.length]) score[1]++;
            if(answers[i] == number3[i % number3.length]) score[2]++;
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            if (max == score[i]) answer.add(i+1);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}