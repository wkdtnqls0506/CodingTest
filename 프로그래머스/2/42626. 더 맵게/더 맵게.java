import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int num : scoville) {
            pq.add(num);
        }
        
        while(K > pq.peek()) {
            if (pq.size() < 2) return -1;
            pq.add(pq.poll() + pq.poll() * 2);
            answer++;
        }
        return answer;
    }
}